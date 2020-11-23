package edu.eci.ieti.salesbox.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Order {

    @Id
    private String id;
    private String idProduct;
    private String idEntity;
    private String idClient;
    private String quantity;
    
    public Order(String id, String idProduct, String idEntity, String idClient, String quantity){
        
        this.id = id;
        this.idProduct = idProduct;
        this.idEntity = idEntity;
        this.idClient = idClient;
        this.quantity = quantity;
        
    }

    public String getId() {
        
        return id;
        
    }

    public void setId(String id) {
        
        this.id = id;
        
    }

    public String getIdProduct() {
        
        return idProduct;
        
    }

    public void setIdProduct(String idProduct) {
        
        this.idProduct = idProduct;
        
    }

    public String getIdEntity() {
        
        return idEntity;
        
    }

    public void setIdEntity(String idEntity) {
        
        this.idEntity = idEntity;
        
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
