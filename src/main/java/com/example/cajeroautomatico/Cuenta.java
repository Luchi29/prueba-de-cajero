package com.example.cajeroautomatico;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Cuenta {
        Integer saldo;
        ArrayList<Integer> opciones;

    public Cuenta(){
        opciones = new ArrayList<>();
        saldo = 0;
        opciones.add(5000);
        opciones.add(10000);
        opciones.add(20000);
        opciones.add(50000);
        opciones.add(100000);
    }

    public void mostrarSaldo() {
        System.out.println("Su saldo actual es: " + saldo);
    }

    public void depositarValor(TipoDeMoneda tipo){
        int cantidadADepositar;
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese una cantidad a depositar: ");
        cantidadADepositar = in.nextInt();
        saldo += cantidadADepositar;
        System.out.println("Su deposito es es de: " + cantidadADepositar);
        System.out.println("Su saldo actual es: " + saldo);
    }

    public abstract void extraerDinero();

    public abstract String getInfo();

    public void mostrarOpciones(ArrayList<Integer> opciones) {

        System.out.println("Seleccione un monto a extraer:");
        for(int i = 0; i < opciones.size(); i++) {
            System.out.println("Opcion: " + (i+1) + ": " + opciones.get(i));

        }


    }
}
