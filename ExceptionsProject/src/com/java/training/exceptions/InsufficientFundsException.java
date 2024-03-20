package com.java.training.exceptions;

public class InsufficientFundsException extends Exception {
	private double amount;
	
	public InsufficientFundsException(double amount) {
	   this.amount = amount;
	}
	
	public double getAmount() {
	   return amount;
	}
}
