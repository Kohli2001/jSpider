<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Form</title>
</head>
<style>
h1{
 text-align: center;
}
.details{
	margin: 10px 35% 10px 35%;
}
.details input{
width: 200px;
height: 20px;
}
.details button{
background-color: "green"
}
</style>
<body>

	<h1>Fill The Following details to Register</h1>

<div class="details">

<form:form modelAttribute="u" action="register">

<form:label path="id">Id</form:label>
<form:input path="id"/> <br>
<form:label path="name">Name</form:label>
<form:input path="name"/> <br>
<form:label path="phone">Phone Number</form:label>
<form:input path="phone"/> <br>
<form:label path="email">Email iD</form:label>
<form:input path="email"/> <br>
<form:label path="gender">Gender</form:label>
<form:radiobutton path="gender" value="male"/>Male
<form:radiobutton path="gender" value="female"/>Female
<br>
<form:label path="age">Age</form:label>
<form:input path="age"/> <br>
<form:label path="password">Password</form:label>
<form:input path="password"/> <br>

<form:button>Register</form:button>
</form:form>


</div>
	
</body>
</html>