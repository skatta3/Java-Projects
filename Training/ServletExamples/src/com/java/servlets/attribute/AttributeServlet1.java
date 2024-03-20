package com.java.servlets.attribute;

import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;  
public class AttributeServlet1 extends HttpServlet{  
	public void doGet(HttpServletRequest req,HttpServletResponse res)  
	{  
		try{  	  
			res.setContentType("text/html");  
			PrintWriter out=res.getWriter();  
			  
			ServletContext context=getServletContext();  
			context.setAttribute("company","IBM");  
			  
			out.println("Welcome to first servlet");  
			out.println("<a href='AttributeServlet2'>visit</a>");  
			out.close();  	  
		}catch(Exception e){
			System.out.println(e);
		}  	  
	}
}  