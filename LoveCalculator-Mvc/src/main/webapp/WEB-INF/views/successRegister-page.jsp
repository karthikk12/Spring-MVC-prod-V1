
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">

		<h1>New User Details</h1>
		<hr />


		<p>Name : ${newUserEntry.name}</p>
		<p>User Name : ${newUserEntry.userName}</p>
		<p>Password : ${newUserEntry.password}</p>
		<p>Country : ${newUserEntry.country}</p>

		Hobbies:
		<c:forEach var="temp" items="${newUserEntry.hobbies}">
			<p>${temp}</p>

		</c:forEach>

		<p>Gender : ${newUserEntry.gender}</p>
		<p>Age : ${newUserEntry.age}</p>
		<p>Email : ${newUserEntry.communicationDto.email}</p>
		<p>Phone : ${newUserEntry.communicationDto.phone}</p>


	</div>
</body>
</html>