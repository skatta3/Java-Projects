package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;  
class PreparedStatementUpdate{  
	public static void main(String args[]){  
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/training","root","admin");  	
		  
			PreparedStatement stmt=con.prepareStatement("update emp set name=? where id=?");  
			stmt.setString(1,"Sonoo");//1 specifies the first parameter in the query i.e. name  
			stmt.setInt(2,101);  
			  
			int i=stmt.executeUpdate();  
			System.out.println(i+" records updated");  
			  
			con.close();  
		  
		}catch(Exception e){ 
			System.out.println(e);
		}  
		  
	}  
}  