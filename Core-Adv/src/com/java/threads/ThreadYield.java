package com.java.threads;

public class ThreadYield {
	public static void main(String[] args) {
		MyThread r = new MyThread();
		
		Thread t1 = new Thread(r,"T1");
		Thread t2 = new Thread(r,"T2");
		
		t1.start();
		t2.start();		
	}
}

class MyThread implements Runnable {
	public void run() {
		
		for(int i=0;i<=5;i++) {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName +"\t"+"i = "+i);
			if("T1".equals(threadName)) {
				Thread.currentThread().yield();
			}
		}
	}
}
