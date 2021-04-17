package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Random;

public class Factura implements Identificador {

    private String id;
    private Cliente cliente;
    //private String fecha; No uso mas esta variable, uso directamente la instancia LacalDateTime con su toString
    private LocalDateTime fecha;

    /*private int cantItems;
    private ItemVenta[] items = new ItemVenta[cantItems];
    private int aux=0;*/

    private ArrayList<ItemVenta> items = new ArrayList<ItemVenta>();


    //Constructor

    public Factura()
    {
        this.id = asignarId(6);
        this.fecha = LocalDateTime.now();
    }

    public Factura(Cliente cliente)
    {
        this.id = asignarId(6);
        this.fecha = LocalDateTime.now();
        this.cliente = cliente;
    }

    /*public Factura(Cliente cliente, int cantItems)
    {
        this(cliente);
        this.cantItems = cantItems;
    }*/


    // Setters & Getters

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

    public void setFecha(LocalDateTime dateTime) {this.fecha = dateTime; }

    public ArrayList<ItemVenta> getItems() {
        return items;
    }

    public void setItems(ArrayList<ItemVenta> items) {
        this.items = items;
    }

    //Otros metodos

    public String toStringFecha() //si solo lo uso en esta clase poner como private
    {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss") ;
        return fecha.format(formato);
    }

    /*public void asignarFechaYHora()
    {
        this.fecha = LocalDateTime.now();

        //DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss") ;
        //LocalDateTime dateAndTime = LocalDateTime.now();
        //this.fecha = dateAndTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)); //Este no funciona, hay un error
        //this.fecha = dateAndTime.format(formato);
    }*/

    public double calcularTotal()
    {
        double total = 0;
        for (ItemVenta item: this.items) {
            total += (item.getCant() * item.getPrecio()) ;
        }

        return total;
    }

    public double calcularTotalConDesc(float descuento)
    {
        return this.calcularTotal() * (1-descuento);
    }


    /*@Override
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
    public String toString() {
        return "Factura[id=" + this.id + " - fecha=" + this.fecha.toLocalDate()  + " - hora=" + this.fecha.toLocalTime()  +
                " - monto=" + this.calcularTotal() + " - montoDesc= " +
                String.format("%.2f", this.calcularTotalConDesc(this.cliente.getDescuento()))  + "\n" + cliente.toString() + " ]";
    }
}

