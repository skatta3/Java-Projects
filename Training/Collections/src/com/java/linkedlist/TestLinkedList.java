package com.java.linkedlist;

import java.util.*;  
public class TestLinkedList{  
	public static void main(String args[]){  
		LinkedList<String> al=new LinkedList<String>();  
		
		al.add("Chris"); 
		al.add("Soyars");  
		al.add("Clayton");  
		al.add("James");  
		
		Iterator<String> itr=al.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
	}  
}  