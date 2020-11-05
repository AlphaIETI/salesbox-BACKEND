package edu.eci.ieti.salesbox.exceptions;

public class CouponException extends Exception {
    public static String  COUPON_NOT_FOUND= "THE COUPON WAS NOT FOUND";

    public CouponException(String message){
        super(message);
    }

    public CouponException(String message, String Add_Info){
        super(message+" Info: "+Add_Info);
    }


}
