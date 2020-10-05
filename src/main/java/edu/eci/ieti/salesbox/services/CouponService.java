package edu.eci.ieti.salesbox.services;

import edu.eci.ieti.salesbox.models.Coupon;

import java.util.List;

public interface CouponService {

    public List<Coupon> getAllCoupons();
    public Coupon getCouponById(String id);
    public Coupon createCoupon(Coupon newCoupon);
    public Coupon updateCoupon(Coupon newCoupon);
    public void removeCoupon(String id);

}
