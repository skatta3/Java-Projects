package com.java.training.exceptions;

public class CatchExample {
	public static void main(String[] args) {
		int[] intArr = new int[3];
		
		try {
			intArr[4] = 12/0;
		} catch(ArrayIndexOutOfBoundsException aie) {
			System.out.println("ArrayIndexOutOfBoundsException");
		} catch(ArithmeticException ae) {
			System.out.println("ArithmeticException");
		} catch (Exception e) {
			System.out.println("Exception");
		}
	}
}
