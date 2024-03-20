package com.java.authenticate;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;  
  
public class MyFilter implements Filter{  
  
	public void init(FilterConfig arg0) throws ServletException {
		
	}  
      
	public void doFilter(ServletRequest req, ServletResponse resp,  
        FilterChain chain) throws IOException, ServletException {  
          
	    PrintWriter out=resp.getWriter();  
	          
	    String password=req.getParameter("password");  
	    if(password.equals("admin")){  
	    	chain.doFilter(req, resp);//sends request to next resource  
	    }  
	    else{  
	    	out.print("username or password error!");  
	    	RequestDispatcher rd=req.getRequestDispatcher("/authentication.html");  
	    	rd.include(req, resp);  
	    }  
          
	}  
    public void destroy() {
    	
    }  
  
}  