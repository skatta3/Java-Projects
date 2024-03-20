package com.java.training.threads;
class Transaction extends Thread {
	public void run() {  //Running State
		// Get teh Records from Trasaction Table with OrdeStatus=Success
		// Generate teh Invoice
		//Send teh Invoice to Customer email address
		// Update the DB Table with Order STatus as Invoice Sent
		for(int i=1; i<=5; i++) {
			System.out.println("Transaction is completed Successfully");
			
			try {
				Thread.sleep(10000);
			} catch (Exception e) {
				
			}
		}	
		
		
	}
	
}
class Invoice extends Thread {
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("Invoice is Generated Successfully");
			
			try {
				Thread.sleep(10000);
			} catch (Exception e) {
				
			}
		}
		
	}
	
}
public class ThreadSleep {
	public static void main(String[] args) {
		Transaction obj1 = new Transaction();  // New State
		Invoice obj2 = new Invoice();
		
		obj1.start();  //Runnable State
		obj2.start();
		
		System.out.println(obj1.isAlive());
	}

}
