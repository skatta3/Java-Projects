package com.java.interfaces;

interface printable{  
	String paperSize="A4"; //public static final String paperSize="A4";
	void print();  //public abstract void print();
	void printbothsides();
}  

public class A6 implements printable{  
	public void print(){
		System.out.println("Hello");
	}  
	
	public void printbothsides(){
		System.out.println("It Prints both sides of the Paper");
	}  
	
	public static void main(String args[]){  
		A6 obj = new A6();  
		obj.print();  
	}  
}  