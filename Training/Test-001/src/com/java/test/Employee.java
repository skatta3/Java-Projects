package com.java.test;

import java.util.Stack;

//import statements
/**
 * 
 * @author skatt
 *
 */

public class Employee { //Class declaration

	// Instance Variables
	private int empID;
	private String empName;
	private float empSalary;
	
	public int getEmpID() {
		return empID;
	}

	private void setEmpID(int empID) {
		this.empID = empID;
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

	private void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}

	//Static or Class Variable
	static String orgName = "Google";
	
	//Constructors
	//Default or No-arg constructor
	public Employee() {
		System.out.println("Default Constructor of the Employee");
	}
	
	public Employee(int id, String name, float sal) {
		this.empID = id;
		this.empName = name;
		this.empSalary = sal;
	}
	
	//Methods
	public void displayInfo() {
		System.out.println("-----------------------------------");
		System.out.println("---------Employee Information---Start---------");
		System.out.println("Employee ID: " + this.empID);
		System.out.println("Employee Name: " + this.empName);
		System.out.println("Employee Salary: " + this.empSalary);
		System.out.println("Employee Organization: " + this.orgName);
		this.getBonus();
		this.getBonus(115);
		System.out.println("-------Employee Information ---- End----------------------------");
	}
	
	//Overridden method
	public void getBonus() throws ArithmeticException {
		float bonus;  //Local Variable
		bonus = this.empSalary * 1.5f;
		System.out.println("Bonus: "  + bonus);
	}
	
	public float getBonus(int projectID) {
		float bonus;  //Local Variable
		
		if(projectID == 115)
			bonus = this.empSalary * 2.5f;	
		else
			bonus = this.empSalary * 1.5f;
		
		System.out.println("Bonus: "  + bonus);
		
		return bonus;
	}
	
	public void getBonus(String projectName) {
		float bonus;  //Local Variable
		
		if(projectName == "Telecom")
			bonus = this.empSalary * 2.5f;	
		else
			bonus = this.empSalary * 1.5f;
		
		System.out.println("Bonus: "  + bonus);
	}
	
	public static void getOrgInfo() {
		System.out.println("This Organization was establieshed in 1990");
	}
	
//	
//	public void sum(int x, int y) {
//		int result = x + y;
//		System.out.println("Sum of 2 Numbers: "  + result);
//	}
//	
//	public void sum(int x, int y, int z) {
//		int result = x + y + z;
//		System.out.println("Sum of 3 Numbers: "  + result);
//	}
	
	public void sum (int x, int... y) {
		int result = x;
		
		for (int i=0; i< y.length; i++)
			result = result + y[i];
		
		System.out.println("The Result is :" + result );
		
	}
}

