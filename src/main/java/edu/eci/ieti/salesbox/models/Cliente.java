package edu.eci.ieti.salesbox.models;

public class Cliente {

    private int id;
    private String nombre;
    private String apellido;
    private String correo;
    private String contrase;

    public Cliente(int id, String nombre, String apellido, String correo, String contrase) {

        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrase = contrase;

    }

    public int getId() {

        return id;

    }

    public String getNombre() {

        return nombre;

    }

    public String getApellido() {

        return apellido;

    }

    public String getCorreo() {

        return correo;

    }

    public String getContrase() {

        return contrase;

    }

    public void setId(int id) {

        this.id = id;

    }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    public void setApellido(String apellido) {

        this.apellido = apellido;

    }

    public void setCorreo(String correo) {

        this.correo = correo;

    }

    public void setContraseña(String contrase) {

        this.contrase = contrase;

    }
}
