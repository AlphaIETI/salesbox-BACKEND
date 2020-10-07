package edu.eci.ieti.salesbox.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.ArrayList;



@Document
public class Product {

    @Id
    private String id;
    private String brand;
    private String description;
    private String color;
    private int price;
    private ArrayList<String> size;

    public Product(String id, String brand, String description, String color, int price, ArrayList<String> size) {
        this.id = id;
        this.brand = brand;
        this.description = description;
        this.color = color;
        this.price = price;
        this.size = size;
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ArrayList<String> getSize() {
        return size;
    }

    public void setSize(ArrayList<String> size) {
        this.size = size;
    }
}
