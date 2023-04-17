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
     <jsp:include page="AdminPage.jsp"></jsp:include>
         <div class="row">
            <div class="col-md-2"></div>
            <div class="col-md-8"  style="text-align:center;">
              <h1>Login here</h1>
            <form action="authenticationController" method="post">
                     Email:<input type="email" name="adminEmail"><br><br>
                  password:<input type="password" name="adminPass"><br><br>
                           <input type="submit" value="submit"><br><br>
            </form>
                   ${error}
            </div>
            <div class="col-md-2"></div>
         
         
         </div>
     
     
     </div>




</body>
</html>