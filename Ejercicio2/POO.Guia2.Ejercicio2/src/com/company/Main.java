package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Carlos", "carlos@gmail.com", 0.10f);

        Factura factura = new Factura(cliente, 5);

        ItemVenta item1 = new ItemVenta("Coquita", "Latita de coca", 2,  40f );
        ItemVenta item2 = new ItemVenta("Arroz", "Lorem Ipsum", 2, 80f );
        ItemVenta item3 = new ItemVenta("Fideos", "Lorem Ipsum", 1, 90f );
        ItemVenta item4 = new ItemVenta("Agua", "Lorem Ipsum", 3, 100f );
        ItemVenta item5 = new ItemVenta("Galletitas", "Lorem Ipsum", 1, 110f );

        //factura.setTotal(120d);



        System.out.println(cliente);
        System.out.println(factura);
    }

}
