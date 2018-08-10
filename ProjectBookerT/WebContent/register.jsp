<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body>
	<form:form action="adduser.obj" method="post" modelAttribute="reg">
Enter Username : <form:input path="login_id" />
Enter Password		:	<form:input path="login.password" />
Enter name	:	<form:input path="name" />
Enter email	:	<form:input path="email" //>
Select location : <form:select path="location">
			<form:option value="Bangalore">Bangalore</form:option>
			<form:option value="Delhi">Delhi</form:option>
			<form:option value="Mumbai">Mumbai</form:option>
			<form:option value="Chennai">Chennai</form:option>
		</form:select>


		<input type="submit" value="register">
	</form:form>
</body>
</html>