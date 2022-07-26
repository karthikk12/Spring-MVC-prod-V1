<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<style type="text/css">
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="Silver">


	<div align="center">

		<table border="1">

			<thead>
				<tr>
					<th>Id</th>
					<th>First Name</th>
					<th>User Name</th>
					<th>Last Name</th>
					<th>Email Id</th>
					<th>Password</th>
					<th>Country</th>
					<th>Company</th>
					<th>Age</th>
					<th>Gender</th>
					<th>Hobbies</th>
					<th>Details</th>

				</tr>

			</thead>

			<c:forEach var="eachCandidate" items="${candidateList}">
				<tr>
					<td>${eachCandidate.candid}</td>
					<td>${eachCandidate.firstname}</td>
					<td>${eachCandidate.username}</td>
					<td>${eachCandidate.lastname}</td>
					<td>${eachCandidate.emailId}</td>
					<td>${eachCandidate.password}</td>
					<td>${eachCandidate.country}</td>
					<td>${eachCandidate.company}</td>
					<td>${eachCandidate.age}</td>
					<td>${eachCandidate.gender}</td>
					<td>${eachCandidate.hobbies}</td>
					<td><a href="/Edu/bankDetailsAPIInfo/${eachCandidate.candid}">Info</a></td>
				</tr>
			</c:forEach>

		</table>

	</div>


</body>
</html>