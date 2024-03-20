package com.java.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class TestList {
	   public static void main(String args[]){

	     LinkedList<String> list=new LinkedList<String>();
	     


	     //Adding elements to the Linked list
	     list.add("Steve");
	     list.add("Carl");
	     list.add("Raj");
	     
	     //Iterating LinkedList
	     Iterator<String> iterator=list.iterator();
	     while(iterator.hasNext()){
	       System.out.println(iterator.next());
	     }

	     //Adding an element to the first position
	     list.add(0, "Negan");

	     //Adding an element to the last position
	     list.addLast("Rick");

	     //Adding an element to the 3rd position
	     list.add(2, "Glenn");
	     
	     System.out.println("------------------------------------");

	     //Iterating LinkedList
	      iterator=list.iterator();
	     while(iterator.hasNext()){
	       System.out.println(iterator.next());
	     }
	   } 
	}
