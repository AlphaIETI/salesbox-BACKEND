package edu.eci.ieti.salesbox.exceptions;

public class OrderException extends Exception {

    public static String  ORDER_NOT_FOUND= "THE ORDER WAS NOT FOUND";
    public static String  ORDER_ALREDY_EXISTS="THE ORDER ALREDY EXISTS";

    public OrderException(String message){
        super(message);
    }

    public OrderException(String message, String Add_Info){
        super(message+" Info: "+Add_Info);
    }
}
