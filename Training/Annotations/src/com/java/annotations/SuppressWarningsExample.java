package com.java.annotations;

import java.util.ArrayList;  
class SuppressWarningsExample{  

	@SuppressWarnings({ "", "unchecked" })
	public static void main(String args[]){  
		@SuppressWarnings("rawtypes")
		ArrayList list=new ArrayList();  
		list.add("sonoo");  
		list.add("vimal");  
		list.add("ratan");  
		  
		for(Object obj:list)  
			System.out.println(obj);  	  
		}
	}  