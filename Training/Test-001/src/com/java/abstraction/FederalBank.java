package com.java.abstraction;

public abstract class FederalBank {

		//Concrete Method -- Non-abstract method -- Method with body
		public void checkEligibility() {
			System.out.println("The Customer should have Valid SSN");
		}
		
		//abstract method -- method without body
		abstract void provideNetBanking();
}
