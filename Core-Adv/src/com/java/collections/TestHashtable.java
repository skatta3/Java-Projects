package com.java.collections;

import java.util.Hashtable;
import java.util.Enumeration;

public class TestHashtable {
	 public static void main(String[] args) {
	   Enumeration names;
	   String key;
	 
	   // Creating a Hashtable
	   Hashtable<String, String> hashtable = 
	              new Hashtable<String, String>();
	 
	   // Adding Key and Value pairs to Hashtable
	   hashtable.put("Key1","Google");
	   hashtable.put("Key2","TCS");
	   hashtable.put("Key3","Dell");
	   hashtable.put("Key4","Deloitte");
	   hashtable.put("Key5","IBM");
	 
	   names = hashtable.keys();
	   while(names.hasMoreElements()) {
	      key = (String) names.nextElement();
	      System.out.println("Key: " +key+ " & Value: " +
	      hashtable.get(key));
	   }
	 }
	}
