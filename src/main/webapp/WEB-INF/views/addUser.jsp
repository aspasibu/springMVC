<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Add new user here:</h3>
	<form action="add" method="post">
	<table>
	<tr><td>Username:</td><td> <input type="text" name="username"></td></tr>
	<tr><td>Password:</td><td><input type="password" name="password"></td></tr>
	<tr><td>email:</td><td> <input type="text" name="email"></td></tr>
	<tr><td>First Name:</td><td> <input type="text" name="firstName"></td></tr>
	<tr><td>Last Name:</td><td><input type="text" name="lastName"></td></tr>
	<tr><td colspan=1><input type="submit" value="add"></td><td></td></tr>
	</table>
	</form>
</body>
</html>