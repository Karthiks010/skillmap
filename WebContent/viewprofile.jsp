<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"   prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My Profile</title>
</head>
<body>
<%@include file= "headerEmployee.jsp" %>

<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-primary">
					<div class="panel-heading">
							<h3 class="panel-title">
							Details of an Employee
							</h3>
						</div>
					

					<table class="table">
						<c:set  var="emp" value="${employee}"/> 
						<tbody>
							<tr>
								<td>First Name :</td>
								<td>${emp.fname}</td>
							</tr>
							<tr>
								<td>Last Name</td>
								<td>${emp.lname }</td>
							</tr>
							<tr>
								<td>Contact Number</td>
								<td>${emp.cid}</td>
							</tr>
							<tr>
								<td>Job Domain</td>
								<td>${emp.jdomain}</td>
							</tr>
							
							<tr>
								<td>Experience</td>
								<td>${emp.expr}</td>
							</tr>
							
							<tr>
								<td>Email Id</td>
								<td>${emp.email}</td>
							</tr>
							
							<tr>
								<td>City</td>
								<td>${emp.city}</td>
							</tr>
							
							<tr>
								<td>State</td>
								<td>${emp.states}</td>
							</tr>
							
							<tr>
								<td>Country</td>
								<td>${emp.country}</td>
							</tr>
							
						</tbody>
					</table>

					<div class="panel-footer">
						<a href ="AddSkill.jsp">Add Skills</a>
					</div>
					
				</div>
			</div>
		</div>
		
	</div>




</body>
</html>






















 
 
 <br><br><br><br><br><br>
<table class="table" >


	<tr>
		<td>Name </td><td>${emp.fname}</td>
	</tr>
	
	</table>
</body>
</html>