package com.springjdbc.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.dao.EmployeeDao;
import com.springjdbc.model.Employee;
import com.springjdbc.model.Employee2;

public class MainJDBCApp {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
		
		EmployeeDao dao = ctx.getBean("edao",EmployeeDao.class);
		
//		boolean insertStatus = dao.insertEmployee();
//		System.out.println("insertStatus: " + insertStatus);
//		if(insertStatus) {
//			System.out.println("Employee Record inserted successfully");
//		} else {
//			System.out.println("Unable to insert the Employee record");
//		}
		
//		dao.updateRecord();
		
//		dao.deleteRecord();
		
//		System.out.println("Fetching the Data with ResultSetExtractor");
//		empList = dao.getAllEmployees();
//
//		System.out.println("Employee Information");
//		for(Employee emp :  empList) {
//			System.out.println(emp);
//		}
//		
//		System.out.println("--------------------------------");
//		System.out.println("Fetching the Data with RowMapper");
		
//		empList = dao.getAllEmployeesRowMapper();
//		System.out.println("Employee Information");
//		for(Employee emp :  empList) {
//			System.out.println("Employee ID: " + emp.getId() + " Employee Name: " + emp.getName() + "  Employee Salary: " + emp.getSalary());
//		}
		
    //Bean Property Row Mapper
	    
	    Employee2 emp = dao.getEmployeebyID();  
       
	    System.out.println(emp);  	
		
	}
}
