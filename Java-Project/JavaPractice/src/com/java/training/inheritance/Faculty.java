package com.java.training.inheritance;

public class Faculty {
	   String designation;
	   String collegeName;
	   String subject;
	   
	   private double salary;
	   
	   public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Faculty() {
		   this.designation = "Teacher";
		   this.collegeName = "Wesley";
	   }
	   
   void does(){ //overriden method
		System.out.println("Teaching");
	   }
	}

