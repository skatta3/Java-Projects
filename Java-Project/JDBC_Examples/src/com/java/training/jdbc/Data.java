package com.java.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Enumeration;
import java.util.Vector;

import javax.swing.JPanel;

public class Data {

    Connection connection = null;  
    ResultSet resultSet = null;  
    Statement statement = null;  

//    static Vector userNames = new Vector();

    public void database(){
        try 
        {  
            Class.forName("com.mysql.jdbc.Driver");  
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","admin");  
            statement = connection.createStatement();  
            resultSet = statement.executeQuery("SELECT id, name,email,country FROM users");

            Vector userNames = new Vector();
  

            while (resultSet.next()) 
            {  
                Vector vecData = new Vector();

                vecData.addElement(resultSet.getInt("id"));
                vecData.addElement(resultSet.getString("name"));
                vecData.addElement(resultSet.getString("email"));
                vecData.addElement(resultSet.getString("country"));

                userNames.add(vecData);
            }  
            
            
            Enumeration enu1 = userNames.elements();
            
            System.out.println("The enumeration of values are:");
      
            // Displaying the Enumeration
            while (enu1.hasMoreElements()) {
               Vector getData = new Vector();
               getData = (Vector)enu1.nextElement();
               Enumeration enu2 = getData.elements();
               while (enu2.hasMoreElements()) {
            	   System.out.println(enu2.nextElement());
               }
               System.out.println("------------------Next Record-----------");
            }

        } //try
        catch (Exception e) 
        {  
            e.printStackTrace();  
        }
        finally 
        {  
            try 
            {  
                resultSet.close();  
                statement.close();  
                connection.close();  
            } 
            catch (Exception e) 
            {  
                e.printStackTrace();  
            }  
        }
    }

	public static void main(String[] args) {
	   Data d = new Data();
	   d.database();
	}
}
