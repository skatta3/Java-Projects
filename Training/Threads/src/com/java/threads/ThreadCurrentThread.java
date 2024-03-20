package com.java.threads;

public class ThreadCurrentThread extends Thread{  
	 public void run(){  
		 
		 System.out.println(Thread.currentThread().getName());  
	 }  

	 public static void main(String args[]){  
		 ThreadCurrentThread t1=new ThreadCurrentThread();  
		 ThreadCurrentThread t2=new ThreadCurrentThread();  
	  
		 t1.setName("Reader Thread");
		 t2.setName("Writer Thread");
		 t1.start();  
		 t2.start();  
	 }  
}  