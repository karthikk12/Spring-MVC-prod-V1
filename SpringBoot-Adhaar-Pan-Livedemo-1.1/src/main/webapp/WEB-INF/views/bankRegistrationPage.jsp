<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="Silver">
	<div align="center">
		<h1>Bank Details</h1>
		<hr />



		<form:form action="bankDetailsProcessing"
			modelAttribute="bankDetailsBundle">
			<label for="bn"> Bank Name :</label>
			<form:input path="bankname" id="bn" />
			<br>
			<br>

			<label for="ifc">IFSC Code :</label>
			<form:input path="coder" id="ifc" />
			<br>
			<br>

			<label for="acn">Account Number :</label>
			<form:input path="number" id="acn" />
			<br>
			<br>

			<input type="submit" value="Submit" />

		</form:form>


	</div>
</body>
</html>