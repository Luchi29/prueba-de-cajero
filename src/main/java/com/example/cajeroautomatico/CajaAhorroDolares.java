package com.example.cajeroautomatico;

public class CajaAhorroDolares extends Cuenta {

    public CajaAhorroDolares() {
        this.saldoMinimo = 0;
    }

    @Override
    public void depositarValor(TipoDeMoneda tipo) {
        if(!tipo.equals(TipoDeMoneda.DOLARES)){
            System.out.println("Tipo de moneda incorrecto");
            return;
        }
        super.depositarValor(tipo);
    }

    @Override
    public String getInfo() {
       return "Caja de ahorro en dolares";
    }
}
