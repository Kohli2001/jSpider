<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Verify By Id</title>
</head>


<style>

*{
margin: 0px;
padding: 0px;

}

.verify{
margin: 10% 20%;
padding: 11%;
background-color: grey;
box-shadow: 0px 3px 10px black;
border-radius: 10px;

}
.verify input {
	height: 40px;
	widows: 520px;
	border-radius: 10px;
	margin-top: 10px;
	
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

<div class="verify">
<form action="verify-by-id">
		<h3>Verify User By User Id And Password</h3>
		<input type="number" name="id" placeholder="Enter thr User id">
		<input type="password" name="password" placeholder="Enter your Password">
		<input id="btn"  type="submit" value="VERIFY">
	</form>
</div>
	
</body>
</html>