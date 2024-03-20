package com.java.stream;

/**
 *  Finding certain strings with Stream
 */
import java.util.ArrayList;
import java.util.List;
public class StreamExample1_1{ 
   public static void main(String[] args) {    
	List<String> names = new ArrayList<String>();
	names.add("Ajeet");
	names.add("Negan");
	names.add("Aditya");
	names.add("Steve");
	
	int count = 0;
	for(String s : names) {
		if(s.length() < 6) {
			count++;
		}
	}
	System.out.println(count);
		
	//Using Stream and Lambda expression
	long count = names.stream().filter(str->str.length()<6).count();
	System.out.println("There are "+count+" strings with length less than 6");

   }  
}