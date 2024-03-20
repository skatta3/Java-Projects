package com.java.finalkw;

public class FinalVariable {
	 final int speedlimit;//final variable  
	 
	 final int speed = 100;
	 
	 
	 FinalVariable() {
		 speedlimit = 45;
	 }
	 
	 void run(){  
//		 speedlimit=400;  
	 }  
	 
	 public static void main(String args[]){  
		 FinalVariable obj=new  FinalVariable();  
		 obj.run();  
		 
		 System.out.println(obj.speedlimit);
	 }  		
}