package com.java.training.threads;


//One way of creating the thread
public class MyClass implements Runnable {
	public void run(){
		System.out.println("Created Thread by implementing Runnable Interface");
		System.out.println("00000000 " + Thread.currentThread().getName());
   } 
	
	public static void main(String[] args) {
//		Thread t1 = new Thread(new MyClass ());
//		t1.run();
		
		MyClass t1 = new MyClass();
		t1.run();
		
		MyClass1 t2 = new MyClass1();
		t2.start();
		System.out.println("11111111 " + t2.currentThread().getName());
		
	}
}

//Another way of Creating thread
class MyClass1 extends Thread {
    public void run(){
    	System.out.println("Created Thread by extending Thread class");
    	System.out.println("2222222222 " + Thread.currentThread().getName());
  }
    
   @Deprecated
    public void stop() {
    	System.out.println("Thread Stop");
    }
}
