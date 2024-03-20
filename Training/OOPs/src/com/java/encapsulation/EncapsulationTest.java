package com.java.encapsulation;

//A Java class to test the encapsulated class.  
public class EncapsulationTest {
	public static void main(String[] args){  
		//creating instance of the encapsulated class  
		Student s=new Student();  
		
		//setting value in the name member  
		s.setName("vijay");  
		
		//getting value of the name member  
		System.out.println(s.getName());  
		}  
}