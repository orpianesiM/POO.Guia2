package com.company;

import java.util.UUID;

public class Cuenta {

    private UUID id;
    private Cliente cliente;
    private double balance;

    //constructores

    public Cuenta() {
        this.id = UUID.randomUUID(); // Investigar UUID class de java
    }

    public Cuenta(Cliente cliente, double balance) {
        this.id = UUID.randomUUID();
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

    //Otros metodos

    public void depositar(double monto)
    {
        this.balance += monto;
    }

    public void extraer(double monto)
    {
        if(this.balance - monto >= 0)
            this.balance -= monto;
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

}
