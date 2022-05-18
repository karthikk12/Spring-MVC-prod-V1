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
		<h1>Electric Bill Pay</h1>
		<hr />
		<form:form action="processElectricBill"
			modelAttribute="electricBillBinder">
			
			Owner Name :<form:input path="name" />
			<br>
			<br>

		Bil Number :<form:input placeholder="xxxx-xx-xxx" path="billNumber" />
			<br>
			<br>
		Amount :<form:input path="amount" />
			<br>
			<br>
		Dollar :<form:input path="dollarSign" />
			<br>
			<br>
		Date :<form:input path="date" />
			<br>
			<br>
			<input type="submit" value="Pay Bill" />
		</form:form>
	</div>
</body>
</html>