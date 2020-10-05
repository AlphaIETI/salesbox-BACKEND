package edu.eci.ieti.salesbox.exceptions;

public class EntityException extends Exception {
    public static String  ENTITY_NOT_FOUND= "THE ENTITY WAS NOT FOUND";
    public static String  ENTITY_ALREDY_EXISTS="THE ENTITY ALREDY EXISTS";

    public EntityException(String message){
        super(message);
    }

    public EntityException(String message, String Add_Info){
        super(message+" Info: "+Add_Info);
    }


}
