package com.java.training.threads;

public class ThreadYield {
	public static void main(String[] args) {
		MyThread r = new MyThread();
		
		Thread t1 = new Thread(r,"TRANSACTIONS");
		Thread t2 = new Thread(r,"INVOICE");
		
		t1.start();
		t2.start();		
	}
}

class MyThread implements Runnable {
	public void run() {
		
		for(int i=0;i<=5;i++) {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName +"\t"+"i = "+i);
			if("TRANSACTIONS".equals(threadName)) {
				Thread.yield();
//				System.out.println("Stopping the Thread");
			}
		}
	}
}
