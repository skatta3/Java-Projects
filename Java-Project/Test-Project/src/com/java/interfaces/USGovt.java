package com.java.interfaces;

public interface USGovt {
	void maintainMinBalance();
	
	default void provideBusinessLoans() {
		System.out.println("For Qualified Business individual to start a company");
	}
}
