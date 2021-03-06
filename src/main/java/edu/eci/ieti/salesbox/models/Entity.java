package edu.eci.ieti.salesbox.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document
public class Entity {

    @Id
    private String id;
    private String name;
    private String nit;
    private String email;
    private String password;
    private String phone;
    private String city;
    private String address;
    private String image;
    private int publicity;
    private ArrayList<String> orders;

    public Entity(String id, String name, String nit,String email, String password,String phone, String city, String address, String image, int publicity){

        this.id=id;
        this.name=name;
        this.nit=nit;
        this.email=email;
        this.password=password;
        this.phone=phone;
        this.city=city;
        this.address=address;
        this.image=image;
        this.publicity=publicity;
        this.orders = new ArrayList<>();


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

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getPublicity() { return publicity; }

    public void setPublicity(int publicity) { this.publicity = publicity; }

    public ArrayList<String> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<String> orders) {
        this.orders = orders;
    }
}
