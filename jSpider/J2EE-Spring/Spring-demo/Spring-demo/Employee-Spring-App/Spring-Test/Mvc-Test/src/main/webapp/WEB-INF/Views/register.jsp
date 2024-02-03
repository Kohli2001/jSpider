<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Form</title>
</head>


<body>


	<h1>Fill The Following details to Register</h1>

	<div class="details">

		<form:form modelAttribute="u" action="register"  method="post">
			<form:label path="name">User Name</form:label>
			<form:input path="name" placeholder="Enter Your Name" />
			<br>
			<form:label path="phone">User Phone Number</form:label>
			<form:input path="phone" placeholder="Enter your Phone Nmuber" />
			<br>
			<form:label path="email">User Email ID</form:label>
			<form:input path="email" placeholder="Enter Your Email Id" />
			<br>
			<form:label path="gender">Gender</form:label>
			<form:radiobutton path="gender" value="male" />Male
			<form:radiobutton path="gender" value="female" />Female
			<br>
			<form:label path="password">Create Password</form:label>
			<form:input path="password" placeholder="Create Your Password" />
			<br>

			<form:button id="btn">Register user</form:button>
		</form:form>


	</div>

</body>
</html>