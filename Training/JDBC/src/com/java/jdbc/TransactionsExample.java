package com.java.jdbc;

import java.sql.*;  
class TransactionsExample{  
	public static void main(String args[])throws Exception{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/avijit","root","admin");  
		
		con.setAutoCommit(false);  
		  
		Statement stmt=con.createStatement();  
		stmt.executeUpdate("insert into student values(190,'abhi','',18)");  
		stmt.executeUpdate("insert into student values(191,'umesh','',22)");  
		  
		con.commit();  
		con.close();  
	}
}  