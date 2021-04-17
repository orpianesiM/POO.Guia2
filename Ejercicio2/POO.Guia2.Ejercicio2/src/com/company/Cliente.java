package com.company;

import java.util.Random;

public class Cliente implements Identificador {
    private String id;
    private String nombre;
    private String email;
    private float descuento = 0;

    //Constructor
    public Cliente()
    {
        this.id = asignarId(4);
    }


    public Cliente(String nombre, String email, float descuento)
    {
        this.nombre = nombre;
        this.email = email;
        this.descuento = descuento;
        this.id = asignarId(4);
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

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    //Otros metodos


   /* @Override
    public String asignarId(int size) {
        String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minusculas = mayusculas.toLowerCase();
        String digitos = "0123456789";
        String alfanumericos = mayusculas + minusculas + digitos;

        Random random = new Random();
        char[] simbolos = alfanumericos.toCharArray();
        char[] token = new char[size] ;

        for (int i = 0; i < token.length; ++i)
            token[i] = simbolos[random.nextInt(simbolos.length)];

        return new String(token);
    }*/

    @Override
    public String toString()
    {
        return "Cliente[id=" + this.id + " - nombre=" + this.nombre + " - email=" + this.email +
                " - descuento=" + this.descuento + "]";
    }
}
