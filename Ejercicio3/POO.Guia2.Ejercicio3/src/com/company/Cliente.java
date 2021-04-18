package com.company;

import java.util.ArrayList;

public class Cliente {
    private String id;
    private String nombre;
    private char genero;
    private ArrayList<Cuenta> cuentas;

    //constructores

    public Cliente(){
        this.id = generarId(); // Investigar UUID class de java
        this.cuentas = new ArrayList<>();
    }

    public Cliente(String nombre, char genero)
    {
        this.id = generarId();
        this.nombre = nombre;
        this.genero = genero;
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

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    // otros metodos
}
