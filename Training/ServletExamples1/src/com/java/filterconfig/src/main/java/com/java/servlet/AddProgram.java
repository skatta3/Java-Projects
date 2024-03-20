package com.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddProgram extends HttpServlet{
	
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	    System.out.println("Initial Value: " + config.getInitParameter("initCounter"));	    
	    System.out.println("Context Param: " + config.getServletContext().getInitParameter("AppName"));

	}
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		System.out.println(req.getParameterNames());
		int k= i+j;
		PrintWriter out = res.getWriter();
		out.println("Result is: "+k);
	}
}