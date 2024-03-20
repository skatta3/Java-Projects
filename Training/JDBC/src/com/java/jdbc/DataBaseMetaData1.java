package com.java.jdbc;

import java.sql.*;  
// DatabaseMetaData interface that prints total number of tables :
class DataBaseMetaData1{  
	public static void main(String args[]){  
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/training","root","admin");  	
		  
			DatabaseMetaData dbmd = con.getMetaData();  
			String table[]={"TABLE"};  
			ResultSet rs = dbmd.getTables(null,null,null,table);  
//			dbmd.getTables(catalog, schemaPattern, tableNamePattern, types)
			  
			while(rs.next()){  
				System.out.println(rs.getString(1) + "--" + rs.getString(2) + "--" + rs.getString(3) + "--" + rs.getString(3));  
			}  
			  
			con.close();  
		  
		}catch(Exception e){
			System.out.println(e);
		}  
	  
	}  
}  