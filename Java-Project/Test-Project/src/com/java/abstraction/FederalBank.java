package com.java.abstraction;

public abstract class FederalBank {
	
	String location;
	int estalblished;
	
	//Concrete Method
	public void provideNetBanking() {
		System.out.println("Every Bank should provide Net Banking");
	}
	
	
	//Non-Concrete Methods OR Abstract Methods
	abstract void checkCustomerEligibility();
	

}
