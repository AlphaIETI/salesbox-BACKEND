package edu.eci.ieti.salesbox.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.ArrayList;



@Document
public class Product {

    @Id
    private String id;
    private String name;
    private String brand;
    private String description;
    private ArrayList<String> colors;
    private int price;
    private int discount;
    private String image;
    private ArrayList<String> size;
    private String category;
    private String gender;
    private int stockAvailable;

    public Product(String id, String name, String brand, String description, ArrayList<String> colors, int price, int discount, String image, ArrayList<String> size, String category, String gender, int stockAvailable) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.description = description;
        this.colors = colors;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public ArrayList<String> getColors() {
        return colors;
    }

    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
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
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", description='" + description + '\'' +
                ", colors=" + colors +
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
