package com.java.jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {

	public static Connection getConnection() {
		Properties props = new Properties();
		FileInputStream fis = null;
		Connection con = null;
		try {
		      String fileSeparator = System.getProperty("file.separator");
		      String SourceFile = "DBConnection.properties";

			fis = new FileInputStream(SourceFile);
			props.load(fis);

			// load the Driver Class
//			Class.forName(props.getProperty("DB_DRIVER_CLASS"));

			// create the connection now
			con = DriverManager.getConnection(props.getProperty("DB_URL"),
					props.getProperty("DB_USERNAME"),
					props.getProperty("DB_PASSWORD"));
		} catch (IOException  | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
}
