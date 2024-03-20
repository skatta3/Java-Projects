package com.java.training.inheritance;

public class Vehicle {

    String licensePlate = null;

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }
    
    public Vehicle() {
    	System.out.println("Default Constructor of Vehicle");
    }
}