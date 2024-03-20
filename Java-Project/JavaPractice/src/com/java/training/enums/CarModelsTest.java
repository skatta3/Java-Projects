package com.java.training.enums;

class Cars {
		enum carModels{Eon,i10,i20,Xcent,Verna}
		carModels models;
}

public class CarModelsTest {

	public static void main(String[] args) {
		Cars cars = new Cars();
		cars.models = Cars.carModels.i20;
		System.out.println("Cars Models   " + cars.models);
		
	}
	
}
