package com.java.Annotations;

import java.util.*;  

public class Suppressed{  
	
	public static void main(String args[]){  
		ArrayList list=new ArrayList();  
		list.add("sonoo");  
		list.add("vimal");  
		list.add("ratan");  
		list.add(12);
	  
		for(Object obj:list)  
			System.out.println(obj);  
	  
		}
	}  

