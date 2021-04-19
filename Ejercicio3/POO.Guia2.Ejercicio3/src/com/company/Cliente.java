package com.company;

import java.util.ArrayList;
import java.util.UUID;

public class Cliente {
    private UUID id;
    private String nombre;
    private char genero;
    private ArrayList<Cuenta> cuentas;

    //constructores

    public Cliente(){
        this.id = UUID.randomUUID(); // Investigar UUID class de java
        this.cuentas = new ArrayList<>();
    }

    public Cliente(String nombre, char genero)
    {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.genero = genero;
        this.cuentas = new ArrayList<>();
    }

    //Setters & Getters


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
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

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    // otros metodos

    public String datosDeCuentas()
    {
        String datosCuentas = new String();
        int num = 0;

        for (Cuenta cuenta: cuentas) {
            num += 1;
            datosCuentas +=  "Cuenta " + num + ": Id " + cuenta.getId() + "\n";
        }

        return datosCuentas;
    }

    @Override
    public String toString() {
        return "Cliente Id= " + this.id + "\nNombre= " + this.nombre + " - Genero=" + this.genero + "\n" + datosDeCuentas();
    }
}
