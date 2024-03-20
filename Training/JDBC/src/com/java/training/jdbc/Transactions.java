package com.java.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Transactions {
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
			Class.forName(JDBC_DRIVER);
			
			//STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			
			conn.setAutoCommit(false);
		    try{
		    	stmt = conn.createStatement();
		    	stmt.executeUpdate("update student set firstname='Sachin' where id=102");
		    } catch(Exception e) {
		    	e.printStackTrace();
		    } finally {
		        if(stmt != null) {
		        	stmt.close();
		        }
		    }

		   System.out.println("Updated First Record...");
		    Statement statement2 = null;
		    try{
		        statement2 = conn.createStatement();
		        statement2.executeUpdate(
		            "update student set firstname='Kapil' where id=103");
		    } finally {
		        if(statement2 != null) {
		            statement2.close();
		        }
		    }
		    System.out.println("Updated Second Record...");

		    conn.commit();
		} catch(Exception e) {
			try {
				conn.rollback();
				System.out.println("Rolling Back the Changes");
				e.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} finally {
		    if(conn != null) {
		    	try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }
		}
	    System.out.println("Goodbye...");


	}
}
