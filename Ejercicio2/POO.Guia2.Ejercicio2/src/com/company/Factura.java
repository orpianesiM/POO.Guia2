package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Random;

public class Factura {

    private String id;
    private Cliente cliente;
    //private String fecha; No uso mas esta variable, uso directamente la instancia LacalDateTime
    private LocalDateTime fecha;
    private double total = 0;

    //Constructor
    public Factura()
    {
        this.id = asignarId();
        //asignarFechaYHora();
        this.fecha = LocalDateTime.now();
    }

    public Factura(Cliente cliente)
    {
        this.id = asignarId();
        //asignarFechaYHora();
        this.cliente = cliente;
    }

    //Setters & Getters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDateTime getFecha() {
        return this.fecha;
    }

    public void setFecha() {
        this.fecha = LocalDateTime.now();
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }


    //Otros metodos

    public String asignarId()
    {
        Random rand = new Random()
        return "";//generar
    }

    /*public void asignarFechaYHora()
    {
        //DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss") ;
        //LocalDateTime dateAndTime = LocalDateTime.now();
        //this.fecha = dateAndTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)); //Este no funciona, hay un error
        //this.fecha = dateAndTime.format(formato);
    }*/

    public double calcularTotal(float descuento)
    {
        return 0.;
    }





}

