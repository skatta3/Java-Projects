package com.java.multithread;

// Program of performing single task by multiple threads
public class TestMultiThread1 extends Thread{  
	 public void run(){  
	   System.out.println("task one");  
	 }  
	 public static void main(String args[]){  
		 TestMultiThread1 t1=new TestMultiThread1();  
		 TestMultiThread1 t2=new TestMultiThread1();  
		 TestMultiThread1 t3=new TestMultiThread1();  
	  
		  t1.start();  
		  t2.start();  
		  t3.start();  
	 }  
}  