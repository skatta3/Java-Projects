package com.java.training.variables;

public class Student {	
	public String studentName; //Non Static or Instance Variable
	public static int numberOfStudents; //initialized to zero only when class is loaded not for each object created.

  public Student(){
   //Constructor incrementing static variable 
	  numberOfStudents++;
  }
  
  public Student(String name){
	   //Constructor incrementing static variable 
		  numberOfStudents++;
		  this.studentName = name;
	  }

   public void showData(){
	   int studentAge;
      System.out.println("Student Name = "+studentName);
      System.out.println("Student Number = "+numberOfStudents);
   }
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}
