package com.java.interfaces;

interface IPrintable{  
	void print();  
}  

interface IShowable extends IPrintable{  
	void show();  
}  

public class InterfaceInheritance implements IShowable{  
	public void print(){
		System.out.println("Hello");
	}  
	
	public void show(){
		System.out.println("Welcome");
	}  
  
	public static void main(String args[]){  
		InterfaceInheritance obj = new InterfaceInheritance();  
		obj.print();  
		obj.show();  
	}  
}  