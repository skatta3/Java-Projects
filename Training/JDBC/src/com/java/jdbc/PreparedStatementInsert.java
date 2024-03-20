package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;  
class PreparedStatementInsert{  
	public static void main(String args[]){  
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/training","root","admin");  	
		  
			PreparedStatement stmt=con.prepareStatement("insert into Emp values(?,?,?)");  
			stmt.setInt(1,101);//1 specifies the first parameter in the query  
			stmt.setString(2,"Ratan");  
			stmt.setInt(3,101);
			  
			int i=stmt.executeUpdate();  
			System.out.println(i+" records inserted");  
			  
			con.close();  
		  
		}catch(Exception e){ 
			System.out.println(e);
		}  
		  
	}  
}  