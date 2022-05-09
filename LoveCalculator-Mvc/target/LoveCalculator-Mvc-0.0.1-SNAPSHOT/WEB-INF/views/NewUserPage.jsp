<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">New User Registration Page</h1>
	<hr />
	<div align="center">
		<form:form action="newSubmission" modelAttribute="newUserEntry">

			<label for="n"> Name :</label>
			<form:input path="name" id="n" />
			<br>
			<br>

			<label for="un">User Name :</label>
			<form:input path="userName" id="un" />
			<br>
			<br>

			<label for="pwd">Password :</label>
			<form:password path="password" id="pwd" />
			<br>
			<br>

			<label for="ct">Country :</label>
			<form:input path="country" id="ct" />
			<br>
			<br>
			<label for="gd">Gender :</label>
			<form:input path="gender" id="ct" />

			<input type="submit" value="Register">

		</form:form>

	</div>
</body>
</html>