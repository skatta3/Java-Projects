package com.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeServlet extends HttpServlet{
    int counter = 0;
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	    System.out.println("Initial Value: " + config.getInitParameter("initCounter"));
	    counter =    Integer.parseInt(config.getInitParameter("initCounter"));
	    
	    System.out.println("Context Param: " + config.getServletContext().getInitParameter("AppName"));

	}

    public void service(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
      
    	    response.setContentType("text/html");  
    	    PrintWriter out = response.getWriter();  
    	    System.out.println(counter++);
    	          
    	    String n = request.getParameter("userName");  
    	    out.print("Welcome "+n);  
    	}
    
    }