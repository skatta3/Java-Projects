package com.java.arraylist;

import java.util.*;  
// Iterating ArrayList using Iterator
public class TestArrayList1{  
	public static void main(String args[]){  
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		
		list.add("Chris");//Adding object in arraylist  
		list.add("Soyars");  
		list.add("Clayton");  
		list.add("James");  
		
		//Traversing list through Iterator  
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
	}  
}  