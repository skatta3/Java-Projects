package com.java.training.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnectionTest {
	
	private static final String QUERY = "select id,first,last,age from student";

	public static void main(String[] args) {
				
		//using try-with-resources to avoid closing resources (boiler plate code)
		try(Connection con = DBConnection.getConnection();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(QUERY)) {	
			
			while(rs.next()){
				int id = rs.getInt("id");
				String first = rs.getString("first");
				String last = rs.getString("last");
				int age = rs.getInt("age");
	
				System.out.println(id + "," +first+ "," +last+ "," +age);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
