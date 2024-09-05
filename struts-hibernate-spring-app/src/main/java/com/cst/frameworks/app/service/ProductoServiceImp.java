package com.cst.frameworks.app.service;

import com.cst.frameworks.app.entity.Producto;
import com.cst.frameworks.app.util.ConexionHibernateBD;

import javax.persistence.EntityManager;
import java.util.List;

public class ProductoServiceImp implements ProductoService {

    @Override
    public List<Producto> listar() {
        EntityManager em = ConexionHibernateBD.getEntityManager();
        List<Producto> productos = null;
        try {
            productos = em.createQuery("SELECT p FROM Producto p", Producto.class).getResultList();
        } finally {
            em.close();
        }
        return productos;
    }

}
