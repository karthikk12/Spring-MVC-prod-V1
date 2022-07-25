<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	function alertSavePopUp() {

		alert("Data Saved Successfully..!! Please Submit");
	}
</script>
<body bgcolor="Silver">
	<div align="center">
		<h1>Bank Details</h1>
		<hr />

		<form:form action="/bankDetails/saveBankDetails"
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

			<input onclick="alertSavePopUp()" type="submit" value="Save" />

		</form:form>
		<br>

		<form:form action="/emergency/contactPage">

			<input type="submit" value="Next" />

		</form:form>

	</div>
</body>
</html>