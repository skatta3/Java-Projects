package com.java.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionsExample {
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/java116";

    // Database credentials
    static final String USER = "root";
    static final String PASS = "admin";

    public static void main(String[] args) {

        Connection conn = null;
        Statement stmt = null;


        try {
            // step 2 : Register JDBC driver
            Class.forName(JDBC_DRIVER);

            // step 3 Open a connection
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            conn.setAutoCommit(false);

            try {
                // update Student Record
                stmt = conn.createStatement();
                String sql = "update student set first= 'Sunder', last= 'Bahugune' where id=100";
                stmt.executeUpdate(sql);
                System.out.println("Inserted records into table student");

                int rowsAffected = stmt.executeUpdate(sql);
                System.out.println("Update in table student: " + rowsAffected);

                // verifying if student has updated successfully
                sql = "select * from student where id=100";

                ResultSet rs = stmt.executeQuery(sql);

                while (rs.next()) {
                        // retrieve by column name
                        int id = rs.getInt("id");
                        String first = rs.getString("first");
                        String last = rs.getString("last");

                        // display values
                        System.out.print("ID: " + id);
                        System.out.print(", First: " + first);
                        System.out.println(", lAST: " + last);
                     
                    }
                stmt.close();
            } finally {
            	
            }

            try {    // update student marks Record
                Statement stmt1 = null;
                stmt1 = conn.createStatement();
                String sql1 = "INSERT INTO studentmarks (id, Physics, Chemistry, Maths) VALUES (109, 102, 103, 105)";
 //               stmt1.executeUpdate(sql1);

                System.out.println("Inserted records into table studentmarks");

                int rowsAffected1 = stmt1.executeUpdate(sql1);

                System.out.println("Insert into table studentmarks: " + rowsAffected1);

                // verifying if student-marks has inserted successfully
                sql1 = "select * from studentmarks where id=109";

                ResultSet rs1 = stmt1.executeQuery(sql1);
                while (rs1.next()) {
                    // retrieve by column name
                    int id = rs1.getInt("id");
                    int Physics = rs1.getInt("Physics");
                    int Chemistry = rs1.getInt("Chemistry");
                    int Maths = rs1.getInt("Maths");


                    // display values
                    System.out.print("ID: " + id);
                    System.out.print(", Physics: " + Physics);
                    System.out.println(", Chemistry: " + Chemistry);
                    System.out.println(", Maths: " + Maths);
        
                }
                stmt1.close();
                conn.commit();
              } finally {
 
            }

            System.out.println("Goodbye!");
        } catch (SQLException | ClassNotFoundException e) {
        	try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
            e.printStackTrace();
        }

    }
}