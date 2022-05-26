<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.errors {
	position: fixed;
	color: red;
	text-align: left;
	margin-left: 30px;
}
</style>
</head>
<div align="left">
	<h3>Hi ${userData.userName}</h3>

</div>
<div align="center">
	<h1>Email Send</h1>
	<hr />
	<body bgcolor="Silver">
		<form:form action="processEmail" modelAttribute="emailBundle">

			<label for="em"> Email :</label>
			<form:input path="email" id="em" />
			<form:errors path="email" cssClass="errors" />
			<br />
			<br />

			<input type="submit" value="Send" />
		</form:form>

	</body>

</div>

</html>