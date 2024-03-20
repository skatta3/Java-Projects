package com.java.training.varargs;

public class Variableargs {
	
//	public int sum (int num1, int num2) {
//		int result =0;
//		
//		result = num1 + num2;
//		return result;		
//	}
	
	public int sum (int num1, int ...num3) {
		int result =0;
		
		result = num1 + result;
	    for(int x : num3){ //Advanced or Enhanced For Loop
	    	result+=x;
	    }
		return result;		
	}
	
	public static void main (String[] args) {
		Variableargs varargs = new Variableargs();
		
		System.out.println(varargs.sum(2,5));
		System.out.println(varargs.sum(2,5,7,4,5,7));
		
	}

}
