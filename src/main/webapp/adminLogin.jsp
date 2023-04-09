<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Admin Login</h1>


<form action="authenticationController" method="post">
Email:<input type="email" name="adminEamil">
password:<input type="password" name="adminPass">
         <input type="submit" value="submit">
         ${error}
</form>
</body>
</html>