package com.java.finalkw;

 final class Bike{
	 void run(){
		  System.out.println("running safely with 100kmph");
	  }  
}  

public class FinalClass extends Bike{  
  void run(){
	  System.out.println("running safely with 100kmph");
  }  
    
  public static void main(String args[]){  
	  FinalClass fc= new FinalClass();  
	  fc.run();  
  }  
}  