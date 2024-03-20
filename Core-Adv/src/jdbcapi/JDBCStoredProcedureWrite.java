package com.java.jdbcapi;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class JDBCStoredProcedureWrite {

	public static void main(String[] args) {
		Connection con = null;
		CallableStatement stmt = null;
		
		try{
			con = DBConnection.getConnection();
			stmt = con.prepareCall("{call insertEmployee(?,?,?,?,?)}");
			stmt.setInt(1, 11123);
			stmt.setString(2, "Vamshi");
			stmt.setString(3, "Developer");
			stmt.setString(4, "Hyderabad");
			stmt.setString(5, "India");
			
			stmt.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try {
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
