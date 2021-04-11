package com.company;

public class Cliente {
    private String id;
    private String nombre;
    private String email;
    private float descuento = 0;

    //Constructor
    public Cliente()
    {
        this.id = asignarId();
    }

    public Cliente(String nombre, String email)
    {
        this.nombre = nombre;
        this.email = email;
        this.id = asignarId();
    }

    //Setters & Getters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    //Otros metodos

    public String asignarId()
    {
        //generar
    }
}
