package edu.eci.ieti.salesbox.services.impl;

import edu.eci.ieti.salesbox.models.Coupon;
import edu.eci.ieti.salesbox.services.CouponService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CouponServiceImpl implements CouponService {

    private static ArrayList<Coupon> couponTests = new ArrayList<>(Arrays.asList(new Coupon("1",20,"Zara","endDate","img"),
                                                                            new Coupon("2",30,"H&M","endDate","img"),
                                                                            new Coupon("3",40,"Adidas","endDate","img"),
                                                                            new Coupon("4",50,"Nike","endDate","img"),
                                                                            new Coupon("5",60,"Bershka","endDate","img")));

    
    @Override
    public List<Coupon> getAllCoupons() {
        return couponTests;
    }

   @Override
    public Coupon getCouponById(String id) {
        Coupon resp = null;
        for(Coupon c: couponTests){
            if(c.getId().equals(id)){
                resp = c;
            }
        }
        return resp;
    }

    @Override
    public Coupon createCoupon(Coupon newCoupon) {
        couponTests.add(newCoupon);
        return newCoupon;
    }

    public Coupon updateCoupon(Coupon newCoupon) {
        return null;
    }

    @Override
    public void removeCoupon(String id) {
        for(int i=0 ;i<couponTests.size();i++){
            if (couponTests.get(i).getId().equals(id)){
                couponTests.remove(couponTests.get(i));
            }
        }

    }
}
