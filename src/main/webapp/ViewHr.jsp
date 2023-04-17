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
			<div class="col-md-8" style="text-align: center;">
				<h1>View Hr Page</h1>
				<table border="1" class="table mx-auto">
					<tr>
						<th>Id</th>
						<td>${user.hrId}</td>
					</tr>
					<tr>
						<th>First Name</th>
						<td>${user.hrFirstName}</td>
					</tr>
					<tr>
						<th>Last Name</th>
						<td>${user.hrLastName}</td>
					</tr>
					<tr>
						<th>Email Id</th>
						<td>${user.hrEmail}</td>
					</tr>
					<tr>
						<th>Password</th>
						<td>${user.hrPassword}</td>
					</tr>
					<tr>
						<th>Gender</th>
						<td>${user.hrGender}</td>
					</tr>
					<tr>
						<th>Contact No</th>
						<td>${user.hrContact}</td>
					</tr>
					<tr>
						<th>Join Date</th>
						<td>${user.hrJoinDate}</td>
					</tr>
				</table>
			</div>
			<div class="col-md-2"></div>

		</div>


	</div>

</body>
</html>