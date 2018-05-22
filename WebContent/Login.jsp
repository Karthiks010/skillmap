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
<title>Login Page</title>
</head>
<body>
<%@include file="index.jsp"  %>
<br><br><br><br><br>
	<div class="container">
		<div id="Id-form">
			<form  method="post" action="Login">

				<div class="col-lg-8">
					<div class="form-group">
						<h2 style="font-weight: bold;">Enter the Login Details </h2>
					</div>


					<div class="form-group">
						<hr>
					</div>
					<div class="form-group">
						<div class="input-group">
							<span class="input-group-addon"> <span class="glyphicon glyphicon-user"></span></span>
							<input type="email" name="useremail" class="form-control" placeholder="Enter your mail id" />
						</div>
					</div>

					<div class="form-group">
						<div class="input-group">
							<span class="input-group-addon"> <span class="glyphicon glyphicon-lock"></span></span>
							<input type="password" name="pass" class="form-control" placeholder="Enter your Password" />
						</div>
					</div>


					<div class="form-group" align="center">
                        <div class="input-group">
                            <div class="btn-group" data-toggle="buttons">
                                <label class="btn btn-primary active">
                                    <input type="radio" name="options" value="employee" autocomplete="off" checked> Employee
                                </label>
                                <label class="btn btn-primary">
                                    <input type="radio" name="options" value="recruiter" autocomplete="off"> Recruiter
                                </label>
                            </div>
                        </div>
                    </div>

                    <div class="form-group">
                        <hr/>
                    </div>

                    <div class="form-group">
                        <button type="submit" class="btn btn-block btn-primary" name="btn-signin">Sign in</button>
                    </div>

                    <div class="form-group">
                        <hr/>
                    </div>

				</div>
			</form>
		</div>
	</div>

<%@include file="footer.jsp"  %>
</body>
</html>