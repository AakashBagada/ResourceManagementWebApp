<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
				<h1>ADD HR PAGE</h1>
				<button>
					<a href="AddHr.jsp" style="text-decoration: none">Add HR</a>
				</button>

              <div style="align-content: center;">
              <table border="1" class="table mx-auto">
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
							<td><button>
									<a href="view?id=${user.hrId}" style="text-decoration: none">View
										HR</a>
								</button> |
								<button>
									<a href="delete?id=${user.hrId}" style="text-decoration: none">Delete
										HR</a>
								</button> |
								<button>
									<a href="editHr?id=${user.hrId}" style="text-decoration: none">Edit
										HR</a>
								</button>
						</tr>

					</c:forEach>

				</table>
				<br>
				<br>
              </div>
			</div>
			<div class="col-md-2"></div>

		</div>


	</div>

</body>
</html>