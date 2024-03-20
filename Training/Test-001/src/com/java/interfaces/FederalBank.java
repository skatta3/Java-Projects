package com.java.interfaces;

public interface FederalBank {
	
	String Location = "";  //public static final String location;
	
	void checkEligibility(); // public abstract void checkEligibility();
	
	void provideNetBanking();
	
	public default void maintainMinBal() {
		
		System.out.println("Minimum Balance of 5 USD is needed in each Customer ACcount");
	}

}
