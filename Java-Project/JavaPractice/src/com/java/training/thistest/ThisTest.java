package com.java.training.thistest;

// Program to illustrate this keyword  
// is used to refer current class 
public class ThisTest {
	    // instance variable 
	    int a = 10; 
	  
	    // static variable 
	    static int b = 20; 
	  
	    void print() 
	    { 
	        this.a = 100; 
	  
	        System.out.println(a); 
	  
	        this.b = 600; 
	  
	        System.out.println(b); 
	    } 
	  
	    public static void main(String[] args) 
	    { 
	        // Uncomment this and see here you get  
	        // Compile Time Error since cannot use  
	        // 'this' in static context. 
	        // this.a = 700; 
	        new ThisTest().print(); 
	    } 
	} 