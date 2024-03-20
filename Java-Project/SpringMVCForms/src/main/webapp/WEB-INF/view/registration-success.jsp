<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>The Information that you have entered is as below</h1>

Name: ${userReg.name}<br/>
Username: ${userReg.userName}<br/>
Password: ${userReg.password}<br/>
Country: ${userReg.countryName}<br/>
Hobbies: 
	<c:forEach var="temp" items="${userReg.hobbies}">
		${temp}
	</c:forEach>
	<br/>
Gender: ${userReg.gender}<br/>

</body>
</html>