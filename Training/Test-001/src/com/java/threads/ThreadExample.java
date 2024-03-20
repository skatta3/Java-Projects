package com.java.threads;

public class ThreadExample extends Thread{
	
	public void run() { //Running State

		for (int i=0; i<5;i++) {
			System.out.println("The Value of i by: " + Thread.currentThread().getName() + " "+ i);
			try {
				Thread.sleep(1000);  //Non-runnable State
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} // Terminated (Dead) State

	}
	
	public static void main(String[] args) {
		ThreadExample t1 = new ThreadExample();  //New State
		ThreadExample t2 = new ThreadExample();
		
		t1.setName("Reader Thread");
		t2.setName("Writer Thread");
		t1.start(); //Runnable
		t2.start();
	}
}
