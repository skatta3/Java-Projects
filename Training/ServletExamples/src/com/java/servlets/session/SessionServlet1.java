package com.java.servlets.session;

import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;  
  
  
public class SessionServlet1 extends HttpServlet {    
	public void doGet(HttpServletRequest request, HttpServletResponse response){  
        try{   
	        response.setContentType("text/html");  
	        PrintWriter out = response.getWriter();  
	          
	        String n=request.getParameter("userName");  
	        out.print("Welcome "+n);  
	          
	        HttpSession session=request.getSession();  
	        session.setAttribute("uname",n);  
	  
	        out.print("<a href='sessionservlet2'>   visit</a>");  
	                  
	        out.close();  
        }catch(Exception e){
        	System.out.println(e);
        }  
	}  
  
}  