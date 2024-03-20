package com.java.threads;

public class ThreadPriorityExample extends Thread{  
	 public void run(){  
		 System.out.println("running thread name is:"+Thread.currentThread().getName());  
		 System.out.println("running thread priority is:"+Thread.currentThread().getPriority());  	  
	  }  

	 public static void main(String args[]){  
		 ThreadPriorityExample m1=new ThreadPriorityExample();  
		 ThreadPriorityExample m2=new ThreadPriorityExample();  
		 
		  m1.setPriority(Thread.MIN_PRIORITY);  // 1
		  m2.setPriority(Thread.MAX_PRIORITY);  //10
		  
		  m1.start();  
		  m2.start();  		   
	 }  
}     