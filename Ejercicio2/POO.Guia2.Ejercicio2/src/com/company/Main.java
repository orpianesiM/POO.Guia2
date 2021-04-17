package com.company;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Carlos", "carlos@gmail.com", 0.10f);

        Factura factura = new Factura(cliente);

        ItemVenta item1 = new ItemVenta("Coquita", "Latita de coca", 2,  40f );
        ItemVenta item2 = new ItemVenta("Arroz", "Lorem Ipsum", 2, 80f );
        ItemVenta item3 = new ItemVenta("Fideos", "Lorem Ipsum", 1, 90f );
        ItemVenta item4 = new ItemVenta("Agua", "Lorem Ipsum", 3, 100f );
        ItemVenta item5 = new ItemVenta("Galletitas", "Lorem Ipsum", 1, 110f );

        factura.getItems().add(item1);
        factura.getItems().add(item2);
        factura.getItems().add(item3);
        factura.getItems().add(item4);
        factura.getItems().add(item5);

        System.out.println(cliente);
        System.out.println(factura);
    }

}
