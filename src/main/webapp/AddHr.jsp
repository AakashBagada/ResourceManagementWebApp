<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="AddHr" method="post">
  
     First Name: <input type="text" name="firstName"  value="${user.hrFirstName}" required><span>${firstname}</span><br/><br/>
	 Last Name:  <input type="text" name="lastName" value="${user.hrLastName}" required><span>${lastname}</span><br/><br/>
     Email ID:  <input type="email" name="emailId" value="${user.hrEmail}" required><span>${email}</span><br/><br/>
     Password: <input type="password" name="password" value="${user.hrPassword}" required><span>${password}</span><br/><br/>
	 Gender:<input type="radio" name="gender" value="Male" value="${user.hrGender}">Male
	       <input type="radio" name="gender" value="Female" value="${user.hrGender}">Female<br/><br/>
	 Contact No:<input type="tel" name="number" min="10" max="10" vlaue="${user.hrContact}" required><span>${number}</span><br/><br/>
	 Joining Date:<input type="date" name="date" required><br/><br/>
	 <input type="submit" value="ADD">
	      	  
</form>
</body>
</html>