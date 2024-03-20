<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>  
	error{color:blue}  
</style>  

</head>
<body>
<h1 align="center"> Please Register here</h1>

	<form:form action="saveRegistration" modelAttribute="userReg">
		<label>Name: </label>
		<form:input path="name"/>
		<form:errors path="name" cssClass="error"/>
		<br/>
		<label>Username: </label>
		<form:input path="userName"/>
		<form:errors path="userName" cssClass="error"/>
		<br/>
		
		<label>Password: </label>
		<form:password path="password"/>
		<form:errors path="password" cssClass="error"/>
		<br/>
		
		<label>User Email: </label>
		<form:input path="userEmail"/>
		<form:errors path="userEmail" cssClass="error"/>
		<br/>		
		<label>Country: </label>
		<form:select path="countryName">
			<form:option value="Ind">India</form:option>
			<form:option value="us">USA</form:option>
			<form:option value="uk">UK</form:option>
			<form:option value="aus">Australia</form:option>
		</form:select>
		
		<br/>
		
		<label>Hobbies: </label>	
		Playing: <form:checkbox path="hobbies" value="play"/>
		Reading: <form:checkbox path="hobbies" value="read"/>
		Watching: <form:checkbox path="hobbies" value="watch"/>
		Travel: <form:checkbox path="hobbies" value="travel"/>

		<br/>
		
		<label>Gender: </label>	
		Male: <form:radiobutton path="gender" value="male"/>
		Female: <form:radiobutton path="gender" value="female"/>
	
		<br/><br/><br/>
		<input type="submit" value="Register">
	</form:form>
</body>
</html>