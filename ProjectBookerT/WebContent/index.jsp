<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html >
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
<title>Home page</title>
</head>
<body>
	<div class="headmain text-center">

		<h1 class="display-1" style="font-family: ostrich">Welcome to BookerT</h1>
		<p>Movie Ticket booking service</p>
	</div>
	<div class="jumbotron text-center">
		<div id="demo" class="carousel slide" data-ride="carousel">

			<!-- Indicators -->
			<ul class="carousel-indicators">
				<li data-target="#demo" data-slide-to="0" class="active"></li>
				<li data-target="#demo" data-slide-to="1"></li>
				<li data-target="#demo" data-slide-to="2"></li>
			</ul>

			<!-- The slideshow -->
			<div class="carousel-inner">
				<div class="carousel-item active">
					<img src="images/img1.jpg" alt="movie 1" width="1100" height="300">
				</div>
				<div class="carousel-item">
					<img src="images/img2.jpg" alt="movie 2" width="1100" height="300">
				</div>
				<div class="carousel-item">
					<img src="images/img3.jpg" alt="movie 3" width="1100" height="300">
				</div>
			</div>

			<!-- Left and right controls -->
			<a class="carousel-control-prev" href="#demo" data-slide="prev">
				<span class="carousel-control-prev-icon"></span>
			</a> <a class="carousel-control-next" href="#demo" data-slide="next">
				<span class="carousel-control-next-icon"></span>
			</a>

		</div>
	</div>
	<div class="text-center display-4">
		<c:url var="myAction" value="checkLogin.obj" />
		<form:form action="${myAction}" method="post" modelAttribute="login">
			<table align="center">
				<tr>
					<td>Login :</td>
					<td><form:input path="login" required="required"/></td>
				</tr>

				<tr>
					<td>Password :</td>
					<td style="color:black"><form:password  path="password" required="required"/><br></td>
				</tr>
				<tr>
				<td></td>
					<td><input class="btn btn-outline-light btn-lg" type="submit" value="LOGIN" />

						<button type="button" class="btn btn-outline-light btn-lg">
							<a href="register.obj">Register</a>
						</button></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>