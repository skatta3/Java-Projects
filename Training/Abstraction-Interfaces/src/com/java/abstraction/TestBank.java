package com.java.abstraction;

abstract class Bank{    
	abstract int getRateOfInterest();    
}  

class DCU extends Bank{    
	int getRateOfInterest(){
		return 7;
	}    
}  

class CapitalOne extends Bank{    
	int getRateOfInterest(){
		return 8;
	}    
}    
    
public class TestBank{    
	public static void main(String args[]){    
		Bank b; 
		b=new DCU();  
		System.out.println("Rate of Interest of DCU is: "+b.getRateOfInterest()+" %");    
		b=new CapitalOne();  
		System.out.println("Rate of Interest of CapitalOne is: "+b.getRateOfInterest()+" %");    
	}
}    