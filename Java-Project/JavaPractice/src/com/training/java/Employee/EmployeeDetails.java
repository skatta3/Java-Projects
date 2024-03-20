package com.training.java.Employee;
/** Case Study **/
import java.io.*;

public class EmployeeDetails {

   String name;
   int age;
   String designation;
   double salary;
   static String orgName;
   
   private int service;

   EmployeeDetails() {
	   
   }
		
   
   
   // This is the constructor of the class EmployeeDetails
   public EmployeeDetails(String name) {
      this.name = name;
   }

   // Assign the age of the Employee  to the variable age.
   public void empAge(int empAge) {
      age = empAge;
   }

   /* Assign the designation to the variable designation.*/
   public void empDesignation(String empDesig) {
      designation = empDesig;
   }

   /* Assign the salary to the variable	salary.*/
   public void empSalary(double empSalary) {
      salary = empSalary;
   }

   /* Print the Employee details */
   public void printEmployee() {
	   int Salary = 0;
      System.out.println("Name:"+ name );
      System.out.println("Age:" + age );
      System.out.println("Designation:" + designation );
      System.out.println("Salary:" + salary);
   }
}

class xyz {
	
}