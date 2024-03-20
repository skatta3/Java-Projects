package com.java.training.threads;

public class CurrentThread {

	  public static void main(String[] args){
		  Thread.currentThread().setName("MyThread");
	    System.out.println(Thread.currentThread().getName());
	    
	    for(int i=0; i<4; i++){
		      new Thread(){
		        public void run(){
		          System.out.println("Thread: " + getName() + " running");
		        }
		      }.start();
		      
		    }

	  }
	}


