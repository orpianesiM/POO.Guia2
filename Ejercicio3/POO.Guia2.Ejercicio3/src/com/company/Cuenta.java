package com.company;

public class Cuenta {

    private String id;
    private Cliente cliente;
    private double balance;

    //constructores

    public Cuenta() {
        this.id = generarId(); // Investigar UUID class de java
    }

    public Cuenta(Cliente cliente, double balance) {
        this.cliente = cliente;
        this.balance = balance;
    }

    //getters & setters


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
        if(monto <= this.balance)
            this.balance -= monto;
        else
            operacionNegada();
    }

    private void operacionNegada()
    {
        System.out.println("No se puede realizar esa extracción - Dinero Insuficiente");
    }

}
