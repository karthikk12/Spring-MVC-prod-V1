<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
	function showPopupForSave() {

		alert("Data Saved Successfully.Proceed Next Page")
	}
</script>
<style type="text/css">
.errors {
	color: red;
	position: fixed;
	text-align: left;
	margin-left: 30px;
}
</style>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body bgcolor="Silver">
	<div align="center">
		<h1>Personal Information</h1>

		<br>

		<form:form action="/savePersonalInfo" modelAttribute="personalBundle">

			<label for="Fn"> First Name :</label>

			<form:input path="firstName" id="Fn" />
			<form:errors path="firstName" cssClass="errors" />
			<br>
			<br>

			<label for="Ln"> Last Name :</label>
			<form:input path="lastName" id="Ln" />
			<br>
			<br>

			<label for="Em"> Email :</label>
			<form:input path="email" id="Em" />
			<br>
			<br>

			<label for="Pn"> Phone Number :</label>
			<form:input path="phoneNumber" id="Pn" />
			<br>
			<br>
			<input onclick="showPopupForSave()" type="submit" value="Save" />


		</form:form>
		<br>
		<form action="/product/selectProduct" method="get">

			<input type="submit" value="Next" />

		</form>


	</div>

</body>
</html>