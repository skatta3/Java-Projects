package com.java.objectstream;

import java.io.Serializable;

public class Student implements Serializable{  
	  int rollno =1;  
	  String name = "Srinivas";  
	  int age = 17; 
	  
	  Student(int rollno,String name,int age){  
		   this.rollno=rollno;  
		   this.name=name;  
		   this.age=age;  
	  }  
	}  