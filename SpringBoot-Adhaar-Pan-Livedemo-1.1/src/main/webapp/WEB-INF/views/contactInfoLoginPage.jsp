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
	function showSavedMsg() {

		alert("Data Saved Successfully..!! Please Submit");

	}
</script>
<body bgcolor="Silver">

	<div align="center">

		<h1>Emergency Contact</h1>
		<hr />

		<form:form action="SaveContactDetails" modelAttribute="contactBundle">

			<label for="phN">Phone Number :</label>
			<form:input path="phoneNumber" id="phN" />

			<br>
			<br>

			<label for="rlShp">Relationship :</label>
			<form:select path="relationShip" id="rlShp">

				<form:option value="Mother" label="Mother" />
				<form:option value="Father" label="Father" />
				<form:option value="Spouse" label="Spouse" />
				<form:option value="Guradian" label="Guradian" />


			</form:select>
			<br>
			<br>

			<label for="phN">Parent Number :</label>
			<form:input path="phoneNumber" id="phN" />

			<br>
			<br>

			<label for="scEm">Secondary Email :</label>
			<form:input path="secondaryEmail" id="scEm" />
			<br>
			<br>
			<input onclick="showSavedMsg()" type="submit" value="Save" />

			<br>
			<br>


		</form:form>


		<form:form action="/biometric/ProofsPageLogin" method="get">

			<input type="submit" value="Next" />

		</form:form>

	</div>



</body>
</html>