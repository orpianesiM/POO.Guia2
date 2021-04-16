package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Random;

public class Factura implements Identificador {

    private String id;
    private Cliente cliente;
    //private String fecha; No uso mas esta variable, uso directamente la instancia LacalDateTime
    private LocalDateTime fecha;
    private double total = 0;

    private int cantItems;
    private ItemVenta[] items = new ItemVenta[cantItems];
    private int aux=0;



    //Constructor
    public Factura()
    {
        this.id = asignarId(6);
        asignarFechaYHora();
    }

    public Factura(Cliente cliente)
    {
        this.id = asignarId(6);
        asignarFechaYHora();
        this.cliente = cliente;
    }

    public Factura(Cliente cliente, int cantItems)
    {
        this(cliente);
        this.cantItems = cantItems;
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

    public void setFecha() {this.fecha = LocalDateTime.now(); }

    public double getTotal() {
        return this.total;
    }

    public void setTotal(double total) {

        for (ItemVenta item:
             items) {
            this.total += (item.getPrecio()+item.getCant());
        }

    }

    public int getCantItems() {
        return cantItems;
    }

    public void setCantItems(int cantItems) {
        this.cantItems = cantItems;
    }

    public void setItems(ItemVenta item) {
        this.items[aux] = item;
        this.aux +=1 ;
    }

    public ItemVenta[] getItems() {
        return items;
    }

    public ItemVenta getItem(int pos) {
        return items[pos];
    }

    //Otros metodos

    public String toStringFecha() //si solo lo uso en esta clase poner como private
    {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss") ;
        return fecha.format(formato);
    }

    public void asignarFechaYHora()
    {
        this.fecha = LocalDateTime.now();

        //DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss") ;
        //LocalDateTime dateAndTime = LocalDateTime.now();
        //this.fecha = dateAndTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)); //Este no funciona, hay un error
        //this.fecha = dateAndTime.format(formato);
    }

    public double calcularTotal(float descuento)
    {
        return this.getTotal() - this.getTotal()*descuento;
    }


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

    @Override
    public String toString() {
        return "Factura[id=" + this.id + " - fecha=" + this.fecha.toLocalDate()  + " - hora=" + this.fecha.toLocalTime()  +
                " - monto=" + this.getTotal() + " - montoDesc= " + String.format("%.2f", this.calcularTotal(cliente.getDescuento()))  + "\n" + cliente.toString() + " ]";
    }
}

