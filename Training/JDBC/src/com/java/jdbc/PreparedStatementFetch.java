package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;  
class PreparedStatementFetch{  
	public static void main(String args[]){  
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/training","root","admin");  	
		  
			PreparedStatement stmt=con.prepareStatement("select * from emp");  
			ResultSet rs=stmt.executeQuery();  
			while(rs.next()){  
				System.out.println(rs.getInt(1)+" "+rs.getString(2));  
			}  
			  
			con.close();  
		  
		}catch(Exception e){ 
			System.out.println(e);
		}  
		  
	}  
}  