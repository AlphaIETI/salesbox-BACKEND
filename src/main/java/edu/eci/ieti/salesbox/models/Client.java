package edu.eci.ieti.salesbox.models;

public class Client {

    private int id;
    private String name;
    private String lastname;
    private String mail;
    private String password;

    public Client(int id, String name, String lastname, String mail, String password) {

        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.mail = mail;
        this.password = password;

    }

    public int getId() {

        return id;

    }

    public String getname() {

        return name;

    }

    public String getlastname() {

        return lastname;

    }

    public String getmail() {

        return mail;

    }

    public String getpassword() {

        return password;

    }

    public void setId(int id) {

        this.id = id;

    }

    public void setname(String name) {

        this.name = name;

    }

    public void setlastname(String lastname) {

        this.lastname = lastname;

    }

    public void setmail(String mail) {

        this.mail = mail;

    }

    public void setpassword(String password) {

        this.password = password;

    }
}
