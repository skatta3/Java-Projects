package com.test;

public class Student {
	String name;
	int rollno;
	String course;
	private double cgpa;
	
	public double getCgpa() {
		return cgpa;
	}

	private void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	public Student() {
		this.name = "Srinivas";
		this.rollno = 12;
		this.course="M.S";
		this.cgpa = 8.5;
		System.out.println("Calling Default Constructor from Student Class");
	}
	
	public double averageMarkes(Student s1, Student s2) {
		return 12;
	}
	public double averageMarkes(Student s1, Student s2, Student s3) {
		return 12;
	}	
	public double averageMarkes(Student s1, Student s2, Student s3, Student s4) {
		return 12;
	}
}
