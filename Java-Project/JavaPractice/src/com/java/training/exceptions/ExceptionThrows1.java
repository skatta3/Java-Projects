package com.java.training.exceptions;

public class ExceptionThrows1 {
	
	public static void main(String[] args) throws Exception {
		ExceptionThorws et = new ExceptionThorws();
		int result = et.divide(10, 0);
		
		System.out.println(result);
	}
	

}
