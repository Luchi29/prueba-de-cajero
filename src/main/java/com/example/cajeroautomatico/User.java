package com.example.cajeroautomatico;

import java.util.Scanner;

public class User {
    String nombreUsuario;
    String contraseña;

    public User(String nombreUsuario, String contraseña) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }

    public void iniciarSesion() {
        Scanner in = new Scanner(System.in);
        String userName;
        String password;
        System.out.println("ingrese su usuario: ");
        userName = in.nextLine();
        System.out.println("ingrese su contraseña: ");
        password = in.nextLine();

            if(nombreUsuario == userName && contraseña == password) {
                System.out.println("Bienvenido!");
            } else {
                System.out.println("ingrese su usuario: ");
                userName = in.nextLine();
                System.out.println("ingrese su contraseña: ");
                password = in.nextLine();
            }



        }



    }
