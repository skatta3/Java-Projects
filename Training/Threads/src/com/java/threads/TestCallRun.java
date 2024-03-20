package com.java.threads;

public class TestCallRun extends Thread{  
	 public void run(){  
	   System.out.println("running...");  
	 }  
	 public static void main(String args[]){  
		 TestCallRun t1=new TestCallRun();  
		 t1.run();//fine, but does not start a separate call stack  
	 }  
	}  