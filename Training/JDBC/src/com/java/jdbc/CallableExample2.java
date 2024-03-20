package com.java.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CallableExample2 {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/training";
	// Database credentials
	static final String USER = "root";
	static final String PASS = "admin";
	
	public static void main(String[] args) {
		Connection conn = null;

		try{
			Class.forName(JDBC_DRIVER);
			
			//STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			
			CallableStatement callableStatement =
					conn.prepareCall("{call SelectAllStudents()}");

				ResultSet rs = callableStatement.executeQuery();
			    while (rs.next()) {
		            System.out.println("ID = " + rs.getInt(1) + ", FIRST NAME = " + rs.getString(2) + 
		                  ", LAST NAME = " + rs.getString(3) + ", AGE = " + rs.getInt(4));
		         }	
		} catch (Exception e) {
			
		}
	}
}
