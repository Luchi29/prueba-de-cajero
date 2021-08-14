package com.example.cajeroautomatico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CajeroAutomaticoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CajeroAutomaticoApplication.class, args);
        User usuario = new User("noelia", "1234" );
        Cuenta cuenta1 = new CuentaCorriente();
        Cuenta cuenta2 = new CajaAhorroDolares();
        Cuenta cuenta3 = new CajaAhorroPesos();

        usuario.agregarCuentas(cuenta1);
        usuario.agregarCuentas(cuenta2);
        usuario.agregarCuentas(cuenta3);

        usuario.iniciarSesion();
        new Cajero(usuario);

    }



}
