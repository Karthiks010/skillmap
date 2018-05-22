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
<title>Registration of Users</title>
</head>
<body>
<br><br><br><br><br>
<%@include file="index.jsp" %>
	<div class="container">
		<div id="Id-form">
			<form  method="post" action="EmployeeData" >

				<div class="col-lg-8">
					<div class="form-group">
						<h2 style="font-weight: bold;">Registration Details</h2>
					</div>


					<div class="form-group">
						<hr>
					</div>
					<div class="form-group">
						<div class="input-group">
							<span class="input-group-addon"> <span class="glyphicon glyphicon-user"></span></span>
							<input type="text" name="fname" class="form-control" placeholder="Enter your FirstName" />
						</div>
					</div>
					
					<div class="form-group">
						<div class="input-group">
							<span class="input-group-addon"> <span class="glyphicon glyphicon-user"></span></span>
							<input type="text" name="lname" class="form-control" placeholder="Enter your LastName" />
						</div>
					</div>
					
					
					<div class="form-group">
						<div class="input-group">
							<span class="input-group-addon"> <span class="glyphicon glyphicon-phone"></span></span>
							<input type="text" name="contact" class="form-control" placeholder="Enter your Contact " />
						</div>
					</div>
					
					<div class="form-group">
						<div class="input-group">
							<span class="input-group-addon"> <span class="glyphicon glyphicon-user"></span></span>
							<input type="text" name="jdmn" class="form-control" placeholder="Enter your Job Domian" />
						</div>
					</div>
					

					<div class="form-group">
						<div class="input-group">
							<span class="input-group-addon"> <span class="glyphicon glyphicon-euro"></span></span>
							<input type="text" name="exp" class="form-control" placeholder="Enter your Experience" />
						</div>
					</div>
					
					<div class="form-group">
						<div class="input-group">
							<span class="input-group-addon"> <span class="glyphicon glyphicon-user"></span></span>
							<input type="text" name="city" class="form-control" placeholder="Enter your city" />
						</div>
					</div>


					<div class="form-group">
						<div class="input-group">
							<span class="input-group-addon"> <span class="glyphicon glyphicon-user"></span></span>
							<input type="text" name="street" class="form-control" placeholder="Enter your Street" />
						</div>
					</div>
					
					<div class="form-group">
						<div class="input-group">
							<span class="input-group-addon"> <span class="glyphicon glyphicon-lock"></span></span>
							<input type="text" name="state" class="form-control" placeholder="Enter your State" />
						</div>
					</div>
					<div class="form-group">
						<div class="input-group">
							<span class="input-group-addon"> <span class="glyphicon glyphicon-lock"></span></span>
							<input type="text" name="country" class="form-control" placeholder="Enter your country" />
						</div>
					</div>


					<div class="form-group">
						<div class="input-group">
							<span class="input-group-addon"> <span class="glyphicon glyphicon-envelope"></span></span>
							<input type="email" name="email" class="form-control" placeholder="Enter your Email" />
						</div>
					</div>
					
					
					<div class="form-group">
						<div class="input-group">
							<span class="input-group-addon"> <span class="glyphicon glyphicon-envelope"></span></span>
							<input type="password" name="pass" class="form-control" placeholder="Enter your Password" />
						</div>
					</div>
					
					
					<div class="form-group">
						<div class="input-group">
							<span class="input-group-addon"> <span class="glyphicon glyphicon-envelope"></span></span>
							<input type="password" name="cpass" class="form-control" placeholder="Enter your Confirm Password" />
						</div>
					</div>


					<div class="form-group" align="center">
                        <div class="input-group">
                            <div class="btn-group" data-toggle="buttons">
                                <label class="btn btn-primary active">
                                    <input type="radio" name="options" value="employee" autocomplete="off" checked> Employee
                                </label>
                                <label class="btn btn-primary">
                                    <input type="radio" name="options" value="recruiter" autocomplete="off">Recruiter
                                </label>
                            </div>
                        </div>
                    </div>

                    <div class="form-group">
                        <hr/>
                    </div>

                    <div class="form-group">
                        <button type="submit" class="btn btn-block btn-primary" name="btn-signup">Sign Up</button>
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