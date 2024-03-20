package com.java.threads;

public class ThreadExample extends Thread{ //Thread extends Object implements Runnable
	
	public void run() {	//Running
		for(int i=1; i<=5;i++) {
			System.out.println("The Value of i is: " + i  + " "+ Thread.currentThread().getName());

//			try {
//				Thread.sleep(1000);	//Non-Runnable
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}	
	}	//Terminated Or Dead
	
	public static void main(String[] args) {
		ThreadExample T1 = new ThreadExample();  //New
		T1.setName("Reader Thread");
		T1.run();  //Runnable
		
		ThreadExample T2 = new ThreadExample();
		T2.setName("Reader Thread-01");
		T2.run();
		
	}

}
