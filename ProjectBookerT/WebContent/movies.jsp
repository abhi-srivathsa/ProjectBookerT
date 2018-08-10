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
<title>Welcome</title>
</head>
<body class = "text-center">
	<h3>Hello ${regi.name}</h3>
	<%-- <form:form action="addmovie.obj" method="post" modelAttribute="mov">
		<table>
			<tr>
				<td>Enter date :</td>
				<td><form:input path="date" /></td>
				</tr>
				<tr>
				<td> Select the movie </td>
				<td><form:radiobuttons path="movie" value = "Mission Impossible"/><img alt="Tom" src="images/MI.jpg"> 
				</td></tr>
	</form:form>
 --%>
 <form action="#" class = "display-4">
 <table align = "center">
			<tr>
				<td>Enter date :</td>
				<td><input type="date" /></td>
				</tr>
				<tr>
				<td> Select the movie </td>
				</tr>
				<tr>
				<td><input type="radio" name="movie" value = "Mission Impossible" /><img alt="Tom" src="images/MI.jpg"> 
				</td>
				
				<td><input type="radio" name="movie" value = "GIJoe"/><img alt="Tom" src="images/GI.jpg "> 
				</td>
				
				<td><input type="radio" name="movie" value = "Fast"  /><img alt="Tom" src="images/FF.jpg"> 
				</td></tr>
				</table>
				<input type = submit value ="book it!" class="btn btn-outline-light btn-lg" >
 
 </form>
</body>
</html>