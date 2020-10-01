package edu.eci.ieti.salesbox.models;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Product {

    private int id;
    private String brand;
    private String description;
    private String color;
    private int price;
    private List<String> size;

    public Product(int id, String brand, String description, String color, int price, List<String> size) {
        this.id = id;
        this.brand = brand;
        this.description = description;
        this.color = color;
        this.price = price;
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public List<String> getSize() {
        return size;
    }

    public void setSize(List<String> size) {
        this.size = size;
    }
}
