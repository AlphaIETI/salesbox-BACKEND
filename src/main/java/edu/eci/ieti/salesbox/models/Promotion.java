package edu.eci.ieti.salesbox.models;

import java.util.ArrayList;

public class Promotion {

    //Attributes

    private String id;
    private String brand;
    private String endDate;
    //private ArrayList<Product> products;
    private int discount;
    private String image;
    private String description;

    public Promotion(String id, String brand, String endDate, int discount, String image, String description) {
        this.id = id;
        this.brand = brand;
        this.endDate = endDate;
        //this.products = products;
        this.discount = discount;
        this.image = image;
        this.description = description;
    }

    //Methods


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /*
    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
    */

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
