package com.java.customexceptions;

//User Defined Exception
public class InsufficientFundsException extends Exception {
	private double amount;
	
	public InsufficientFundsException(double amount) {
	   this.amount = amount;
	}
	
	public double getAmount() {
	   return amount;
	}
	
	public void getMessage(String msg) {
		System.out.println(msg);
	}
}
