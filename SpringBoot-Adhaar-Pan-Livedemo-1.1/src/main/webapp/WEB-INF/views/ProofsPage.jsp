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
	function popUpAlert() {

		alert("Data Saved Successfully..!! Please Submit");

	}
</script>
<body bgcolor="Silver">
	<div align="center">

		<h1>Proofs Page</h1>
		<hr />
		<br>

		<form:form action="/biometric/SaveProofDetails"
			modelAttribute="proofBundle">

			<label for="nap"> Name As per Proof :</label>
			<form:input path="nameAsProof" id="nap" />
			<br>
			<br>

			<label for="adn"> Aadhaar Card Number :</label>
			<form:input path="aadhaarNo" id="adn" />

			<br>
			<br>

			<label for="pcn"> Pan Card Number :</label>
			<form:input path="pancardNo" id="pcn" />
			<br>
			<br>
			<input onclick="popUpAlert()" type="submit" value="Save" />

			<br>
			<br>

		</form:form>

		<form action="/biometric/proofProcessing" method="get">

			<input type="submit" value="Submit" />



		</form>

	</div>
</body>
</html>