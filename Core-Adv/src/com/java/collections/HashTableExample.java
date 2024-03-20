package com.java.collections;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableExample {

	 public static void main(String[] args) {
	   Enumeration names;
	   String key;
	 
	   // Creating a Hashtable
	   Hashtable<String,String> hashtable = new Hashtable<String,String>();
	 
	   // Adding Key and Value pairs to Hashtable
	   hashtable.put("Key1","Google");
	   hashtable.put("Key2","TCS");
	   hashtable.put("Key3","Dell");
	   hashtable.put("Key4","Deloitte");
	   hashtable.put("Key5","IBM");
//	   hashtable.put("12", 123);
//	   hashtable.put("", 12345);
	 
	   names = hashtable.keys();
	   while(names.hasMoreElements()) {
	      key = (String) names.nextElement();
	      System.out.println("Key: " +key+ " & Value: " +
	      hashtable.get(key));
	   }
	 }
	
}
