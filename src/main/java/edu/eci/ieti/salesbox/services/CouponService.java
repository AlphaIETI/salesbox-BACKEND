package edu.eci.ieti.salesbox.services;

import edu.eci.ieti.salesbox.models.Coupon;

import java.util.List;

public interface CouponService {

    /**
     * Allows consult all the coupons.
     * @return  Returns all coupons.
     */
    public List<Coupon> getAllCoupons();

    /**
     * Allows consult a coupon by id
     * @param id Identifier of the coupon
     * @return  Returns the coupon with the respective id
     */
    public Coupon getCouponById(String id);

    /**
     * Create a new coupon
     * @param newCoupon represents the new coupon
     * @return  Returns the coupon that represent the new coupon
     */
    public Coupon createCoupon(Coupon newCoupon);

    /**
     * Update an existing coupon
     * @param newCoupon represents the update of the promotion
     * @param id identifier of the coupon
     * @return  Returns the coupon that represent the updated coupon
     */
    public Coupon updateCoupon(Coupon newCoupon, String id);

    /**
     * Remove an existing coupon
     * @param id identifier of the coupon
     */
    public void removeCoupon(String id);

}
