package com.java.LinkedHashSet;

import java.util.*;  
class LinkedHashSetExample{  
	 public static void main(String args[]){  
		 //Creating HashSet and adding elements  
        LinkedHashSet<String> set=new LinkedHashSet();  
	       set.add("One");    
	       set.add("Two");    
	       set.add("Three");   
	       set.add("Five");  
	       set.add("Four");  
	       
	       Iterator<String> i=set.iterator();  
	       while(i.hasNext())  
	       {  
	    	   System.out.println(i.next());  
	       }  
	 }  
}  