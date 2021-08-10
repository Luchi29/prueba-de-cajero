package com.example.cajeroautomatico;

import java.util.ArrayList;
import java.util.Scanner;

public class Cuentas{
        Integer saldo;
        User user;

    public Cuentas(){
        saldo = 0;
    }

    public void mostrarSaldo() {
        System.out.println("Su saldo actual es: " + saldo);
    }

    public void depositarValor(int cantidadADepositar) {
        saldo += cantidadADepositar;
        System.out.println("Su deposito es es de: " + cantidadADepositar);
        System.out.println("Su saldo actual es: " + saldo);
    }

    public void extraerDinero() {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> opciones = new ArrayList<>();
        opciones.add(5000);
        opciones.add(10000);
        opciones.add(20000);
        opciones.add(50000);
        opciones.add(100000);
        int opcionElegida;
        mostrarOpciones(opciones);
        opcionElegida = in.nextInt();

        saldo -= opciones.get(opcionElegida);
        System.out.println("Su saldo actual es: " + saldo);
    }

    public void mostrarOpciones(ArrayList<Integer> opciones) {


        System.out.println("Seleccione un monto a extraer:");
        for(int i = 0; i < opciones.size(); i++) {
            System.out.println("Opcion: " + i + ": " + opciones.get(i));

        }


    }
}
