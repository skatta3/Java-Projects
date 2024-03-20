package com.java.threads;

public class MultiThread {
	 public static void main(String[] args) {
	  // TODO Auto-generated method stub
	  MultiThread1 mt1 = new MultiThread1("Thread 1 in MultiThread");
	  mt1.start();
	  MultiThread1 mt2 = new MultiThread1("Thread 2 in Multi Thread");
	  mt2.start();
	 }
}

class MultiThread1 implements Runnable {
	 Thread testThread;
	 private String tName;
	 MultiThread1(String name) {
	  tName = name;
	 }
@Override
public void run() {
	  System.out.println("Thread running" + tName);
	  for (int i = 0; i < 4; i++) {
	   System.out.println(i);
	   System.out.println(tName);
	   try {
	    Thread.sleep(1000);
	   } catch (InterruptedException e) {
	    System.out.println("Thread has been interrupted");
	   }
	  }
}
//public void start() {
// System.out.println("Thread started");
// if (testThread == null) {
//	  testThread = new Thread(this, tName);
//	  testThread.start();
// }
//
//}
}
