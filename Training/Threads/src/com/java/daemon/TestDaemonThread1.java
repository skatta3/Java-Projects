package com.java.daemon;

public class TestDaemonThread1 extends Thread{  
	 public void run(){  
		 System.out.println("Name: "+Thread.currentThread().getName());  
		 System.out.println("Daemon: "+Thread.currentThread().isDaemon());  
	 }  
	  
	 public static void main(String[] args){  
		 TestDaemonThread1 t1=new TestDaemonThread1();  
		 TestDaemonThread1 t2=new TestDaemonThread1();  
		 t1.start();  
		 t1.setDaemon(true);//will throw exception here  
		 t2.start();  
	 }  
}  

// If you want to make a user thread as Daemon, it must not be started otherwise it will
// throw IllegalThreadStateException.