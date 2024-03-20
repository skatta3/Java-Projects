package com.java.threads;

public class ThreadExample1 implements Runnable{
	
	public void run() {
		for(int i=1; i<=5;i++) {
			System.out.println("The Value of i is: " + i  + " "+ Thread.currentThread().getName());
		}	
	}
	
	public static void main(String[] args) {
		ThreadExample1 TE1 = new ThreadExample1();
		
		Thread T1 = new Thread(TE1);
		T1.start();
		
		ThreadExample1 TE2 = new ThreadExample1();
		
		Thread T2 = new Thread(TE2);
		T2.start();
	}

}
