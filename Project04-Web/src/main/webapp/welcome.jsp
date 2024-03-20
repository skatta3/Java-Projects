<%@ page import="java.util.Date" %>
<%-- A jsp example to learn the JSP scripting elements–--%>
<% String string1 ="JSP scriptlet examples"; %>

<%! String string2 =""; %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello World - JSP </title>
</head>
<body>
    <%= "Hello World!" %>
    <h3>Hi There</h3><br>
	<strong>Current Time is</strong>: <%=new Date() %>
	
	<h1>
Welcome to <%=string1%>
</h1>

<%if(string1.equals("JSP scriptlet")){%>
	Hi
<%}
else {%>
	hello
<%} %>
</body>
</html>