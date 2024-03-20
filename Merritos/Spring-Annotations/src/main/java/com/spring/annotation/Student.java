package com.spring.annotation;

import org.springframework.beans.factory.annotation.Required;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	private String studentName;
	private String course;
	private String hobby;
		
	public String getStudentName() {
		return studentName;
	}
	

	@Value("${student.name}")
//	@Value("Ken caldwell")
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCourse() {
		return course;
	}
	
	@Value("${student.course}")
	public void setCourse(String course) {
		this.course = course;
	}
	public String getHobby() {
		return hobby;
	}
	
	@Value("${student.hobby}")
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public void displayStudentInfo() {
		System.out.println("Student Name is: " + studentName);
		System.out.println("Student Course is: " + course);
		System.out.println("Student Hobby is: " + hobby);
	}
}


