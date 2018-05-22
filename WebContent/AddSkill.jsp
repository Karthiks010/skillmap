<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Cookie">
	<link rel="stylesheet" href="assets/css/user.css">
	<link rel="stylesheet" href="assets/bootstrap/fonts/font-awesome.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Skills Add</title>
</head>
<body>
<%@include file="headerEmployee.jsp"  %>
	
	<br><br><br>
	<div class="container">
		<div class="jumbotron"><h1>Professional Skills</h1> 
			<form method="post" action="SkillUpload">
				<label  style="font-weight: bold;">Add Skills </label> <br>
				<input type="text" name="skill"><br>
				<label  style="font-weight: bold;">Add Qualification </label> <br>
				<input type="text" name="qualification"><br>
				<label  style="font-weight: bold;">Add Certifications </label> <br>
				<input type="text" name="certificate"><br><br>
				<input type="submit" name="submit" value="Submit">
			</form>
		</div>
	</div>		

</body>
</html>