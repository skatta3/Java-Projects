<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "javax.servlet.http.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>First JSP</h1>  
<%  
	Cookie ck= new Cookie("name","Ken Caldwell");  
	response.addCookie(ck);  
%> 
<a href="ELcookieprocess.jsp">click</a>  
</body>
</html>