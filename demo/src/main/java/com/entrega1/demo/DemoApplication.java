package com.entrega1.demo;

import com.entrega1.demo.dao.DaoFactory;
import com.entrega1.demo.model.Direccion;
import com.entrega1.demo.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private DaoFactory dao;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Usuario u = new Usuario();
        u.setNombre("Juan Pérez");

        Direccion d1 = new Direccion("Lima");
        Direccion d2 = new Direccion("Arequipa");

        u.addDireccion(d1);
        u.addDireccion(d2);

        dao.persistirUsuario(u);
        System.out.println("Usuario y direcciones persistidos correctamente.");
    }
}