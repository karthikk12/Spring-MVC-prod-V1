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


	<h1 align="center">LC LOGIN</h1>
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
			<label for="cn">Crush Name :</label>
			<form:input path="crushName" id="cn" />
			<form:errors path="crushName" cssClass="webError" />
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