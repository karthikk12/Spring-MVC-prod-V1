
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="Silver">
	<div align="right">
		<a href="welcomePage">Logout</a>
	</div>
	<div align="center">


		<h1>Your Entered Details :</h1>
		<hr />


		<p>
			<b>Name: </b>${newUserEntry.name}</p>
		<p>
			<b>User Name :</b> ${newUserEntry.userName}
		</p>
		<p>
			<b>Password :</b> ${newUserEntry.password}
		</p>
		<p>
			<b>Country :</b> ${newUserEntry.country}
		</p>

		<b>Hobbies:</b>
		<c:forEach var="temp" items="${newUserEntry.hobbies}">
			${temp}

		</c:forEach>

		<p>
			<b>Gender :</b> ${newUserEntry.gender}
		</p>
		<p>
			<b>Age : </b>${newUserEntry.age}</p>
		<p>
		<h2>Communication:</h2>
		<hr />
		<b>Email : </b>${newUserEntry.communicationDto.email}</p>
		<p>
			<b>Phone : </b>${newUserEntry.communicationDto.phone}</p>
		<p>
			<b>Landline : </b>${newUserEntry.communicationDto.landline}</p>



	</div>
</body>
</html>