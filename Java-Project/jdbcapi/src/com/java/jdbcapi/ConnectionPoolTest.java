package com.java.jdbcapi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;

public class ConnectionPoolTest {
	public static void main(String[] args) throws SQLException
	{

			try 
			{
				BasicDataSource dataSource = ConnectionPool.getDataSource(); 
				Connection connection = dataSource.getConnection();
				PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM student");
					System.out.println("The Connection Object is of Class: "+connection.getClass());
					try (ResultSet resultSet = pstmt.executeQuery();)
					{
							while (resultSet.next())
							{
									System.out.println(resultSet.getString(1) + "," + resultSet.getString(2) + "," + resultSet.getString(3));
							}
					}
					catch (Exception e)
					{
							connection.rollback();
							e.printStackTrace();
					}
					finally {
					//	connection.close();
					}
				Connection connection1 = dataSource.getConnection();
				PreparedStatement pstmt1 = connection1.prepareStatement("SELECT * FROM student");
					System.out.println("The Connection Object is of Class: "+connection.getClass());
					try (ResultSet resultSet = pstmt1.executeQuery();)
					{
							while (resultSet.next())
							{
									System.out.println(resultSet.getString(1) + "," + resultSet.getString(2) + "," + resultSet.getString(3));
							}
					}
					catch (Exception e)
					{
//							connection.rollback();
							e.printStackTrace();
					}
					Connection connection2 = dataSource.getConnection();
					PreparedStatement pstmt2 = connection2.prepareStatement("SELECT * FROM student");
						System.out.println("The Connection Object is of Class: "+connection.getClass());
						try (ResultSet resultSet = pstmt2.executeQuery();)
						{
								while (resultSet.next())
								{
										System.out.println(resultSet.getString(1) + "," + resultSet.getString(2) + "," + resultSet.getString(3));
								}
						}
						catch (Exception e)
						{
//								connection.rollback();
								e.printStackTrace();
						}
			} catch(Exception e) {
				
			} 
	}
}
