package com.java.threads;

public class ThreadJoin {
	public static void main(String[] args) {
		Runnable obj1 = () ->
				{
						for(int i=1; i<=5; i++) {
							System.out.println("Hi");
							try {
								Thread.sleep(1000);
							} catch (Exception e) {
								
							}
						}
						
					}
				;
		Runnable obj2 = () -> 
				{
						for(int i=1; i<=5; i++) {
							System.out.println("Hello");
							try {
								Thread.sleep(1000);
							} catch (Exception e) {
								
							}
						}
						
					}
				;
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();
		
//		try {
//			t1.join();
//			t2.join();
//		} catch (Exception e) {
//			
//		}
		
		System.out.println("Exiting from ThreadExample");
	}

}
