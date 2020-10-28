package edu.eci.ieti.salesbox.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Client {

    @Id
    private String id;
    private String name;
    private String lastname;
    private String mail;
    private String password;
    private String coupons;
    private String phon;
    private String adress;

    public Client(String id, String name, String lastname, String mail, String password,String coupons,String phon, String adress ) {

        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.mail = mail;
        this.password = password;
        this.coupons = coupons;
        this.phon = phon;
        this.adress = adress;

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

    public String getMail() {
        return mail;
    }

    public String getPassword() {
        return password;
    }

    public String getCoupons() {
        return coupons;
    }

    public String getPhon() {
        return phon;
    }

    public String getAdress() {
        return adress;
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

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCoupons(String coupons) {
        this.coupons = coupons;
    }

    public void setPhon(String phon) {
        this.phon = phon;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
