package com.java.jdbc;

import java.sql.*;  
class BatchExample{  
	public static void main(String args[])throws Exception{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/avijit","root","admin");  

		con.setAutoCommit(false);  
		  
		Statement stmt=con.createStatement();  
		stmt.addBatch("insert into student values(110,'Chris','Soyars',22)");  
		stmt.addBatch("insert into student values(112,'Jobes','Clayton',24)");  
		  
		stmt.executeBatch();//executing the batch  
		  
		con.commit();  
		con.close();  
	}
}  