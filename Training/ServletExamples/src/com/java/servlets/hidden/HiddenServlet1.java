package com.java.servlets.hidden;

import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;  
  
public class HiddenServlet1 extends HttpServlet {  
	public void doGet(HttpServletRequest request, HttpServletResponse response){  
        try{  
	        response.setContentType("text/html");  
	        PrintWriter out = response.getWriter();  
	          
	        String n=request.getParameter("userName");  
	        out.print("Welcome "+n);  
	          
	        //creating form that have invisible textfield  
	        out.print("<form action='hiddenservlet2'>");  
	        out.print("<input type='hidden' name='uname' value='"+n+"'>");  
	        out.print("<input type='submit' value='go'>");  
	        out.print("</form>");  
	        out.close();   
          }catch(Exception e){
        	  System.out.println(e);
          }  
	  }  
  
}  