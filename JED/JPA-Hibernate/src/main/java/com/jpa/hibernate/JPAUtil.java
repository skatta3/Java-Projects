package com.jpa.hibernate;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * 
 * @author skatt
 * Create a helper class to bootstrap a JPA EntityManagerFactory.
 */
public class JPAUtil {
    private static final String PERSISTENCE_UNIT_NAME = "PERSISTENCE";
    private static EntityManagerFactory factory;

    public static EntityManagerFactory getEntityManagerFactory() {
        if (factory == null) {
            factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        }
        return factory;
    }

    public static void shutdown() {
        if (factory != null) {
            factory.close();
        }
    }
}