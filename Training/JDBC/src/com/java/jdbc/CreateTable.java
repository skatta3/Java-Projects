package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/avijit";
	// Database credentials
	static final String USER = "root";
	static final String PASS = "admin";
	
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		
		try{
			//STEP 2: Register JDBC driver
			Class.forName(JDBC_DRIVER);
			
			//STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			
			System.out.println("Creating table in given database...");
			stmt = conn.createStatement();
			
			String sql = "CREATE TABLE student " +
			"(id INTEGER not NULL, " +
			" firstname VARCHAR(255), " +
			" lastname VARCHAR(255), " +
			" age INTEGER, " +
			" PRIMARY KEY ( id ))";
			
			stmt.executeUpdate(sql);
			
			System.out.println("Created table in given database...");
			System.out.println("Inserting records into the table...");
			
	//		stmt =conn.createStatement();
			
			sql ="INSERT INTO student VALUES (100, 'Kriss', 'Kurian', 18)";
			stmt.executeUpdate(sql);
			
			sql = "INSERT INTO student VALUES (101, 'Enrique', 'John', 25)";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO student VALUES(102, 'Taylor', 'Swift', 30)";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO student VALUES(103, 'Linkin', 'Park', 28)";
			stmt.executeUpdate(sql);
			
			System.out.println("Inserted records into the table...");

			
			//STEP 6: Clean-up environment
			stmt.close();
			conn.close();
		}catch(SQLException se){
			//Handle errors for JDBC
			se.printStackTrace();
		}catch(Exception e){
			//Handle errors for Class.forName
			e.printStackTrace();
		}finally{
		//finally block used to close resources
			try{
				if(stmt!=null)
					stmt.close();
			}catch(SQLException se2){
				
			}// nothing can be done
			
			try{
				if(conn!=null)
					conn.close();
			}catch(SQLException se){
				se.printStackTrace();
			}//end finally try
		}//end try
		System.out.println("Goodbye!");
	}//end main
}
