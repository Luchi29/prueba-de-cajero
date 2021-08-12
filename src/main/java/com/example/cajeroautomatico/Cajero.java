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
        ArrayList<Cuentas> cuentas = usuarioActual.getCuentas();

        for (int i = 0; i < cuentas.size(); i++) {
            System.out.println((i+1) + ". " +  cuentas.get(i).getInfo());
        }

        opcion = in.nextInt();

        //TODO: comprobar si es opcion valida
        tipoCuenta = cuentas.get(opcion);
        System.out.println(cuentas.get(opcion).getInfo() + " selecionada" );
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
                System.out.println("Seleccione tipo de moneda");
                tipoCuenta.depositarValor(seleccionarMoneda());
                break;
            }
            case 3: {
                tipoCuenta.extraerDinero();
                break;
            }
            case 4: {
                tipoCuenta.getInfo();
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

    public TiposDeMoneda seleccionarMoneda(){
        TiposDeMoneda tipo;
        Scanner in = new Scanner(System.in);
        int opcionElegida;

        System.out.println("1. PESOS");
        System.out.println("2. DOLARES");

        opcionElegida = in.nextInt();

        switch (opcionElegida){
            case 1:
                tipo = TiposDeMoneda.PESOS;
                break;
            case 2:
                tipo = TiposDeMoneda.DOLARES;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + opcionElegida);
        }
        return tipo;
    }
}

