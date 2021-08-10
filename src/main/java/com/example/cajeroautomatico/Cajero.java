package com.example.cajeroautomatico;

import java.util.ArrayList;
import java.util.Scanner;

public class Cajero {
    ArrayList<String> opciones = new ArrayList<>();
    User usuarioActual;
    Cuentas tipoCuenta;

    public Cajero(User user) {
        opciones.add("Ver saldo");
        opciones.add("Realizar deposito");
        opciones.add("Extraer");

        this.usuarioActual = user;
        elegirCuenta();
        seleccionarOperacion();
    }

    public void elegirCuenta(){
        Scanner in = new Scanner(System.in);
        int opcion;
        System.out.println("Ingrese una opcion: ");
        System.out.println("1. Caja de Ahorro en pesos");
        System.out.println("2. Caja de Ahorro en dolares");
        System.out.println("3. Cuenta corriente");

        opcion = in.nextInt();

        switch (opcion){
            case 1: {
                tipoCuenta = new CajaAhorroPesos();
                System.out.println("Caja de ahorro en pesos selecionada");
                break;
            }
            case 2: {
                tipoCuenta = new CajaAhorroDolares();
                System.out.println("Caja de ahorro en dolares seleccionada");
                break;
            }
            case 3: {
                tipoCuenta = new CuentaCorriente();
                System.out.println("Cuenta corriente seleccionada");
                break;
            }
        }
    }

    public void seleccionarOperacion(){
        Scanner in = new Scanner(System.in);
        int opcionElegida;
        mostrarOpciones();
        opcionElegida = in.nextInt();

        switch (opcionElegida){
            case 1: {
               tipoCuenta.mostrarSaldo();
                break;
            }
            case 2: {
              //  tipoCuenta.depositarValor();
                break;
            }
            case 3: {
                tipoCuenta.extraerDinero();
                break;
            }
        }
    }

    public void mostrarOpciones() {
        System.out.println("Seleccione una operacion a realizar");
        for(int i = 0; i < opciones.size(); i++) {
            System.out.println("Opcion " + (i+1) + ": " + opciones.get(i));

        }


    }
}

