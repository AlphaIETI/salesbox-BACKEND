package edu.eci.ieti.salesbox.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document
public class Order {

    @Id
    private String id;
    private ArrayList<String> idProducts;
    private String nameEntity;
    private String idClient;
    private String quantity;
    
    public Order(String id, String nameEntity, ArrayList<String> idProducts, String idClient, String quantity){
        
        this.id = id;
        this.idProducts = idProducts;
        this.nameEntity = nameEntity;
        this.idClient = idClient;
        this.quantity = quantity;
        
    }

    public String getId() {
        
        return id;
        
    }

    public void setId(String id) {
        
        this.id = id;
        
    }

    public ArrayList<String> getIdProducts() {
        
        return idProducts;
        
    }

    public void setIdProduct(ArrayList<String> idProducts) {
        
        this.idProducts = idProducts;
        
    }

    public String getNameEntity() {
        
        return nameEntity;
        
    }

    public void setNameEntity(String nameEntity) {
        
        this.nameEntity = nameEntity;
        
    }

    public String getIdClient() {
        
        return idClient;
        
    }

    public void setIdClient(String idClient) {
        
        this.idClient = idClient;
        
    }

    public String getQuantity() {
        
        return quantity;
        
    }

    public void setQuantity(String quantity) {
        
        this.quantity = quantity;
        
    }
}
