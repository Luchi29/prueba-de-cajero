package com.example.cajeroautomatico;

public class CuentaCorriente extends Cuenta {

    public CuentaCorriente() {
        this.saldoMinimo = -100000;
    }
    public void depositarValor(TipoDeMoneda tipo) {
        if(!tipo.equals(TipoDeMoneda.PESOS)){
            System.out.println("Tipo de moneda incorrecto");
            return;
        }
        super.depositarValor(tipo);
    }

    @Override
    public String getInfo() {
      return "Cuenta corriente";
    }
}

