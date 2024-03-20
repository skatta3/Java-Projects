package com.java.hooks;

class MyThread extends Thread{  
    public void run(){  
        System.out.println("shut down hook task completed..");  
    }  
}  
  
public class TestShutdownHook{  
	public static void main(String[] args)throws Exception {  	  
		/**
		 * Factory Method - The method that returns the instance of a class is known as 
		 * factory method.
		 */
		Runtime r=Runtime.getRuntime();  

		r.addShutdownHook(new MyThread());  
		      
		System.out.println("Now main sleeping... press ctrl+c to exit");  
		try{
			Thread.sleep(3000);
		}catch (Exception e) 
		{}  
	}  
}  
