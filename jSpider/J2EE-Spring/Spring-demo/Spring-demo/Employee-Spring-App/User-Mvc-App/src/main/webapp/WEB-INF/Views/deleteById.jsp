<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Page</title>
</head>

<style>

*{
margin: 0px;
padding: 0px;

}

.delete{
margin: 10% 30%;
padding: 11%;
background-color: grey;
box-shadow: 0px 3px 10px black;
border-radius: 10px;

}
.delete input {
	height: 40px;
	widows: 520px;
	border-radius: 10px;
	
}
#btn{

padding: 10px;
margin: 20px;
margin-left: 40px;
background-color: red;
font-size: 10px;
font-weight: bold;
color: white;
border: none;

}
form{
margin-left: 21%;
}
h3{
color: blue;
}

</style>

<body>
<div class="delete">

<form action="delete-by-id">
<h3>Delete the User By Id</h3>
		<input type="number" name="id" placeholder="Enter the User Id"><br>
		<input id="btn" type="submit" value="Delete User">
</form>

</div>
</body>
</html>