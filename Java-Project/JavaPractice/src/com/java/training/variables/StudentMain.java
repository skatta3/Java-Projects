package com.java.training.variables;

import java.util.Date;

public class StudentMain {

	public static void main(String[] args) {
		Student st1 = new Student("ÄBC");
		System.out.println(st1.studentName);
		st1.showData();
		
		Student st2 = new Student("DEF");
		System.out.println(st2.studentName);
		st2.showData();
		
		System.out.println(st1.numberOfStudents);
		System.out.println(st2.numberOfStudents);
		
		Date date = new Date();
		
		System.out.println("Today's Date is :: " + date.getDate());
		
		
		
	}

}
