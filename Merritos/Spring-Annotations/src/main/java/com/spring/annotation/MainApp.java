package com.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		
		// Reading from Bean Configuration XML file
//		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		
//		Student student = context.getBean("student", Student.class);
//		
//		student.displayStudentInfo();
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollegeStudent.class);
		context.registerShutdownHook();
		CollegeStudent cStudent = context.getBean("collegeStudentBean",CollegeStudent.class);
//		context.registerShutdownHook();
		context.close();
		cStudent.displayStudentInfo();


	}
}
