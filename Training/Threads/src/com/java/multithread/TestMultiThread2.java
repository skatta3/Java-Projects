package com.java.multithread;

/** Program of performing single task by multiple threads
 * Each thread run in a separate callstack
 * 
 */
public class TestMultiThread2 implements Runnable{  
	public void run(){  
		System.out.println("task one");  
	}  
  
	public static void main(String args[]){  
		Thread t1 =new Thread(new TestMultiThread2());//passing annonymous object of TestMultitasking2 class  
		Thread t2 =new Thread(new TestMultiThread2());  
		  
		t1.start();  
		t2.start();  		  
	}  
}  
