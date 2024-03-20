package com.java.training.exceptions;

import java.io.IOException;

public class ThrowsExceptionPropagation {
	 public static void main(String args[]){  
	    try{  
	    	Throwsprop m=new Throwsprop();  
	    	m.method();  
	    }catch(Exception e){
	    	System.out.println("exception handled");
	    }     
	  
	    System.out.println("normal flow...");  
	  }  
}

class Throwsprop{  
	 void method()throws IOException{  
		 throw new IOException("device error");  
	 }  
	}  
