package com.java.threads;

public class ThreadExample2 implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread is Craeted using Runnable Interface");
	}
	
	public static void main(String[] args) {
		ThreadExample2 tr = new ThreadExample2();
		Thread t1 = new Thread(tr);
		
		t1.start();
	}

}
