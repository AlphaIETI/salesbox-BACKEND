package edu.eci.ieti.salesbox.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document
public class Client {

    @Id
    private String id;
    private String name;
    private String lastname;
    private String email;
    private String password;
    private ArrayList<String> coupons;
    private String phone;
    private String address;
    private String age;
    private String sizeUp;
    private String sizeDown;
    private String shoeSize;
    private String gender;
    private ArrayList<String> cart ;
    private ArrayList<String> favorites ;
    private ArrayList<String> orders;




    public Client(String id, String name, String lastname, String email, String password, String phone, String address, String age, String sizeUp, String sizeDown, String shoeSize, String gender) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.coupons = new ArrayList<>();
        this.phone = phone;
        this.address = address;
        this.age = age;
        this.sizeUp = sizeUp;
        this.sizeDown = sizeDown;
        this.shoeSize = shoeSize;
        this.gender= gender;
        this.cart = new ArrayList<>();
        this.favorites = new ArrayList<>();
        this.orders = new ArrayList<>() ;
    }

    public String getId() {

        return id;

    }

    public String getName() {

        return name;

    }

    public String getLastname() {

        return lastname;

    }

    public String getEmail() {

        return email;

    }

    public String getPassword() {

        return password;

    }

    public ArrayList<String> getCoupons() {

        return coupons;

    }

    public String getPhone() {

        return phone;

    }

    public String getAddress() {

        return address;

    }

    public void setId(String id) {

        this.id = id;

    }

    public void setName(String name) {

        this.name = name;

    }

    public void setLastname(String lastname) {

        this.lastname = lastname;

    }

    public void setEmail(String email) {

        this.email = email;

    }

    public void setPassword(String password) {

        this.password = password;

    }

    public void setCoupons(ArrayList<String> coupons) {

        this.coupons = coupons;

    }

    public void setPhone(String phone) {

        this.phone = phone;

    }

    public void setAddress(String address) {

        this.address = address;

    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSizeUp() {
        return sizeUp;
    }

    public void setSizeUp(String sizeUp) {
        this.sizeUp = sizeUp;
    }

    public String getSizeDown() {
        return sizeDown;
    }

    public void setSizeDown(String sizeDown) {
        this.sizeDown = sizeDown;
    }

    public String getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(String shoeSize) {
        this.shoeSize = shoeSize;
    }

    public ArrayList<String> getCart() {
        return cart;
    }

    public void setCart(ArrayList<String> cart) {
        this.cart = cart;
    }

    public ArrayList<String> getFavorites() {
        return favorites;
    }

    public void setFavorites(ArrayList<String> favorites) {

        this.favorites = favorites;

    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public ArrayList<String> getOrders() {

        return orders;

    }

    public void setOrders(ArrayList<String> orders) {

        this.orders = orders;

    }

    @Override
    public String toString() {
        return "Client{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", coupons='" + coupons + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", age='" + age + '\'' +
                ", sizeUp='" + sizeUp + '\'' +
                ", sizeDown='" + sizeDown + '\'' +
                ", shoeSize='" + shoeSize + '\'' +
                ", cart=" + cart +
                ", favorites=" + favorites +
                '}';
    }
}
