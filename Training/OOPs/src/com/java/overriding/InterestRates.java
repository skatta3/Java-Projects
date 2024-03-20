package com.java.overriding;

//Java Program to demonstrate the real scenario of Java Method Overriding  
//where three classes are overriding the method of a parent class.  
//Creating a parent class.  
class FederalBank{  
	protected int getRateOfInterest(){  //Overriden Method
		return 0;
	}  
}  

//Creating child classes.  
class DCU extends FederalBank{  
	public int getRateOfInterest(){  //Overriding Method
		return 8;
	}  
}  

class CapitalOne extends FederalBank{  
	int getRateOfInterest(){
		return 7;
	}  
}  

class Telhio extends FederalBank{  
	int getRateOfInterest(){
		return 9;
	}  
}  

//Test class to create objects and call the methods  
public class InterestRates{  
	public static void main(String args[]){  
		DCU s=new DCU();  
		CapitalOne i=new CapitalOne();  
		Telhio a=new Telhio();  
		System.out.println("DCU Rate of Interest: "+s.getRateOfInterest());  
		System.out.println("CapitalOne Rate of Interest: "+i.getRateOfInterest());  
		System.out.println("Telhio Rate of Interest: "+a.getRateOfInterest());  
	}  
}  