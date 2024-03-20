package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;  
class PreparedStatementDelete{  
	public static void main(String args[]){  
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/avijit","root","admin");  	
		  
			PreparedStatement stmt=con.prepareStatement("delete from student where id=?");  
			stmt.setInt(1,100);  
			  
			int i=stmt.executeUpdate();  
			System.out.println(i+" records deleted");  
			  
			con.close();  
		  
		}catch(Exception e){ 
			System.out.println(e);
		}  
		  
	}  
}  