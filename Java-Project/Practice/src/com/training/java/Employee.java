package com.training.java;

public class Employee {
	
	static String ProjectName="Online Book Library";  //Static Variable or Class Variable
	
	//Attributes or Fields -- These are all Instance Variables (Non static Variables
	private int empID;
	public String empName;
	protected float empSalary;
	boolean relocate;
	
	//Default Constructor
	public Employee() {
		System.out.println("Default Constructor: Employee Object is created");
	}
	
	//Argument Constructor
	public Employee(int id, String name, float sal, boolean rel) {
		this.empID = id;
		this.empName = name;
		this.empSalary = sal;
		this.relocate = rel;
	}
	
	//Methods
	public void displayInfo() {
		System.out.println("Employee Information "  + empID + " " + empName + " " + empSalary + " " + relocate);
		
	}
	
	public int bonus(int bonus) {
		int WorkingHours = 2000;  //Local Variable
		return WorkingHours * bonus;
	}
}
