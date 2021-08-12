package com.example.cajeroautomatico;

import java.util.Scanner;

public class CajaAhorroDolares extends Cuentas {

    public CajaAhorroDolares() {

    }

    @Override
    public void depositarValor(TiposDeMoneda tipo) {
        //TODO: Refactor
        if(!tipo.equals(TiposDeMoneda.DOLARES)){
            System.out.println("Tipo de moneda incorrecto");
            return;
        }
        super.depositarValor(tipo);
    }

    @Override
    public void extraerDinero() {
        Scanner in = new Scanner(System.in);
        mostrarOpciones(this.opciones);
        int opcionElegida;
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
       return "Caja de ahorro en dolares";
    }
}
