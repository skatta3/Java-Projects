package com.java.training.encapsulation;


public class EncapsulationTest{
    public static void main(String args[]){
    	    	
    	EmployeeDetails obj = new EmployeeDetails();
         obj.setEmpName("Mario");
         obj.setEmpAge(32);
         obj.setEmpSSN(112233);
         System.out.println("Employee Name: " + obj.getEmpName());
         System.out.println("Employee SSN: " + obj.getEmpSSN());
         System.out.println("Employee Age: " + obj.getEmpAge());
         System.out.println("Employee Salary: " + obj.getSalary());

    } 
}