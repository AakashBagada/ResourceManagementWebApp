<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resource management WebApp</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body>

<div class="container-fluid"> 
     <jsp:include page="AdminDashBoardDesing.jsp"></jsp:include>
         <div class="row">
            <div class="col-md-2"></div>
            <div class="col-md-8"  style="text-align:center;">
              <h1>Add Hr</h1>
            <form action="AddHr" method="post">
                  First Name: <input type="text" name="firstName"  value="${user.hrFirstName}" required><span>${firstname}</span><br/><br/>
	               Last Name:  <input type="text" name="lastName" value="${user.hrLastName}" required><span>${lastname}</span><br/><br/>
                    Email ID:  <input type="email" name="emailId" value="${user.hrEmail}" required><span>${email}</span><br/><br/>
                    Password: <input type="password" name="password" value="${user.hrPassword}" required><span>${password}</span><br/><br/>
	                  Gender:<input type="radio" name="gender" value="Male" >Male 
	                         <input type="radio" name="gender" value="Female">Female<span>${gender}</span><br>
	              Contact No:<input type="tel" name="number" min="10" max="10" vlaue="${user.hrContact}" required><span>${number}</span><br/><br/>
	            Joining Date:<input type="date" name="date" required><br/><br/>
	                            <input type="submit" value="ADD">
	      	  
           </form>
            </div>
            <div class="col-md-2"></div>
         </div>
</div>
</body>
</html>