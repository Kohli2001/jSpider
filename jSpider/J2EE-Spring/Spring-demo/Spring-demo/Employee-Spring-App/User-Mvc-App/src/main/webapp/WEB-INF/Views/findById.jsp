<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Find By Id</title>
</head>

<style>

*{
margin: 0px;
padding: 0px;

}

.find{
margin: 10% 30%;
padding: 11%;
background-color: grey;
box-shadow: 0px 3px 10px black;
border-radius: 10px;

}
.find input {
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

<div class="find">

<form action="find-by-id">

<h3>Find User By Id</h3>
<input type="number" name="id" placeholder="Enter thr User id">
<input id="btn" type="submit" value="Find User">
</form>

</div>

</body>
</html>