package com.aws.redshift;


import java.sql.*;
import java.util.Properties;

public class FetchData {
    //Redshift driver: "jdbc:redshift://x.y.us-west-2.redshift.amazonaws.com:5439/dev";
//    static final String dbURL = "jdbc:redshift://redshift-cluster-1.c1awn6a7exy0.us-east-1.redshift.amazonaws.com:5439/dev";
	static final String dbURL = "jdbc:redshift://redshift-cluster-1.cybbpsuryleg.us-east-1.redshift.amazonaws.com:5439/dev";
	static final String MasterUsername = "awsuser";
    static final String MasterUserPassword = "Newyork007";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try{
           //Dynamically load driver at runtime.
           //Redshift JDBC 4.1 driver: com.amazon.redshift.jdbc41.Driver
           //Redshift JDBC 4 driver: com.amazon.redshift.jdbc4.Driver
           Class.forName("com.amazon.redshift.jdbc.Driver");

           //Open a connection and define properties.
           System.out.println("Connecting to database...");
           Properties props = new Properties();

           //Uncomment the following line if using a keystore.
           //props.setProperty("ssl", "true");
           props.setProperty("user", MasterUsername);
           props.setProperty("password", MasterUserPassword);
           conn = DriverManager.getConnection(dbURL, props);

           //Try a simple query.
           System.out.println("Listing system tables...");
           stmt = conn.createStatement();
           String sql;
 //          sql = "select * from information_schema.tables;";
           sql = "select * from public.users;";         
           ResultSet rs = stmt.executeQuery(sql);

//           //Get the data from the result set.
//           while(rs.next()){
//              //Retrieve two columns.
//              String catalog = rs.getString("table_catalog");
//              String name = rs.getString("table_name");
//
//              //Display values.
//              System.out.print("Catalog: " + catalog);
//              System.out.println(", Name: " + name);
//           }
           
           //Get the data from the result set.
           while(rs.next()){
              //Retrieve two columns.
              int userid = rs.getInt("userid");
              String name = rs.getString("username");

              //Display values.
              System.out.print("User ID: " + userid);
              System.out.println(", User Name: " + name);
           }
           rs.close();
           stmt.close();
           conn.close();
        }catch(Exception ex){
           //For convenience, handle all errors here.
           ex.printStackTrace();
        }finally{
           //Finally block to close resources.
           try{
              if(stmt!=null)
                 stmt.close();
           }catch(Exception ex){
           }// nothing we can do
           try{
              if(conn!=null)
                 conn.close();
           }catch(Exception ex){
              ex.printStackTrace();
           }
        }
        System.out.println("Finished connectivity test.");
     }
}
// snippet-end:[redshift.java.ConnectToCluster.complete]