package com.java.finallyblock;

// exception doesn't occur.
public class TestFinallyBlock {
	  public static void main(String args[]){  
		  try{  
			   int data=25/5;  
			   System.out.println(data);  
			   
			   //Opening a file
			   //Processing the file
			   //Closing the file
		  }  
		  catch(NullPointerException e){
			  System.out.println(e);
		  }  
		  finally{
			  System.out.println("finally block is always executed");
			  
			  //Closing the file
		  }  
		  System.out.println("rest of the code...");  
	  }  
}  