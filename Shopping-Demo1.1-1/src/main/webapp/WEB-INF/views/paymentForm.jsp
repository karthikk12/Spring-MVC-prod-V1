<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<script type="text/javascript">
	function showPopupMsg() {

		alert("Data saved SUccessfully..");
	}
</script>
<head>
<meta charset="ISO-8859-1">
<title>Payment</title>
</head>
<div align="center">
	<body bgcolor="Silver">

		<h1>Payment Details Form</h1>
		<hr>



		<form:form action="/pay/savePayment" modelAttribute="paymentBundle">


			<label for="cn"> Card Number :</label>
			<form:input path="cardNumber" id="cn" />
			<br>
			<br>

			<label for="cnb"> Card Name :</label>
			<form:input path="cardName" id="cnb" />
			<br>
			<br>

			<label for="cpn"> Card Phone Number :</label>
			<form:input path="CardPhoneNumber" id="cpn" />
			<br>
			<br>

			<input onclick="showPopupMsg()" type="submit" value="Save" />

		</form:form>

		<br>
		<form action="/pay">

			<input type="submit" value="Submit" />

		</form>
</div>


</body>
</html>