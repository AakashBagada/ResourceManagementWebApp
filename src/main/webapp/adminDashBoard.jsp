<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<button><a href="AddHr.jsp" style="text-decoration: none">Add HR</a></button>


<table border="1">
    <tr>
      <th>Id</th>
      <th>First Name</th>
      <th>Last Name</th>
      <th>Email Id</th>
      <th>Contact No</th>
      <th>Action</th>
      
   </tr>
   
   
   <c:forEach items="${users}" var="user">

   
   <tr>
       <td>${user.hrId}</td>
       <td>${user.hrFirstName}</td>
       <td>${user.hrLastName}</td>
       <td>${user.hrEmail}</td>
       <td>${user.hrContact}</td>
       <td><button><a href="view?id=${user.hrId}" style="text-decoration: none">View HR</a></button>   
       |
       <button><a href="delete?id=${user.hrId}" style="text-decoration: none">Delete HR</a></button>
       |
       <butoon><a href="Edit?id=${user.hrId}" style="text-decoration: none">Edit HR</a></butoon>
    </tr>  
   
   </c:forEach>
         
</table>
<br><br>
</body>
</html>