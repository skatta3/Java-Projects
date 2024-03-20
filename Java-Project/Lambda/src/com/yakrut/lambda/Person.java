package com.yakrut.lambda;

import java.util.ArrayList;
import java.util.List;

import com.yakrut.lambda.Main.CheckPerson;

public class Person {
	public enum Gender {
		MALE,FEMALE
	}
	String name;
	int age;
	String emailAddress;
	Gender genderType;
	

	public Person() {
		
	}

	public Person(String name, int age, String emailAddress, Gender genderType) {
		super();
		this.name = name;
		this.age = age;
		this.emailAddress = emailAddress;
		this.genderType = genderType;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public Gender getGenderType() {
		return genderType;
	}
	public void setGenderType(Gender genderType) {
		this.genderType = genderType;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", emailAddress=" + emailAddress + ", genderType=" + genderType
				+ "]";
	}
	
	public void printPerson() {
		System.out.println(this.toString());
	}
	
	public static List<Person> generateDefaultList() {
		List<Person> people = new ArrayList<>();
		
		people.add(new Person("Shabbir",20,"shabbir@gmail.com",Gender.MALE));
		people.add(new Person("Nikhil",21,"nikhil@gmail.com",Gender.MALE));
		people.add(new Person("Shivam",19,"shivam@gmail.com",Gender.MALE));
		
		return people;
	}
}
