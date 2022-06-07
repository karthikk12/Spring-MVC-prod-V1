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
	<div align="center">
		<h1>Sign Up Page</h1>

		<form:form action="process-signPage" method="POST"
			modelAttribute="signUpBundle">
			<label for="un">UserName :</label>
			<form:input path="userName" id="un" />
			<br />
			<label for="un">Password :</label>
			<form:password path="password" />
			<br />
			<input type="submit" value="Sign Up" />


		</form:form>
	</div>
</body>
</html>