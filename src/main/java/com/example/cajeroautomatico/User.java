package com.example.cajeroautomatico;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {
   private final String nombreUsuario;
   private final String contrasenia;
   private ArrayList<Cuenta> cuentas;

    public User(String nombreUsuario, String contrasenia) {
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
        cuentas = new ArrayList<>();
    }

    public void agregarCuentas(Cuenta cuenta){
        //TODO: hacer alguna compobacion
        cuentas.add(cuenta);
    }

    public List<Cuenta> getCuentas(){
        return cuentas;
    }

    public void iniciarSesion() {
        Scanner in = new Scanner(System.in);
        String username;
        String password;
        System.out.println("Ingrese su usuario: ");
        username = in.nextLine();
        System.out.println("Ingrese su contraseña: ");
        password = in.nextLine();

        if(nombreUsuario.equals(username) && contrasenia.equals(password)) {
            System.out.println("Bienvenido!");
        } else {
            System.out.println("Datos incorrectos, intente nuevamente");
            iniciarSesion();
        }
    }

}
