package edu.eci.ieti.salesbox.controllers;
import edu.eci.ieti.salesbox.models.Coupon;
import edu.eci.ieti.salesbox.services.impl.CouponServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.time.*;
import java.util.List;
import java.util.UUID;

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
        int percentage = (int)(Math.random()*(30-10+1)+10);
        newCoupon.setId(uuid.toString());
        newCoupon.setEndDate(end.toString());
        newCoupon.setPercentage(percentage);
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
