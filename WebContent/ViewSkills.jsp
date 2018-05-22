<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Skill you are added</title>
</head>
<body>
<%@include file="headerEmployee.jsp" %>


<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-primary">
					<div class="panel-heading">
							<h3 class="panel-title">
							Details of an Employee Skills
							</h3>
						</div>
					

					<table class="table">
						<c:set var="skd" value="${skill }"/> 
						<tbody>	
								<tr>
									<td>Skills</td>
									<td>${skd.keywords}</td>
								</tr>
								<tr>
									<td>Qualification</td>
									<td>${skd.qualification}</td>
								</tr>
								<tr>
									<td>Certification</td>
									<td>${skd.certification}</td>
								</tr>
						</tbody>
					</table>

					<div class="panel-footer">
						<a href ="UpdateSkill.jsp">Update Skills</a>
					</div>
					
				</div>
			</div>
		</div>
		
	</div>















































<table class="table">

</table>


</body>
</html>