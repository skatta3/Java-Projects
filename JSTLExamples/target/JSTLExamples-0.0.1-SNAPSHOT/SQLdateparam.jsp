<%@ page import="java.io.*,java.util.*,java.sql.*"%>  
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>  
<%@ page import="java.util.Date,java.text.*" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>  
   
<html>  
<head>  
<title>sql:dateParam Tag</title>  
</head>  
<body>  
   
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
     url="jdbc:mysql://localhost/db-sk"  
     user="root"  password="admin"/>  
  
<%  
Date DoB = new Date("2011/07/14");  
int age = 28;
int studentId = 116;  
%>  
   
<sql:update dataSource="${db}" var="count">  
   UPDATE Student SET age = ? WHERE Id = ?  
   <sql:param value="<%=age%>" />  
   <sql:param value="<%=studentId%>" />  
</sql:update>  
   
<sql:query dataSource="${db}" var="rs">  
   SELECT * from Student;  
</sql:query>  
   
<table border="2" width="100%">  
<tr>  
   <th>Emp ID</th>  
   <th>First Name</th>  
   <th>Last Name</th>  
   <th>Ge</th>  
</tr>  
<c:forEach var="table" items="${rs.rows}">  
<tr>  
   <td><c:out value="${table.id}"/></td>  
   <td><c:out value="${table.first}"/></td>  
   <td><c:out value="${table.last}"/></td>  
   <td><c:out value="${table.age}"/></td>  
</tr>  
</c:forEach>  
</table>  
   
</body>  
</html>  