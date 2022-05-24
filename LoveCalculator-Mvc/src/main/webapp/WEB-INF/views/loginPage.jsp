<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>

<style type="text/css">
.webError {
	color: Red;
	position: fixed;
	text-align: left
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="silver">


	<h1 align="center">ASSIST LOGIN</h1>
	<div align="right">
		<a href="newUser">Register</a>
	</div>
	<div align="right">
		<a href="electricPayBill">Electricity Bill</a>
	</div>


	<hr />
	<br />

	<div align="center">
		<form:form action="processCalculate" method="get"
			modelAttribute="userData">

			<label for="un">User Name :</label>
			<form:input path="userName" id="un" />
			<form:errors path="userName" cssClass="webError" />

			<br />
			<br />
			<label for="pd">Password :</label>
			<form:password path="password" id="pd" />
			<form:errors path="password" cssClass="webError" />
			<br />
			<br />
			<label> Terms and Condition</label>
			<form:checkbox path="AggreementAccepted" id="ag" />
			<form:errors path="AggreementAccepted" cssClass="webError" />
			<br />
			<br />

			<input type="submit" value="Calculate" />

		</form:form>
	</div>

</body>
</html>