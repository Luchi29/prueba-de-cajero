package com.example.cajeroautomatico;

import java.util.Scanner;

public class CuentaCorriente extends Cuenta {
    public CuentaCorriente() {

    }

        public void depositarValor(TipoDeMoneda tipo) {
            if(!tipo.equals(TipoDeMoneda.PESOS)){
                System.out.println("Tipo de moneda incorrecto");
                return;
            }
            super.depositarValor(tipo);
        }

    //No checkea si queda saldo negativo
    public void extraerDinero() {
        Scanner in = new Scanner(System.in);
        int opcionElegida;
        mostrarOpciones(this.opciones);
        opcionElegida = in.nextInt();
        saldo -= opciones.get(opcionElegida);
        System.out.println("Su saldo actual es: " + saldo);
        }

    @Override
    public String getInfo() {
      return "Cuenta corriente";
    }
}

