package edu.eci.ieti.salesbox.controllers;
import edu.eci.ieti.salesbox.models.Coupon;
import edu.eci.ieti.salesbox.services.impl.CouponServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/coupons/id/{id}")
    public Coupon getCouponById(@PathVariable("id") String id) {
        return couponService.getCouponById(id);
    }

    @GetMapping("/coupons/id/{clientId}")
    public List<Coupon> getCouponsByClientId(String clientId){
        return couponService.getCouponsByClientId(clientId);
    }

    @PostMapping("/coupons")
    public Coupon createCoupon(@RequestBody Coupon newCoupon) {
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
