package com.java.jdbc;

import java.sql.*;  
class DataBaseMetaData2{  
	public static void main(String args[]){  
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/training","root","admin");  
		  
			DatabaseMetaData dbmd=con.getMetaData();  
			String table[]={"VIEW"};  
			ResultSet rs=dbmd.getTables(null,null,null,table);  
		  
			while(rs.next()){  
				System.out.println(rs.getString(3));  
			}  
		  
			con.close();  
		  
		}catch(Exception e){ 
			System.out.println(e);
		}  
		  
	}  
}  