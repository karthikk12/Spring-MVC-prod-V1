<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.error {
	color: Red;
	position: fixed;
	text-align: left;
}
</style>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="Silver">
	<div align="center">
		<h1>Electric Bill Pay</h1>
		<hr />
		<form:form action="processElectricBill"
			modelAttribute="electricBillBinder">
			
			Owner Name :<form:input path="name" />
			<form:errors path="name" cssClass="error" />
			<br>
			<br>

		Bil Number :<form:input placeholder="xxxx-xx-xxx" path="billNumber" />
			<form:errors path="billNumber" cssClass="error" />

			<br>
			<br>
		Amount :<form:input path="amount" />
			<form:errors path="amount" cssClass="error" />

			<br>
			<br>
		Dollar :<form:input path="dollarSign" />
			<form:errors path="dollarSign" cssClass="error" />

			<br>
			<br>
		Date :<form:input path="date" />
			<form:errors path="date" cssClass="error" />

			<br>
			<br>
			<input type="submit" value="Pay Bill" />
		</form:form>
	</div>
</body>
</html>