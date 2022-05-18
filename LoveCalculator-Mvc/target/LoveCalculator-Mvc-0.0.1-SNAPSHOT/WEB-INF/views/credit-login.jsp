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
	<div align="center">
		<h1>Credit Card Bill Pay</h1>
		<hr />

		<form:form action="creditSuccessPage" modelAttribute="creditBundle">
			<label for="cn"> Credit Card Number :</label>
			<form:input path="cardNumber" id="cn" />
			<br>
			<br>

			<label for="ca"> Credit Amount:</label>
			<form:input path="creditAmount" id="ca" />
			<br>
			<br>
			<input type="submit" value="Pay" />

		</form:form>

	</div>
</body>
</html>