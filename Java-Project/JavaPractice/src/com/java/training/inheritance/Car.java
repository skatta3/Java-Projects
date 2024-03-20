package com.java.training.inheritance;

public class Car extends Vehicle {

    protected String licensePlate = null;

    @Override
    public void setLicensePlate(String license) {
        super.setLicensePlate(license);
    }

    @Override
    public String getLicensePlate() {
        return super.getLicensePlate();
    }

    public void updateLicensePlate(String license){
        this.licensePlate = license;
    }
    
    public Car() {
    	super();
    }
    
    public static void main(String[] args) {
    	Car car = new Car();

    	car.setLicensePlate("123");
    	car.updateLicensePlate("abc");

    	System.out.println("license plate: "
    	        + car.getLicensePlate());  	
    	
    }
}