package com.training.java;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DayOne {
	boolean a= true;
	boolean b = false;
	int sum3;

//HotSpots
	void HotSpot() {
		for(int i = 0 ; i <= 100; i++) {
			   System.out.println("Object Comparision"); //two objects
			}
		
		
		int sum = 7;
		for(int i = 0 ; i <= 100; i++) {
		   sum += i;
		}
	}
	
	void methodInlining() {
		sum3 = add(5,7) + add(4,2);
		//after method inlining
		   sum3 = 5+ 7 + 4 + 2;		
	}

	static int add(int a, int b) {
	   return a + b;
	}


	
//	// Unreachable and Dead Code
//		void Unreachable() {
//			   if (a) return;
//			   else return;
//			   foobar(a,b); //unreachable code, compile time error
//		}
//		
//		void foobar() {
//			if(a == b)
//					System.out.println(" a and b are equal");
//		}
		
//		void constantFolding() {
//			final int num = 5;
//			int b = num * 6; //compile-time constant, num never changes
//			//compiler would assign b a value of 30.		
//		}
		
		void Coalescing() {
			String str = "G11 GC";

			for(int i = 0 ; i < 1000; i++) {
			   str = str + String.valueOf(i);
			}

		}
		
//		void memoryLeaks() throws SQLException {
//			String query="select * from EMployee";
//			Connection conn=null;
//			Statement st=null;
//			ResultSet rs=null;
//			   try{
//			      conn = ConnectionFactory.getConnection();
//			      st = conn.createStatement(); 
//			      rs = st.executeQuery("query");
//			      while(rs.next()) {
//			         //process the record
//			      }
//			   } catch(SQLException sqlEx) {
//			      //print stack trace
//			   }
////			   finally {
////				   conn.close();
////				   st.close();
////				   rs.close();
////				   
////			   }
			}

}
