package com.example.cajeroautomatico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CajeroAutomaticoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CajeroAutomaticoApplication.class, args);
        User usuario = new User("noelia", "1234" );
        usuario.iniciarSesion();
        Cajero cajero = new Cajero(usuario);

    }

}
