package com.java.jdbc;


import java.sql.*;  
public class CallableStatementExample {  
	public static void main(String[] args) throws Exception{    
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/training","root","admin");  
		  
		CallableStatement stmt=con.prepareCall("{call insertdata(?,?)}");  
		stmt.setInt(1,1011);  
		stmt.setString(2,"Amit");  
		stmt.execute();  
		  
		System.out.println("success");  
	}  
}  