package com.java.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo {
	
	public static void main(String[] args) {
		
//		ProcessPayRoll process1 = new ProcessPayRoll("thread1");
//		ProcessPayRoll process2 = new ProcessPayRoll("thread2");
//		
//		Thread thread1 = new Thread(process1);
//		Thread thread2 = new Thread(process2);
//		
//		thread1.start();
//		thread2.start();
		
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		for(int i=0;i<10;i++) {
			Runnable processObj = new ProcessPayRoll("MyWorkerThread" + i);
			executorService.execute(processObj);
		}
		
		executorService.shutdown();
		while(!executorService.isTerminated()) {
//			try {
//				executorService.awaitTermination(20, TimeUnit.SECONDS);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
		System.out.println("All Threads completed Successfully");
		
	}

}
