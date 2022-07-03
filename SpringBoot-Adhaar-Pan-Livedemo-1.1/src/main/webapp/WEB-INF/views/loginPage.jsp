<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<script type="text/javascript">
	function oncallRegister() {

		window.open("/user/registerPage");
	}
</script>
<body bgcolor="Silver">

	<div align="center">
		<h1>Login Page</h1>

		<hr />

		<form:form action="loginProcessing" modelAttribute="loginBundle">

			<label for="eid">Email Id :</label>
			<form:input path="loginemailId" id="eid" />

			<label for="pwd">Password :</label>
			<form:input path="loginPassword" />

			<input type="submit" value="Sign In" />
		</form:form>

		<br>

		<form action="oncallRegister()" method="get">
			<input type="submit" value="Register" />

		</form>

	</div>

</body>
</html>