package edu.eci.ieti.salesbox.controllers;
import edu.eci.ieti.salesbox.models.Coupon;
import edu.eci.ieti.salesbox.services.impl.CouponServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.time.*;
import java.util.List;
import java.util.UUID;
import java.util.Hashtable;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin(origins = {"https://salesbox-alpha.herokuapp.com","http://localhost:3000"})
public class CouponController {

    @Autowired
    CouponServiceImpl couponService;

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
    public Coupon createCoupon(@RequestBody Coupon newCoupon) {
        UUID uuid=UUID.randomUUID();
        LocalDate ld = LocalDate.now(); 
        LocalDate end = ld.plusDays(10); 
        int percentage = (int)(Math.random()*(25-10+1)+10);
        Hashtable<Integer,String> percentageimage = new Hashtable<Integer,String>();
        percentageimage.put(10,"https://res.cloudinary.com/ds6sg7twl/image/upload/v1606348423/10_2_fvkrxa.jpg");
        percentageimage.put(11,"https://res.cloudinary.com/ds6sg7twl/image/upload/v1606348334/10_1_yvkayf.jpg");
        percentageimage.put(12,"https://res.cloudinary.com/ds6sg7twl/image/upload/v1606348421/10_3_dy2hpu.jpg");
        percentageimage.put(13,"https://res.cloudinary.com/ds6sg7twl/image/upload/v1606348792/10_4_uufis3.jpg");
        percentageimage.put(14,"https://res.cloudinary.com/ds6sg7twl/image/upload/v1606348791/10_5_rv11sl.jpg");
        percentageimage.put(15,"https://res.cloudinary.com/ds6sg7twl/image/upload/v1606348787/10_zo4eex.png");
        percentageimage.put(16,"https://res.cloudinary.com/ds6sg7twl/image/upload/v1606348787/10_zo4eex.png");
        percentageimage.put(17,"https://res.cloudinary.com/ds6sg7twl/image/upload/v1606348784/10_7_nwvwea.jpg");
        percentageimage.put(18,"https://res.cloudinary.com/ds6sg7twl/image/upload/v1606348781/10_8_mye7yo.jpg");
        percentageimage.put(19,"https://res.cloudinary.com/ds6sg7twl/image/upload/v1606348780/10_9_ugd4bq.jpg");
        percentageimage.put(20,"https://res.cloudinary.com/ds6sg7twl/image/upload/v1606350401/10_15_x5sjgz.jpg");
        percentageimage.put(21,"https://res.cloudinary.com/ds6sg7twl/image/upload/v1606350319/10_10_gwl20x.jpg");
        percentageimage.put(22,"https://res.cloudinary.com/ds6sg7twl/image/upload/v1606350317/10_11_ioxynv.jpg");
        percentageimage.put(23,"https://res.cloudinary.com/ds6sg7twl/image/upload/v1606350314/10_12_nkhzrw.jpg");
        percentageimage.put(24,"https://res.cloudinary.com/ds6sg7twl/image/upload/v1606350312/10_13_tfg8ln.jpg");
        percentageimage.put(25,"https://res.cloudinary.com/ds6sg7twl/image/upload/v1606350311/10_14_xhwivb.jpg");
        String i = percentageimage.get(percentage);
        System.out.println(i);
        newCoupon.setId(uuid.toString());
        newCoupon.setEndDate(end.toString());
        newCoupon.setPercentage(percentage);
        newCoupon.setImage(i);
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
