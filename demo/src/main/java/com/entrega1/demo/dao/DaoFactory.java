package com.entrega1.demo.dao;

import com.entrega1.demo.model.Usuario;
import com.entrega1.demo.model.Direccion;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class DaoFactory {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void persistirUsuario(Usuario usuario) {
        em.persist(usuario);
    }

    @Transactional
    public void persistirDireccion(Direccion direccion) {
        em.persist(direccion);
    }
}