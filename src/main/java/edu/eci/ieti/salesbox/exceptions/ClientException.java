package edu.eci.ieti.salesbox.exceptions;

public class ClientException extends Exception{

    public static String  ENTITY_NOT_FOUND= "THE CLIENT WAS NOT FOUND";
    public static String  ENTITY_ALREDY_EXISTS="THE CLIENT ALREDY EXISTS";

    public ClientException(String message){
        super(message);
    }

    public ClientException(String message, String Add_Info){
        super(message+" Info: "+Add_Info);
    }


}
