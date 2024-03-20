package com.java.interfaces;

public class BOA implements FedBank, USGovt{
	public void provideEduLoans() {
		System.out.println("Upto 500K Educational Loans are provided");
	}
	
	public void provideTeleBanking() {
		System.out.println("Need a Valid Mobile Number to enable TeleBanking");
	}
	
	public void maintainMinBalance() {
		System.out.println("Minimum Balance of 5 USD is Mandatory");
	}
}
