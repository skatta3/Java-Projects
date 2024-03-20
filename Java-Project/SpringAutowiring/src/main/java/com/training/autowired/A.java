package com.training.autowired;

public class A {  
	B b;  
	
	A(){
		System.out.println("a is created");
	}  
	public B getB() {  
		System.out.println("B getter");
	    return b;  
	}  
	public void setB(B b) {  
		System.out.println("B Setter");
	    this.b = b;  
	}  
	
	void print(){
		System.out.println("hello a");
	}  
	void display(){  
	    print();  
	    b.print();  
	}  
}  