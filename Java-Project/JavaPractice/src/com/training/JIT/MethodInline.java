package com.training.JIT;

public class MethodInline {

	private int add4(int x1, int x2, int x3, int x4) {
	    return add2(x1, x2) + add2(x3, x4);
	}
	 
	private int add2(int x1, int x2) {
	    return x1 + x2;
	}
	
	public static void main(String[] args) {
		MethodInline mi = new MethodInline();
		System.out.println(mi.add4(2, 3, 5, 7));
		
	}

}

/**
 * You might be almost sure that after some time JVM will get rid of add2() and translate your code 
 * into: 

 * private int add4(int x1, int x2, int x3, int x4) {
    return x1 + x2 + x3 + x4;
}
 */
