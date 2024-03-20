package com.java.training.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Callable {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/training";
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
			
			CallableStatement callableStatement =
					conn.prepareCall("{call calculateStatistics(?, ?)}");

				callableStatement.setString(1, "param1");
				callableStatement.setInt   (2, 123);
				callableStatement.addBatch();

				callableStatement.setString(1, "param2");
				callableStatement.setInt   (2, 456);
				callableStatement.addBatch();

				int[] updateCounts = callableStatement.executeBatch();

				callableStatement =
						conn.prepareCall("{call calculateStatistics(?, ?)}");

				callableStatement.setString(1, "param1");
				callableStatement.setInt   (2, 123);

				callableStatement.registerOutParameter(1, java.sql.Types.VARCHAR);
				callableStatement.registerOutParameter(2, java.sql.Types.INTEGER);

				ResultSet result = callableStatement.executeQuery();
				while(result.next()) 
				{ 
				
				}

				String out1 = callableStatement.getString(1);
				int    out2 = callableStatement.getInt   (2);

			
		} catch (Exception e) {
			
		}
	}
}
