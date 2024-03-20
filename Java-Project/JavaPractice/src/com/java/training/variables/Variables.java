package com.java.training.variables;

import com.java.training.methods.Student;

public class Variables {
	String collegeName;
	
	{
		System.out.println("This is Anonymous class");
	}
	
	class department {
		
	}

	     public static void main(String[] args)
	     {  
	    	 
	    	 Variables var = new Variables();
	    	 int totalStudents;
	     Student s1 = new Student();
	     
	     Student s3 = new Student("Madhukar");
	     
	     
	     System.out.println("Student s1 Name:" + s1.studentName);
	     
	     System.out.println("Student s3 Name:" + s3.studentName);
	     
	     s3.setStudentName("Pavan");
	     System.out.println("Student s3 Name:" + s3.studentName);

	     
	     System.out.println("Total # of STudents:" + s1.numberOfStudents);
	     System.out.println("Total # of STudents:" + s3.numberOfStudents);
//	     
//	     s1.setStudentName("Srinivas");
//	     s1.showData();
//	     Student s2 = new Student();
//	     s2.setStudentName("John");
//	     s2.showData();
//	     
//	     System.out.println("Total Number of STudents in a Class:  " +  Student.numberOfStudents);
//	     //s1.showData();
	     }
	}
