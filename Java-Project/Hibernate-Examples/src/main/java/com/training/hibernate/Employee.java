package com.training.hibernate;  
  
public class Employee {  
	private int id;  
	private String firstName,lastName;  
	private float salary;

	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public int getId() {  
	    return id;  
	}  
	public void setId(int id) {  
	    this.id = id;  
	}  
	public String getFirstName() {  
	    return firstName;  
	}  
	public void setFirstName(String firstName) {  
	    this.firstName = firstName;  
	}  
	public String getLastName() {  
	    return lastName;  
	}  
	public void setLastName(String lastName) {  
	    this.lastName = lastName;  
	}  

}  