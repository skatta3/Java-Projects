package com.java.multithread;

// Program of performing two tasks by two threads

class ReaderThread1 extends Thread{  
	 public void run(){  
	   System.out.println("task one -- Reading the Data from CSV File");  
	 }  
}  
	  
class WriterThread1 extends Thread{  
	 public void run(){  
	   System.out.println("task two -- Writing the Data into Database");  
	 }  
}  
	  
public class TestMultiTask1{  
	 public static void main(String args[]){  
		 ReaderThread1 t1=new ReaderThread1();  
		 WriterThread1 t2=new WriterThread1();  
	  
	  t1.start();  
	  t2.start();  
	 }  
}  