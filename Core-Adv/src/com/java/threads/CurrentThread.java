package com.java.threads;

public class CurrentThread {

	  public static void main(String[] args){
	    System.out.println(Thread.currentThread().getName());
	    for(int i=0; i<10; i++){
	      new Thread("" + i){
	        public void run(){
	          System.out.println("Thread: " + getName() + " running");
	        }
	      }.start();
	    }
	  }
	}
