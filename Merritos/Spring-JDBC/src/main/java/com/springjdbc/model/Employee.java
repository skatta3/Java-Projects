package com.springjdbc.model;

public class Employee {
	int id;
	String name;
	float salary;
	
	public Employee() {
		
	}
	
	public Employee(int id, String name, float sal) {
		this.id = id;
		this.name = name;
		this.salary = sal;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}	
	
	@Override
	public String toString() {
		return ("Employee ID: " + id + " Employee Name: " + name + "Employee Salary: " + salary);
	}
}
