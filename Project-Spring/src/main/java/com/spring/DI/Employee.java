package com.spring.DI;

public class Employee {
	private int empID;
	private String empName;
	private float empSal;
	private Address address;
	
	
	public Employee(int empID, String empName, float empSal, Address address) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empSal = empSal;
		this.address = address;
	}
	
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getEmpSal() {
		return empSal;
	}
	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

}
