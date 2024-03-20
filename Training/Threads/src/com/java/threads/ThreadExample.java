package com.java.threads;

public class ThreadExample extends Thread {
	public void run(){  //Running State
		System.out.println("thread is running...");  
		try {
			Thread.sleep(30); // Non-Runnable State
		} catch(Exception e) {
			
		}
	}  
	public static void main(String args[]){  
		ThreadExample t1=new ThreadExample();  // New State -- Thread is just created
		t1.start();  //Runnable State  -- Initialization is completed
	}  
}
