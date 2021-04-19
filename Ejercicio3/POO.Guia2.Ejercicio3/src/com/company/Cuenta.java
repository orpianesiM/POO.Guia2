package com.company;

import java.util.UUID;

public class Cuenta {

    private UUID id;
    private Cliente cliente;
    private double balance;
    private String[] operaciones = new String[10];
    private int contador;

    //constructores

    public Cuenta() {
        this.id = UUID.randomUUID(); this.contador = 0;// Investigar UUID class de java
    }

    public Cuenta(Cliente cliente, double balance) {
        this.id = UUID.randomUUID();
        this.contador = 0;
        this.cliente = cliente;
        this.balance = balance;
    }

    //getters & setters

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String[] getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(String[] operaciones) {
        this.operaciones = operaciones;
    }

    //Otros metodos

    public void depositar(double monto)
    {
        this.balance += monto;
        cargaOperacion("depositó", monto);
    }

    public void extraer(double monto)
    {
        if(this.balance - monto >= 0) {
            this.balance -= monto;
            cargaOperacion("retiró", monto);
        }
        else
            operacionNegada();
    }

    public void operacionNegada()
    {
        System.out.println("No se puede realizar esa extracción - Dinero Insuficiente");
    }

    @Override
    public String toString()
    {
        return "Id cuenta= " + this.id + " - Cliente= " + this.cliente.getNombre() + " - Balance= $" + this.balance;
    }

    public void cargaOperacion(String operacion, double monto)
    {
        String op = this.cliente.getNombre() + " " + operacion + " $" + monto;

        if(this.contador == 10)
            this.contador = 0;

        operaciones[this.contador] = op;
        this.contador += 1;
    }
/*
    private void cargarArrayOperaciones(String op)
    {


        operaciones[this.contador] = op;
    }*/

}
