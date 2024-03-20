package com.java.training.threads;
public class ThreadAnanymous {
	public static void main(String[] args) {
		Runnable obj1 = new Runnable()
				{
					public void run() {
						for(int i=1; i<=5; i++) {
							System.out.println("Hi");
							try {
								Thread.sleep(1000);
							} catch (Exception e) {
								
							}
						}
						
					}
				};
		Runnable obj2 = new Runnable()
				{
					public void run() {
						for(int i=1; i<=5; i++) {
							System.out.println("Hello");
							try {
								Thread.sleep(1000);
							} catch (Exception e) {
								
							}
						}
						
					}
				};
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.start();
		t2.start();
	}
}
