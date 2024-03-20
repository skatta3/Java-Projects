package com.java.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdditionServlet extends HttpServlet {

	public void init(ServletConfig config) {
		System.out.println("Init Method is called");
		
		ServletContext contextObj = config.getServletContext();
		System.out.println("From AdditionServlet   " + contextObj.getInitParameter("JDBCDriver"));

	}
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k= i+j;
		PrintWriter out = res.getWriter();
		out.println("Result is: "+k);
	}
	
	public void destroy() {
		System.out.println("Destroy method is called");
	}
}
