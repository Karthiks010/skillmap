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
		<div class="jumbotron">
			<form method="post" action="FetchSkills">
				
					<label style="font-weight:bold;">Search for a Better Employee:</label> <br>
					<input type="text" name="search"/>
					<button>
					<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
					</button>
			</form>
		</div>
	</div>	


</body>
</html>