package com.spring.autowiring;

public class Driver {
		String driverName;
		int exp;
		float salary;
		
		public Driver() {
//			System.out.println("Driver Object is created");
		}
		
		@Override
		public String toString() {
			return ("Driver Name : "  + driverName + " Experience : " + exp + " Salary : " + salary);
		}
		
}
