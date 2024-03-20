package com.java.interfaces;

public interface FederalBank {
	void publishROI();
	void provideNetBanking();
	default void minimumBalance() {
		System.out.println("");
	}

}
