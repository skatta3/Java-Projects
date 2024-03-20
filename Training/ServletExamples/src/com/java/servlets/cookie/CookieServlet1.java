package com.java.servlets.cookie;

import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;  
  
  
public class CookieServlet1 extends HttpServlet {   
  public void doPost(HttpServletRequest request, HttpServletResponse response){  
    try{   
	    response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	          
	    String n=request.getParameter("userName");  
	    out.print("Welcome "+n);  
	  
	    Cookie ck=new Cookie("uname",n);//creating cookie object  
	    response.addCookie(ck);//adding cookie in the response  
	  
	    //creating submit button  
	    out.print("<form action='cookieservlet2'>");  
	    out.print("<input type='submit' value='go'>");  
	    out.print("</form>");  
	          
	    out.close();   
     }catch(Exception e){
    	 System.out.println(e);
     }  
  }  
  public void doGet(HttpServletRequest request, HttpServletResponse response){  
	    try{   
		    response.setContentType("text/html");  
		    PrintWriter out = response.getWriter();  
		          
		    String n=request.getParameter("userName");  
		    out.print("Welcome "+n);  
		  
		    Cookie ck=new Cookie("uname",n);//creating cookie object  
		    response.addCookie(ck);//adding cookie in the response  
		  
		    //creating submit button  
		    out.print("<form action='cookieservlet2'>");  
		    out.print("<input type='submit' value='go'>");  
		    out.print("</form>");  
		          
		    out.close();   
	     }catch(Exception e){
	    	 System.out.println(e);
	     }  
	  } 
}  