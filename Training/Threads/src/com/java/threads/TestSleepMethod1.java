package com.java.threads;

public class TestSleepMethod1 extends Thread{  
	 public void run(){  
		  for(int i=1;i<5;i++){  
			    try{
//			    	System.out.println(Thread.currentThread().getName());
			    	Thread.sleep(100);  //milliseconds
//			    	Thread.sleep(2000, 7869);  //milliseconds, nanoseconds
			    }catch(InterruptedException e){
			    	System.out.println(e);
			    }  
			    System.out.println(Thread.currentThread().getName());
			    System.out.println(i);  
		  }  
	 }  
	 public static void main(String args[]){  
		  TestSleepMethod1 t1=new TestSleepMethod1();  
		  TestSleepMethod1 t2=new TestSleepMethod1();  
		   
		  t1.start();  
		  t2.start();  
		  
//		  t1.run();
//		  t2.run();
		  
		  t1.setName("Reader Thread");
		  t2.setName("Writer Thread");
	 }  
}  