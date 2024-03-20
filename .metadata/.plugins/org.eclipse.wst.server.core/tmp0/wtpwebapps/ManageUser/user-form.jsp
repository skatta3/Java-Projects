<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import = "com.java.manageuser.model.User" %>
<html>
<head>
<title>User Management Application</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>

	<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: tomato">
			<div>
				<a href="https://www.javaguides.net" class="navbar-brand"> User Management App </a>
			</div>

			<ul class="navbar-nav">
				<li><a href="<%=request.getContextPath()%>/list"
					class="nav-link">Users</a></li>
			</ul>
		</nav>
	</header>
	<br>
		<% User user = (User) request.getAttribute("user"); %>			
	<div class="container col-md-5">
		<div class="card">
			<div class="card-body">
					<form action="update" method="post">
				<caption>
					<h2>Edit User</h2>
				</caption>
					<input type="hidden" name="id" value=<%=user.getId() %> />


				<fieldset class="form-group">
					<label>User Name</label> <input type="text"
						value=<%=user.getName() %> class="form-control"
						name="name" required="required">
				</fieldset>

				<fieldset class="form-group">
					<label>User Email</label> <input type="text"
						value=<%=user.getEmail() %> class="form-control"
						name="email">
				</fieldset>

				<fieldset class="form-group">
					<label>User Country</label> <input type="text"
						value=<%=user.getCountry() %> class="form-control"
						name="country">
				</fieldset>

				<button type="submit" class="btn btn-success">
		            	Update User
	            </button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>
