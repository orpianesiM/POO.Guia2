package com.company;

public class CuentaNegativa extends Cuenta{

    //constructor

    public CuentaNegativa(){
        super();
    }

    public CuentaNegativa(Cliente cliente, double balance)
    {
        super(cliente, balance);
    }

    @Override
    public void extraer(double monto)
    {
        if( this.getBalance() - monto >= -2000)
        {
            this.setBalance(this.getBalance() - monto);
            super.cargaOperacion("retiró", monto);
        }

        else
            operacionNegada();
    }

}
