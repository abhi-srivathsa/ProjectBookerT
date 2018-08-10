<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body>
	<h1 class="text-center display-1">Sign Up!</h1>
	<h2>
	<form:form action="adduser.obj" method="post" modelAttribute="reg">
	<table align ="center">
	<tr><td>Enter Username :</td><td> <form:input path="login_id" required="required"/></td></tr>
<tr><td>Enter Password		:</td><td> 	<form:password path="login.password" required="required"/></td></tr>
		<br>
<tr><td>Enter name	:</td><td> 	<form:input path="name" required="required"/></td></tr>
		<br>
<tr><td>Enter email	:</td><td> 	<form:input path="email" required="required"/></td></tr>
		<br>
<tr  ><td>Select location :</td><td>  <form:select path="location.location" >
			<br>
			<form:options items = "${loc}" />

			<%-- 
			<form:option value="Bangalore">Bangalore</form:option>
			<form:option value="Delhi">Delhi</form:option>
			<form:option value="Mumbai">Mumbai</form:option>
			<form:option value="Chennai">Chennai</form:option> --%>
		</form:select></td></tr>


		<tr><td></td><td><input type="submit" value="register" class="btn btn-lg btn-outline-light"></td></tr></table>
	</form:form>
	</h2>
</body>
</html>