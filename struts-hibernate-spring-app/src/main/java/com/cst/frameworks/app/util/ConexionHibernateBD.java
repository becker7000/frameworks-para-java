package com.cst.frameworks.app.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConexionHibernateBD {

    // Instancia estática de EntityManagerFactory (Singleton)
    private static final EntityManagerFactory entityManagerFactory = buildEntityManagerFactory();

    // Método para construir la EntityManagerFactory
    private static EntityManagerFactory buildEntityManagerFactory() {
        // Asegúrate de que el nombre aquí coincida con el definido en persistence.xml
        return Persistence.createEntityManagerFactory("unidadDePersistencia");
    }

    // Método para obtener un EntityManager
    public static EntityManager getEntityManager() {
        return entityManagerFactory.createEntityManager();
    }

    // Método para cerrar la EntityManagerFactory (llamar en shutdown)
    public static void close() {
        if (entityManagerFactory != null && entityManagerFactory.isOpen()) {
            entityManagerFactory.close();
        }
    }

}
