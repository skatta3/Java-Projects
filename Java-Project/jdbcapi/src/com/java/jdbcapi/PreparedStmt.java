package com.java.jdbcapi;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class PreparedStmt {
		public static void main(String args[]){  
			try
			{  
				Connection con = DBConnection.getConnection();		  
				PreparedStatement stmt=con.prepareStatement("insert into Users values(?,?,?,?,?)");  
				stmt.setInt(1,101);//1 specifies the first parameter in the query  
				stmt.setString(2,"Ratan");  
				stmt.setString(3,"Ratan@gmail.com");  
				stmt.setString(4,"India");  
				stmt.setString(5,"Ratan123");  
				  
				int i=stmt.executeUpdate();  
				System.out.println(i+" records inserted");  
				  
				con.close();  
			  
			}catch(Exception e){ 
				System.out.println(e);
			}  
		}  
	}  