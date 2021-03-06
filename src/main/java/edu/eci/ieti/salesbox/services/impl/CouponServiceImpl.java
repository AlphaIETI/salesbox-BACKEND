package edu.eci.ieti.salesbox.services.impl;

import edu.eci.ieti.salesbox.models.Coupon;
import edu.eci.ieti.salesbox.services.CouponService;
import edu.eci.ieti.salesbox.persistence.CouponRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.time.*;

@Service
public class CouponServiceImpl implements CouponService{


    @Autowired
    private CouponRepository couponRepository;
    
    @Override
    public List<Coupon> getAllCoupons() {
        return  couponRepository.findAll();
    }

   @Override
    public Coupon getCouponById(String id) {
        Optional<Coupon> resp = couponRepository.findById(id);
        return resp.get();
    }

    @Override
    public ArrayList<Coupon> getCouponsByClientId(String clientId){
        Optional <ArrayList<Coupon>> resp = couponRepository.findByClientId(clientId);
        return resp.get();
    }

    @Override
    public Coupon createCoupon(Coupon newCoupon) {
       return couponRepository.save(newCoupon);
    }

    public Coupon updateCoupon(Coupon newCoupon,String id) {
        return  couponRepository.save(newCoupon);
    }

    @Override
    public void removeCoupon(String id) {
        couponRepository.delete(couponRepository.findById(id).get());

    }

    
}
