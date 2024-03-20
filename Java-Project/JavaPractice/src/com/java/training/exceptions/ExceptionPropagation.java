package com.java.training.exceptions;

import java.io.IOException;
import java.sql.SQLException;

public class ExceptionPropagation {	
	
	public void addition(int x, int y) {
		try {
			int result = x + y;
			System.out.println("Addition: "  + result);
			subtraction(x,y);
		} catch(Exception e) {
			System.err.println("Exception Occured");
			e.printStackTrace();
		}
	}
	
	public void subtraction(int x, int y) throws IOException{
		int result = x - y;
		System.out.println("Subtraction: "  + result);
		division(x,y);
	}
	
	public void division(int x, int y) throws IOException,SQLException{
		int result = x / y;
		System.out.println("Division: "  + result);
		throw new IOException();
	}
	
	public static void main(String[] args) {
		ExceptionPropagation ep = new ExceptionPropagation();
		ep.addition(12, 1);
		
	}
}
