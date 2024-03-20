package com.java.jdbcapi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class MainApp {

   public static void insertOrUpdate(String isbn, String title,
         String edition, float price) {
      try (Connection con = C3P0DataSource.getInstance().getConnection()) {
    	
         PreparedStatement pstmt=null;
         if(isIsbnExists(isbn)){
            pstmt = con.prepareStatement("UPDATE books "
                  + "SET title=?,edition=?,"
                  + "price=? WHERE isbn LIKE ?");
            pstmt.setString(1, title);
            pstmt.setString(2, edition);
            pstmt.setFloat(3, price);
            pstmt.setString(4, isbn);
         }else{
            pstmt = con.prepareStatement("INSERT INTO "
                  + "books(isbn,title,"
                  + "edition,price) VALUES (?,?,?,?)");
            pstmt.setString(1, isbn);
            pstmt.setString(2, title);
            pstmt.setString(3, edition);
            pstmt.setFloat(4, price);
         }
         pstmt.executeUpdate();
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }

  public static boolean isIsbnExists(String isbn) {
      Boolean flag = false;
      try(Connection con1 = C3P0DataSource.getInstance().getConnection()) {
     	 

         Statement stmt=con1.createStatement();
         ResultSet rs=stmt.executeQuery("SELECT isbn "
                     +"FROM books WHERE "
                     +"isbn LIKE '"+isbn+"'");
         flag=rs.next();
      } catch (SQLException e) {
         e.printStackTrace();
      }
      return flag;
   }

   public static void delete(String isbn) {
      try(Connection con2 = C3P0DataSource.getInstance().getConnection())  {
     	 

         PreparedStatement pstmt=null;
         if(isIsbnExists(isbn)){
            pstmt = con2.prepareStatement("DELETE FROM "
                  + "books "
                  + "WHERE isbn LIKE ?");
            pstmt.setString(1, isbn);
            pstmt.executeUpdate();
         }
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }

   public static void showAll() {
      try(Connection con3 = C3P0DataSource.getInstance().getConnection()) {
     	 

         Statement stmt = con3.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT * FROM books");
         ResultSetMetaData metadata = rs.getMetaData();
         int cols = metadata.getColumnCount();
         System.out.println("\n-----------------------------"
         + "--------------------------------");
         for (int i = 0; i < cols; i++) {
            System.out.printf("%-20s\t",
            metadata.getColumnName(i + 1).toUpperCase());
         }
         System.out.println("\n-----------------------------"
         + "--------------------------------");
         while (rs.next()) {
            for (int i = 0; i < cols; i++)
            System.out.printf("%-20s\t", rs.getObject(i + 1));
            System.out.println();
         }
         System.out.println("---------------------------------------------------------------");

      } catch (SQLException e) {
         e.printStackTrace();
      }
   }

   public static void main(String[] args) {
      showAll();
      insertOrUpdate("111111", "Complex Numbers",
         "Second", 56.78f);
      showAll();
      insertOrUpdate("111111", "Complex Numbers",
         "Fourth", 87.50f);
      showAll();
      delete("111111");
      showAll();
   }
}