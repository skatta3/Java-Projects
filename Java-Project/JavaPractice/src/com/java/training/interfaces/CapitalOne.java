package com.java.training.interfaces;

public class CapitalOne implements FederalBank,USGovt {

	public void minimuBalance() {
		System.out.println("The Minimum Balance that customer should maintain is $10");
	}
	
	public void netBanking() {
		System.out.println("Internet Banking feature is available");
	}
	public void checkEligibility() {
		System.out.println("Ony Customers with Valid Resident status can open the account");
	}
	
	public void makeTransfers() {
		
	}
}
