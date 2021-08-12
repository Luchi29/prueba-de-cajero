package com.example.cajeroautomatico;

import java.util.Scanner;

public class CajaAhorroPesos extends Cuenta {

    public CajaAhorroPesos() {

    }

    @Override
    public void depositarValor(TipoDeMoneda tipo) {
        if(!tipo.equals(TipoDeMoneda.PESOS)){
            System.out.println("Tipo de moneda incorrecto");
            return;
        }
        super.depositarValor(tipo);
    }

    @Override
    public void extraerDinero() {
        Scanner in = new Scanner(System.in);
        int opcionElegida;
        mostrarOpciones(this.opciones);
        opcionElegida = in.nextInt();
        if(saldo > opciones.get(opcionElegida)){
            saldo -= opciones.get(opcionElegida);
        }else {
            System.out.println("Saldo insuficiente");
        }

        System.out.println("Su saldo actual es: " + saldo);
    }

    @Override
    public String getInfo() {
        return "Caja de ahorro en pesos";
    }


}
