package com.spring.annotation;

import org.springframework.beans.factory.annotation.Required;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class CollegeStudent {
	private String studentName;
	private String course;
	private String hobby;
		
	@Bean
	public CollegeStudent collegeStudentBean() {
		return new CollegeStudent();
	}
	
	public String getStudentName() {
		return studentName;
	}
	

//	@Value("${student.name}")
	@Value("Ken caldwell")
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCourse() {
		return course;
	}
	
	@Value("Java")
	public void setCourse(String course) {
		this.course = course;
	}
	public String getHobby() {
		return hobby;
	}
	
	@Value("Watching Movies")
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public void displayStudentInfo() {
		System.out.println("Student Name is: " + studentName);
		System.out.println("Student Course is: " + course);
		System.out.println("Student Hobby is: " + hobby);
	}
}


