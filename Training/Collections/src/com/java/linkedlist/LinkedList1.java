package com.java.linkedlist;

import java.util.ArrayList;
import java.util.Iterator;  
public class LinkedList1{  
	 public static void main(String args[]){  
//		  LinkedList<Integer> al=new LinkedList<Integer>();  
		  
		  ArrayList<Integer> al=new ArrayList<Integer>();  
		  al.add(15);  
		  al.add(3);  
		  al.add(17);  
		  al.add(90);  
		  
		  Iterator<Integer> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
	 }  
}  