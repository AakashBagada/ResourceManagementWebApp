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
              <h1>Edit Hr Page</h1>
              <form action="editHr" method="post">

                 <input type="hidden" name="id" value="${param.id}">
     First Name: <input type="text" name="firstName" required value=${user.hrFirstName} ><span>${firstname}</span><br/><br/>
	  Last Name:  <input type="text" name="lastName"  required value=${user.hrLastName}><span>${lastname}</span><br/><br/>
       Email ID:  <input type="text" name="emailId"  required value=${user.hrEmail}><span>${email}</span><br/><br/>
       Password: <input type="text" name="password"  required value=${user.hrPassword}><span>${password}</span><br/><br/>
	     Gender:<input type="radio" name="gender" value="Male">Male
	            <input type="radio" name="gender" value="Female">Female<span>${gender}</span><br/><br/>
	 Contact No:<input type="tel" name="number" required value=${user.hrContact}><span>${number}</span><br/><br/>
	 Joining Date:<input type="date" required name="date" ><br/><br/>
	             <input type="submit" value="ADD">
	      
	  
              </form>
            </div>
            <div class="col-md-2"></div>
         
         
         </div>
     
     
     </div>

</body>
</html>