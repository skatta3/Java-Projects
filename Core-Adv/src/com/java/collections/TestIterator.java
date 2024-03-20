package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
	 
public class TestIterator {
	  public static void main(String args[]){
	    ArrayList<String> names = new ArrayList<String>();	    
	    names.add("Java");
	    names.add("Python");
	    names.add("Perl"); 
	 
	 
	    //Adding Integer value to String ArrayList
	    names.add(new Integer(10));

	    Iterator<String> it = names.iterator();   
	 
	    while(it.hasNext()) {
	     // String obj = (String)it.next();
	      String obj = it.next();	      
	      System.out.println(obj);
	    }
	  }
	  
	  
	// Without Generics  
//	  public static void main(String args[]){
//		    ArrayList names = new ArrayList();
//		    names.add("Java");
//		    names.add("Python");
//		    names.add("Perl");
//		 
//		    //Adding Integer value to String ArrayList
//		    names.add(new Integer(10));
//
//		    Iterator it = names.iterator();
//		 
//		    while(it.hasNext()) {
//		      String obj = (String)it.next();
//		     // String obj = it.next();	      
//		      System.out.println(obj);
//		    }
//		  }
	}

