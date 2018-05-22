<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="Recruitheader.jsp" %>
<br><br><br><br><br><br>
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
						
						<tbody>	
								<thead>
									<tr>
										<th>ID</th>
										<th>Name</th>
										<th>ContactNumber</th>
										<th>Email-id</th>
										<th>Experience</th>
										<th>Skills</th>
										<th>Qualification</th>
										
										<th>Certification</th>
										
									</tr>
								</thead>
								
<c:forEach var="rd" items="${skill}">
<tr>					
<td><c:out value="${rd.emp_id}"/></td>
<td><c:out value="${rd.fname}"/></td>
<td><c:out value="${rd.cid}"/></td>
<td><c:out value="${rd.email}"/></td>
<td><c:out value="${rd.expr}"/></td>
<td><c:out value="${rd.skill.keywords}"/></td>
<td><c:out value="${rd.skill.qualification}"/></td>
<td><c:out value="${rd.skill.certification}"/></td>
</tr>

</c:forEach>	
								
						</tbody>
					</table>

					<div class="panel-footer">
						<a href ="ReplytoSearch.jsp">Reply</a>
					</div>
					
				</div>
			</div>
		</div>
		
	</div>
			
</body>
</html>