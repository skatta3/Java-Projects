package com.java.jdbc;

import java.sql.*;  
class JDBCExample2{  
	public static void main(String args[])throws Exception{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/training","root","admin");  
		Statement stmt=con.createStatement();  
		  
		//stmt.executeUpdate("insert into emp765 values(33,'Irfan',50000)");  
		//int result=stmt.executeUpdate("update emp765 set name='Vimal',salary=10000 where id=33");  
		int result=stmt.executeUpdate("delete from emp where id=2");  
		System.out.println(result+" records affected");  
		con.close();  
	}
}  