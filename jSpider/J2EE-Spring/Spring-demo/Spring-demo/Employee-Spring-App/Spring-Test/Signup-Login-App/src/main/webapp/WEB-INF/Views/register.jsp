<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Form</title>
</head>

</style>
<body>

		<form:form modelAttribute="u" action="register"  method="post">
			<form:label path="name"> Name</form:label>
			<form:input path="name" placeholder="Enter Your Name" />
			<br>
			<form:label path="age">Age</form:label>
			<form:input path="age"/>
						

			<form:button id="btn">Register user</form:button>
		</form:form>


</body>
</html>