<%@ page import="java.io.*,java.util.*,java.sql.*"%>  
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>  
  
<html>  
<head>  
<title>sql:update Tag</title>  
</head>  
<body>  
   
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
     url="jdbc:mysql://localhost/testproject1"  
     user="root"  password="admin"/>  
<sql:update dataSource="${db}" var="count">  
	INSERT INTO student VALUES (159,'Chris', 'Soyars', 41);  
</sql:update>  
  
<sql:query dataSource="${db}" var="rs">  
	SELECT * from Student;  
</sql:query>  
   
<table border="2" width="100%">  
<tr>  
<th>Student ID</th>  
<th>First Name</th>  
<th>Last Name</th>  
<th>Age</th>  
</tr>  
<c:forEach var="table" items="${rs.rows}">  
<tr>  
	<td><c:out value="${table.id}"/></td>  
	<td><c:out value="${table.first}"/></td>  
	<td><c:out value="${table.last}"/></td>  
	<td><c:out value="${table.Age}"/></td>  
</tr>  
</c:forEach>  
</table>  
  
</body>  
</html>  