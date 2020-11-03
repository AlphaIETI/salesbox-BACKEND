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
    private int discount;
    private String image;
    private ArrayList<String> size;
    private String category;
    private String gender;
    private int stockAvailable;

    public Product(String id, String brand, String description, String color, int price, int discount, String image, ArrayList<String> size, String category, String gender, int stockAvailable) {
        this.id = id;
        this.brand = brand;
        this.description = description;
        this.color = color;
        this.price = price;
        this.discount = discount;
        this.image = image;
        this.size = size;
        this.category = category;
        this.gender = gender;
        this.stockAvailable = stockAvailable;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getStockAvailable() {
        return stockAvailable;
    }

    public void setStockAvailable(int stockAvailable) {
        this.stockAvailable = stockAvailable;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", brand='" + brand + '\'' +
                ", description='" + description + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", image='" + image + '\'' +
                ", size=" + size +
                ", category='" + category + '\'' +
                ", gender='" + gender + '\'' +
                ", stockAvailable=" + stockAvailable +
                '}';
    }
}
