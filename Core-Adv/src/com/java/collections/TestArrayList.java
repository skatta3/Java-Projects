package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList { 
	    public static void main(String[] args) 	                       
	    { 
	        // size of ArrayList 
	        int n = 5; 
	  
	        //declaring ArrayList with initial size n 
	        ArrayList arrli = new ArrayList(n); 

//	        ArrayList<Integer> arrli = new ArrayList<Integer>(n); 
	        System.out.println("Array List Size : " + arrli.size());
	        
//	        // Appending the new element at the end of the list 
	        for (int i=1; i<=n+1; i++) 
	            arrli.add(i); 
	        arrli.add(12);
	        arrli.add(10);
	        arrli.add("TEST");
//	        // Printing elements 
	        System.out.println(arrli); 
//	  
//	        // Remove element at index 3 
	        arrli.remove(3); 
//	  
//	        // Displaying ArrayList after deletion 
	        System.out.println("Array List after Deletion :" + arrli); 
//	  
//	        // Printing elements one by one 
//	        for (int i=0; i<arrli.size(); i++) 
//	            System.out.print("Array List Elements : " + arrli.get(i)+"\n "); 
//	        
	        arrli = new ArrayList<Integer>(10);
	        arrli.add(12);
	        arrli.add(10);
	        
	        System.out.println("Array Element at Index 1: "  + arrli.get(1));
//
//	        System.out.println("Array List Size : " + arrli.size());
//
//	        // Printing elements one by one 
//	        for (int i=0; i<arrli.size(); i++) 	        
//	        	System.out.print(arrli.get(i)+" "); 
//	        
	        Iterator itr=arrli.iterator();
	        while(itr.hasNext()){
	        	 System.out.println(itr.next());
	        	 }
//	        
//	        for (int i=0; i<arrli.size(); i++) {
//	            System.out.print("Array List Elements : " + arrli.get(i)+"\n "); 
//	        }
	        
	        
	        ArrayList<String> arrlist = new ArrayList<String>(n); 
	        arrlist.add("Apple");
	        arrlist.add("Mango");
	        arrlist.add("Guava");
	        arrlist.add("Orange");
	        arrlist.add("Papaya");
	        arrlist.add("Sapota");
	        arrlist.add("Mango");
	        arrli.add("");

	        
	        System.out.println(arrlist.get(2));
	        
	        for (int i=0; i<arrlist.size(); i++) {
	            System.out.print("Array List Elements : " + arrlist.get(i)+"\n "); 
	        }
	        
	    } 
	}


