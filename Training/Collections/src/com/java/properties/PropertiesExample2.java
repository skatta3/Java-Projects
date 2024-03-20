package com.java.properties;

import java.util.*;  
import java.io.*;  

// Create the Properties file
public class PropertiesExample2 {  
	public static void main(String[] args)throws Exception{  	  
		Properties p=new Properties();  
		p.setProperty("name","Sonoo Jaiswal");  
		p.setProperty("email","sonoojaiswal@javatraining.com");  
		  
		p.store(new FileWriter("info.properties"),"Properties Example");  
	  
	}  
}  