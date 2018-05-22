<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
		<div id="Id-form">
			<form  method="post" action="RecruiterData" >

				<div class="col-lg-8">
					<div class="form-group">
						<h3 style="font-weight: bold; font-style: italic;">Registration Form</h3>
					</div>


					<div class="form-group">
						<hr>
					</div>
					<div class="form-group">
						<div class="input-group">
							<span class="input-group-addon"> <span class="glyphicon glyphicon-user"></span></span>
							<input type="text" name="rname" class="form-control" placeholder="Enter your Name" />
						</div>
					</div>
					
					<div class="form-group">
						<div class="input-group">
							<span class="input-group-addon"> <span class="glyphicon glyphicon-user"></span></span>
							<input type="text" name="cname" class="form-control" placeholder="Enter your Company Name" />
						</div>
					</div>
					
					
					<div class="form-group">
						<div class="input-group">
							<span class="input-group-addon"> <span class="glyphicon glyphicon-phone"></span></span>
							<input type="text" name="cid" class="form-control" placeholder="Enter your Contact " />
						</div>
					</div>
					
					<div class="form-group">
						<div class="input-group">
							<span class="input-group-addon"> <span class="glyphicon glyphicon-user"></span></span>
							<input type="text" name="address" class="form-control" placeholder="Enter your Company Address" />
						</div>
					</div>
					

					<div class="form-group">
						<div class="input-group">
							<span class="input-group-addon"> <span class="glyphicon glyphicon-euro"></span></span>
							<input type="text" name="resrc" class="form-control" placeholder="Enter your Mail id" />
						</div>
					</div>
					
					<div class="form-group">
						<div class="input-group">
							<span class="input-group-addon"> <span class="glyphicon glyphicon-user"></span></span>
							<input type="text" name="ctype" class="form-control" placeholder="Enter your Company Type" />
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