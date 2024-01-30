<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display Page</title>
</head>
<style>

*{
margin: 0px;
padding: 0px;

}

body{
background-color: #ADD8E6
}
.details{
margin:15% 30%;
padding: 20px 40px;
background-color: wheat;
box-shadow: 0px 3px 13px black;
text-align: left;
border-radius: 20px;
}
.details h2{
padding-top: 20px;
}
.details span{
color: blue;
}

</style>

<body>
	<div class="details">
	
	<h2>User Id: <span>${u.getId() }</span> </h2>
	<h2>User Name: <span>${u.getName() }</span> </h2>
	<h2>Email Id:  <span>${u.getEmail() }</span> </h2>
	<h2>Phone Number: <span>${u.getPhone() }</span> </h2>
	<h2>Gender:  <span>${u.getGender() }</span> </h2>
	
	</div>
</body>
</html>