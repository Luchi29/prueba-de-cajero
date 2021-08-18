package com.example.cajeroautomatico;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public abstract class Cuenta {
        Integer saldoActual;
        Integer saldoMinimo;
        ArrayList<Integer> opciones;

        protected Cuenta(){
        opciones = new ArrayList<>();
        saldoActual = 0;
        opciones.addAll(Arrays.asList(5000, 10000, 20000, 50000, 10000));
    }

    public void mostrarSaldo() {
        System.out.println("Su saldo actual es: " + saldoActual);
    }

    public void depositarValor(TipoDeMoneda tipo){
        int cantidadADepositar;
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese una cantidad a depositar: ");
        cantidadADepositar = in.nextInt();
        saldoActual += cantidadADepositar;
        System.out.println("Su deposito es es de: " + cantidadADepositar);
        mostrarSaldo();
    }

    public void extraerDinero() {
        Scanner in = new Scanner(System.in);
        int opcionElegida;
        mostrarOpciones(this.opciones);
        opcionElegida = in.nextInt();
        if(saldoActual - opciones.get(opcionElegida) > saldoMinimo){
            saldoActual -= opciones.get(opcionElegida);
        }else {
            System.out.println("Saldo insuficiente");
        }
        mostrarSaldo();
    }
    public abstract String getInfo();

    //Esto capaz deberia estar en la clase cajero
    public void mostrarOpciones(ArrayList<Integer> opciones) {
        System.out.println("Seleccione un monto a extraer:");
        for(int i = 0; i < opciones.size(); i++) {
            System.out.println("Opcion: " + (i+1) + ": " + opciones.get(i));
        }
    }
}
