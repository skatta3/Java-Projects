package com.jpa.hibernate;

import jakarta.persistence.EntityManager;

public class MainApp {
    public static void main(String[] args) {

        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();

        Student student = new Student("Ramesh", "Fadatare", "rameshfadatare@javaguides.com");
        entityManager.persist(student);
        entityManager.getTransaction().commit();
        entityManager.close();

        JPAUtil.shutdown();
    }

}
