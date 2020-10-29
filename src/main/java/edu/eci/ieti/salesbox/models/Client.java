package edu.eci.ieti.salesbox.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Client {

    @Id

    private String id;
    private String name;
    private String lastname;
    private String email;
    private String password;
    private String coupons;
    private String phone;
    private String address;

    public Client(String id, String name, String lastname, String email, String password,String coupons,String phone, String address ) {

        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.coupons = coupons;
        this.phone = phone;
        this.address = address;

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

    public String getCoupons() {

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

    public void setCoupons(String coupons) {

        this.coupons = coupons;

    }

    public void setPhone(String phone) {

        this.phone = phone;

    }

    public void setAddress(String address) {

        this.address = address;

    }
}
