package com.java.training.exceptions;

public class ThrowsException1 {
	public static void main(String[] args) {
		
		try {
			ThrowsException.methodWithThrows();
		} catch (NullPointerException ne) {
			System.out.println("Verifying teh Program with throws keyword");
			
			ne.printStackTrace();
			ne.getMessage();
		}
	}
}
