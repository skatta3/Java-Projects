package com.spring.scopes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("employee")
public class Employee {
	
	private String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private String DB_URL = "jdbc:mysql://localhost:3306/training";
	private String USER = "root";
	private String PASS = "admin";
	

	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	@PostConstruct
	public void init() throws ClassNotFoundException,SQLException{
		System.out.println("Initialization Method is called");
		//STEP 2: Register JDBC driver
		Class.forName(JDBC_DRIVER);

		//STEP 3: Open a connection
		System.out.println("Connecting to database...");
		conn = DriverManager.getConnection(DB_URL,USER,PASS);
	}
	
	public void SelectAllRows() {
		try{
	
			//STEP 4: Execute a query
			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			System.out.println("Created statement...");

			String sql;
			sql = "SELECT * FROM student";
			
			rs = stmt.executeQuery(sql);
			System.out.println(rs);
			//STEP 5: Extract data from result set
			while(rs.next()){
				System.out.println("Inside ResultSet");
				//Retrieve by column name
				int id = rs.getInt("rollno");
				int age = rs.getInt("age");
				String firstname = rs.getString("firstname");
				String lastname = rs.getString("lastname");
				String standard = rs.getString("standard");
				//Display values
				System.out.print("ID: " + id);
				System.out.print(", Age: " + age);
				System.out.print(", First: " + firstname);
				System.out.println(", Last: " + lastname);	
				System.out.println(", standard: " + standard);			
			}
		} catch(Exception e) {
			
		}

	}
	
	@PreDestroy
	public void cleanUp() {
		//STEP 6: Clean-up environment
		System.out.println("Cleanup method is called");

		try {
			rs.close();
			stmt.close();
			conn.close();	
		} catch(Exception e) {
			
		}

	}
	
}
