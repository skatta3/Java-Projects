package com.springjdbc.model;

public class Employee2 {
	int empId;
	String empName;
	float empSalary;
	
	public Employee2() {
		
	}
	
	public Employee2(int id, String name, float sal) {
		this.empId = id;
		this.empName = name;
		this.empSalary = sal;
	}
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}
	
	@Override
	public String toString() {
		return ("Employee ID: " + empId + " Employee Name: " + empName + "Employee Salary: " + empSalary);
	}
}
