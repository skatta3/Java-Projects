package com.training.JIT;

public class ConstantFolding {
	static final int a = 2;	
	public static void main(String[] args) {
		// code

		int b = 30 * a;

//		// folding would create
//		int b = 60;
		
		System.out.println("Value of b :" + b);	
	}
}
