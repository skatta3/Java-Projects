package com.java.properties;

// Get the System Properties

import java.util.*;  
import java.io.*;  
public class PropertiesExample1 {  
	public static void main(String[] args)throws Exception{  	  
		Properties p=System.getProperties();  
		Set set=p.entrySet();  
		  
		Iterator itr=set.iterator();  
		while(itr.hasNext()){  
			Map.Entry entry=(Map.Entry)itr.next();  
			System.out.println(entry.getKey()+" = "+entry.getValue());  
		}  
	  
	}  
}  