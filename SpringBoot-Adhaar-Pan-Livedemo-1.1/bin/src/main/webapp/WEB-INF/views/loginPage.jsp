<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.loginError {
	color: Red;
	position: fixed;
	text-align: left;
	margin-left: 30px;
}
</style>
<meta charset="ISO-8859-1">
<title></title>
</head>

<body bgcolor="Silver">

	<div align="center">
		<h1>Candidate Login</h1>

		<hr />

		<form:form action="loginProcessing" modelAttribute="loginBundle">

			<label for="eid">Email Id :</label>
			<form:input path="loginemailId" id="eid" />
			<form:errors path="loginemailId" cssClass="loginError"/>
			<br>
			<br>

			<label for="pwd">Password :</label>
			<form:input path="loginPassword" />
			<form:errors path="loginPassword" cssClass="loginError"/>
			<br>
			<br>

			<input type="submit" value="Sign In" />
		</form:form>

		<br>
		<hr />
		<a href="/user/registerPage"> Register</a>

	</div>

</body>
</html>