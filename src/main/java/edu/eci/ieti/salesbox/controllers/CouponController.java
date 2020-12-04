package edu.eci.ieti.salesbox.controllers;
import edu.eci.ieti.salesbox.models.Coupon;
import edu.eci.ieti.salesbox.models.Client;
import edu.eci.ieti.salesbox.services.impl.CouponServiceImpl;
import edu.eci.ieti.salesbox.services.impl.ClientServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import edu.eci.ieti.salesbox.exceptions.ClientException;
import java.time.*;
import java.util.List;
import java.util.UUID;
import java.util.Hashtable;
import java.util.ArrayList;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin(origins = {"https://salesbox-alpha.herokuapp.com","http://localhost:3000","http://localhost"})
public class CouponController {

    @Autowired
    CouponServiceImpl couponService;

    @Autowired
    ClientServicesImpl clientService;

    @GetMapping("/coupons")
    public List<Coupon> getAllCoupons() {
        return couponService.getAllCoupons();
    }

    @GetMapping("/coupons/{id}")
    public Coupon getCouponById(@PathVariable("id") String id) {
        return couponService.getCouponById(id);
    }

    @GetMapping("/coupons/id/{clientId}")
    public List<Coupon> getCouponsByClientId(String clientId){
        return couponService.getCouponsByClientId(clientId);
    }

    @PostMapping("/coupons")
    public Coupon createCoupon(@RequestBody Coupon newCoupon) throws ClientException{
        UUID uuid=UUID.randomUUID();
        LocalDate ld = LocalDate.now(); 
        LocalDate end = ld.plusDays(10); 
        int percentage = (int)(Math.random()*(25-10+1)+10);
        Hashtable<Integer,String> percentageimage = new Hashtable<Integer,String>();
        percentageimage.put(5,"https://res.cloudinary.com/ds6sg7twl/image/upload/v1607043988/10_16_mlwlob.jpg");
        percentageimage.put(6,"https://res.cloudinary.com/ds6sg7twl/image/upload/v1607043987/10_17_yxzdzz.jpg");
        percentageimage.put(7,"https://res.cloudinary.com/ds6sg7twl/image/upload/v1607043987/10_18_s3si23.jpg");
        percentageimage.put(8,"https://res.cloudinary.com/ds6sg7twl/image/upload/v1607043987/10_19_vybhzq.jpg");
        percentageimage.put(9,"https://res.cloudinary.com/ds6sg7twl/image/upload/v1607043987/10_20_vxskxd.jpg");
        percentageimage.put(10,"https://res.cloudinary.com/ds6sg7twl/image/upload/v1606348423/10_2_fvkrxa.jpg");
        String i = percentageimage.get(percentage);
        newCoupon.setId(uuid.toString());
        newCoupon.setEndDate(end.toString());
        newCoupon.setPercentage(percentage);
        newCoupon.setImage(i);
        Client c = clientService.getClientById(newCoupon.getClientId());
        ArrayList couponsNew = c.getCoupons();
        couponsNew.add(newCoupon.getId());
        c.setCoupons(couponsNew);
        clientService.insertClient(c);
        return couponService.createCoupon(newCoupon);
    }

    
    @PutMapping("/coupons/id/{id}")
    public Coupon updateCoupon(@RequestBody Coupon updateCoupon, @PathVariable("id") String id) {
        return couponService.updateCoupon(updateCoupon,id);
    }

    @DeleteMapping("/coupons/id/{id}")
    public void removeCoupon(@PathVariable String id) {
        couponService.removeCoupon(id);
    }
}
