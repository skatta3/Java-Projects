package com.java.arraylist;

import java.util.*;  
// Get and Set ArrayList
public class TestArrayList2{  
	 public static void main(String args[]){  
		  ArrayList<String> al=new ArrayList<String>();  
		  al.add("Mango");  
		  al.add("Apple");  
		  al.add("Banana");  
		  al.add("Grapes");  
		  
		  //accessing the element    
		  System.out.println("Returning element: "+al.get(1));//it will return the 2nd element, because index starts from 0  
		  //changing the element  
		  al.set(1,"Dates");  
		  //Traversing list using for each loop
		  for(String fruit:al)    
		    System.out.println(fruit);    
	  
	 }  
}  