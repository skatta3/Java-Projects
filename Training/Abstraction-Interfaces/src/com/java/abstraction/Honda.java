package com.java.abstraction;

abstract class Bike{  
	  abstract void run();  
	  abstract void healthCheck();
}  

public abstract class Honda extends Bike{  
	void run(){
		System.out.println("running safely");
	} 
	
	abstract void healthCheck();
	
	public static void main(String args[]){  
		Bike obj = new Honda();  
		obj.run();  
	}  
}  