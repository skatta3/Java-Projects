import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse; 

// Servlet Name 
@WebServlet("/InsertData") 
public class InsertData extends HttpServlet { 
	private static final long serialVersionUID = 1L; 

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{ 
		try { 

			// Initialize the database 
			Connection con = DatabaseConnection.initializeDatabase(); 

			// Create a SQL query to insert data into demo table 
			// demo table consists of two columns, so two '?' is used 
			PreparedStatement st = con 
				.prepareStatement("insert into user123 values(?, ?,?,?)"); 

			// For the first parameter, 
			// get the data using request object 
			// sets the data to st pointer 
			st.setInt(1, 2); 

			// Same for second parameter 
			st.setString(2, "Chris"); 
			st.setString(3, "Chris");
			st.setString(4, "Chris");
			st.setString(5, "Chris");

			// Execute the insert command using executeUpdate() 
			// to make changes in database 
			st.executeUpdate(); 

			// Close all the connections 
			st.close(); 
			con.close(); 

			// Get a writer pointer 
			// to display the successful result 
			PrintWriter out = response.getWriter(); 
			out.println("<html><body><b>Successfully Inserted"
						+ "</b></body></html>"); 
		} 
		catch (Exception e) { 
			e.printStackTrace(); 
		} 
	} 
} 
