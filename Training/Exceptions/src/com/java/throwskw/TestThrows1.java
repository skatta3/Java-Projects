package com.java.throwskw;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;  

// Normal flow where hecked exceptions can be propagated by throws keyword.
public class TestThrows1{  
  @SuppressWarnings("resource")
	void division(int p, int q) throws IOException,FileNotFoundException{  
		  System.out.println("Division Method------------");
	      PrintWriter pw;  
	
			pw = new PrintWriter("D://JPtest.txt"); // may throw exception
			pw.write("New File created using PrintWriter Object");
			pw.println("saved");
			throw new IOException("device error");//checked exception  
	//	  int r = p/q;
	  }  
  
	  void subtract(int a, int b) throws IOException {  
		  System.out.println("Subtract Method------------");
	
		  division(12,0);  
	  }  
  
	  void add(int x, int y){  
		  System.out.println("Add Method------------");
		   try{  
			   subtract(6,5);  
		   }catch(Exception e){
			   System.out.println(e.getMessage());
			   System.out.println("exception handled");
			}  
	  }  
  
  public static void main(String args[]){  
	  TestThrows1 obj=new TestThrows1();  
	  System.out.println("Main Method------------");
	   obj.add(2,3);  
	   System.out.println("normal flow...");  
  }  
}  