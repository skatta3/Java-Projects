package com.training.java;

public class Project {
	
	public static void main(String[] args) {
		System.out.println("Assigning 2 Employees for this Project");
		Employee emp1 = new Employee(1, "Srinivas", 20000, false);  //Default Constructor will be called here
		emp1.displayInfo();
		emp1.bonus(3);
		System.out.println("Project Name: " + emp1.ProjectName);
		
		Employee emp2 = new Employee(2, "Jaber", 10000, true);  // Argument Constructor will be called 
		emp2.displayInfo();
		emp2.bonus(2);
		System.out.println("Project Name: " + emp2.ProjectName);
		
//		System.out.println("Employee ID: " + emp2.empID);
		System.out.println("Employee Name: " + emp2.empName);
		System.out.println("Employee Salary: " + emp2.empSalary);
		System.out.println("Employee Willing to Relocate: " + emp2.relocate);
		
	}

}
