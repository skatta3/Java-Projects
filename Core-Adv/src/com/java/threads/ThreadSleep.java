package com.java.threads;
class Hi extends Thread {
	public void run() {
		// Get teh Records from Trasaction Table with OrdeStatus=Success
		// Generate teh Invoice
		//Send teh Invoice to Customer email address
		// Update the DB Table with Order STatus as Invoice Sent
		
	}
	
}
class Hello extends Thread {
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(15000);
			} catch (Exception e) {
				
			}
		}
		
	}
	
}
public class ThreadSleep {
	public static void main(String[] args) {
		Hi obj1 = new Hi();
		Hello obj2 = new Hello();
		
		obj1.start();
		obj2.start();
	}

}
