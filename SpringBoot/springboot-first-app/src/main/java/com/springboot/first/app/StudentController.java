package com.springboot.first.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Srinivas", "Katta");
	}
	
	@GetMapping("/students")
	public List<Student> getStudents() {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Srinivas", "Katta"));
		students.add(new Student("Kapil", "Dev"));
		students.add(new Student("Sardar", "Patel"));
		students.add(new Student("Abdul", "Kalam"));
		students.add(new Student("Ken", "Caldwell"));
		return students;
	}
}
