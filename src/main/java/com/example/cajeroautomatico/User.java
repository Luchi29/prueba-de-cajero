package com.example.cajeroautomatico;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class User {
   private String nombreUsuario;
   private String contraseña;
   private ArrayList<Cuentas> cuentas;

    public User(String nombreUsuario, String contraseña) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        cuentas = new ArrayList<>();
    }

    public void agregarCuentas(Cuentas cuenta){
        //TODO: hacer alguna compobacion
        cuentas.add(cuenta);
    }

    public ArrayList<Cuentas> getCuentas(){
        return cuentas;
    }

    public void iniciarSesion() {
        Scanner in = new Scanner(System.in);
        String userName;
        String password;
        System.out.println("ingrese su usuario: ");
        userName = in.nextLine();
        System.out.println("ingrese su contraseña: ");
        password = in.nextLine();

            if(nombreUsuario.equals(userName) && contraseña.equals(password)) {
                System.out.println("Bienvenido!");
            } else {
                System.out.println("ingrese su usuario: ");
                userName = in.nextLine();
                System.out.println("ingrese su contraseña: ");
                password = in.nextLine();
            }



        }



    }
