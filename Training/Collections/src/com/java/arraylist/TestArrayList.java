package com.java.arraylist;

import java.util.*;  
public class TestArrayList{  
	public static void main(String args[]){  
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
	     list.add("Mango");//Adding object in arraylist    
	     list.add("Apple");    
	     list.add("Banana");    
	     list.add("Grapes");  
	     list.add("Apple");
	        
	     //Printing the arraylist object   
	     System.out.println(list);  
	     System.out.println("Second Element of the List: " + list.get(1));  

	     
	     ArrayList arrList=new ArrayList();
	     arrList.add("Mango");
	     arrList.add(125);
	     
	     System.out.println(arrList); 
	}  
}  