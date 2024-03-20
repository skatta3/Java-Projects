package com.java.training.interfaces;

public interface FederalBank {
	
	void minimuBalance(); // public abstract void minimuBalance();
	
	void netBanking();
	
	default void phoneBanking() {
		System.out.println("Phone Banking facility should be provided to all Customers");
	}

}
