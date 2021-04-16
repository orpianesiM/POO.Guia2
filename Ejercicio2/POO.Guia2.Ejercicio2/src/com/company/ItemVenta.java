package com.company;

import java.util.Random;

public class ItemVenta implements Identificador {

    private String id;
    private String nombre;
    private String descripcion;
    private int cant = 0;
    private float precio = 0f;

    //Constructores

    public ItemVenta(){}

    public ItemVenta(String nombre, String descripcion, int cant, float precio) {
        this.id = asignarId(5);
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cant = cant;
        this.precio = precio;
    }


    // Setters y Getters

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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    //Otros metodos

    @Override
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
    }
}
