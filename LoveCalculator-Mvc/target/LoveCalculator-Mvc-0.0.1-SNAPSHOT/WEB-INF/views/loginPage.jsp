<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="silver">
	<h1 align="center">LOVE CALCULATOR</h1>
	<div align="right">
		<a href="newUser">Register</a>
	</div>
	<hr />
	<br />

	<div align="center">
		<form:form action="processCalculate" method="get"
			modelAttribute="userData">

			<label for="un">User Name :</label>
			<form:input path="userName" id="un" />

			<br />
			<br />
			<label for="cn">Crush Name :</label>
			<form:input path="crushName" id="cn" />
			<br />
			<br />
			<input type="submit" value="Calculate" />

		</form:form>
	</div>

</body>
</html>