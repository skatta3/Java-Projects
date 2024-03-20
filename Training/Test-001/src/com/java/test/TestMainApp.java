package com.java.test;

public class TestMainApp {

	public static void main(String[] args) {
		/** Instantiating the Employee class  so that Object of Employoee is
		 * created and assigned to emp variable
		 * 
		 */
		Employee emp1 = new Employee(); 
//		emp1.setEmpID(1);
		emp1.setEmpName("Bajana");
//		emp1.setEmpSalary(15000); 
		
		Employee emp2 = new Employee(2,"Martin", 10000);
		
		emp1.displayInfo();
		emp2.displayInfo();
		
		Employee.getOrgInfo();
		
		emp1.sum(2,4);
		emp1.sum(2, 4, 6);
		
	}

}
