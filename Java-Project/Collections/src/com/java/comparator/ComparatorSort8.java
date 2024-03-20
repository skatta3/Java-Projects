package com.java.comparator;

import java.util.*;    
public class ComparatorSort8{    
	public static void main(String args[]){    
		ArrayList<Student8> al=new ArrayList<Student8>();    
		al.add(new Student8(101,"Vijay",23));    
		al.add(new Student8(106,"Ajay",27));    
		al.add(new Student8(105,"Jai",21));  
		
		//Sorting elements on the basis of name  
		Comparator<Student8> cm1=Comparator.comparing(Student8::getName);  
		 Collections.sort(al,cm1);  
		 System.out.println("Sorting by Name");  
		 for(Student8 st: al){  
		   System.out.println(st.rollno+" "+st.name+" "+st.age);  
		  }  
		 //Sorting elements on the basis of age  
		  Comparator<Student8> cm2=Comparator.comparing(Student8::getAge);  
		Collections.sort(al,cm2);  
		 System.out.println("Sorting by Age");  
		 for(Student8 st: al){  
		   System.out.println(st.rollno+" "+st.name+" "+st.age);  
		  }    
	}    
}    