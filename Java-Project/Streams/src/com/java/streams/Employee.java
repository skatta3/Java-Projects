package com.java.streams;

import java.io.Serializable;

public class Employee implements Serializable {
	
	/**
	 * 
	 */
//		private static final long serialVersionUID = 1L;
		private String name;
		public int id;
		public int salary;
		private String password;
		public int age;

		
		@Override
		public String toString(){
			return "Employee{name="+name+",id="+id+",salary="+salary+", Password = " + password +"}";
		}
		
		//getter and setter methods
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getSalary() {
			return salary;
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}

		public String getPassword() {
			return password;
		}
	
		public void setPassword(String password) {
			this.password = password;
		}
		
		public int getAge() {
			return age;
		}
	
		public void setAge(int age) {
			this.age = age;
		}
		
	}
