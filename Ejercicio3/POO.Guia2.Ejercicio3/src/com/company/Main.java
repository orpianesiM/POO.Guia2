package com.company;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Carlos", 'M');

        Cuenta cuenta = new Cuenta( cliente, 1000);
        CuentaNegativa cuenta2 = new CuentaNegativa( cliente, 2000);

        cliente.getCuentas().add(cuenta);
        cliente.getCuentas().add(cuenta2);

        System.out.println(cliente);

        System.out.println("\n"+cliente.getCuentas().get(0));
        cuenta.extraer(50);
        System.out.println(cuenta);
        cuenta.depositar(200);
        System.out.println(cliente.getCuentas().get(0));
        cuenta.extraer(1160);

        System.out.println("\n"+cliente.getCuentas().get(1));
        cuenta2.extraer(50);
        System.out.println(cuenta2);
        cuenta2.depositar(200);
        System.out.println(cliente.getCuentas().get(1));
        cuenta2.extraer(2200);
        System.out.println(cliente.getCuentas().get(1));
        cuenta2.extraer(1960);
        System.out.println(cliente.getCuentas().get(1));

    }
}
