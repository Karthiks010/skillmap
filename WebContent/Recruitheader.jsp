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
<title>Recuitment Team</title>
</head>
<body>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core"   prefix="c" %>
<nav class="navbar navbar-default custom-header navbar-fixed-top" style="background-color: grey">
		<div class="navbar-header">
			<button  type="button" class="navbar-toggle" data-target=".navbar-collapse"  data-toggle="collapse">
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
		</div>
		<div class="navbar-collapse collapse">
			<ul class="nav navbar-nav">
				<li><a href="Applied.jsp">Applied For</a></li>
				<li><a href="Search.jsp">Search For</a></li>
				<li><a href="Login.jsp">Logout</a></li>			
			</ul>

			<ul class="nav navbar-right">

				<li><a href="#" style="text-align: center;">&nbsp;&nbsp;<span class="glyphicon glyphicon-user">
				</span>&nbsp;&nbsp;&nbsp;&nbsp;${runame}</a></li>
				

			</ul>

			
				</div>
			</div>
		</div>

	</nav>