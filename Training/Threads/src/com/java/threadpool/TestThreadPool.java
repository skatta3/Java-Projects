package com.java.threadpool;

import java.util.concurrent.ExecutorService;  
import java.util.concurrent.Executors;  

public class TestThreadPool implements Runnable {  
    private String message;  
    public TestThreadPool(String s){  
        this.message=s;  
    }  
     public void run() {  
        System.out.println(Thread.currentThread().getName()+" (Start) Task = "+message);  
        processmessage();//call processmessage method that sleeps the thread for 2 seconds  
        System.out.println(Thread.currentThread().getName()+" (End)");//prints thread name  
    }  
    private void processmessage() {  
        try {  
        	Thread.sleep(2000);  
        	System.out.println("Processing the Messages");
       	} catch (InterruptedException e) { 
        		e.printStackTrace(); 
       	}  
    } 
}  