package com.jpa.hibernate;

public class MainApp {
    public static void main(String[] args) {
        CRUDOperations crudOperations = new CRUDOperations();
        crudOperations.insertEntity();
        crudOperations.findEntity();
        crudOperations.updateEntity();
        crudOperations.removeEntity();
    }
}
