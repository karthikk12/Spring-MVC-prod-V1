<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="Silver">
	<h1>Electricity Bill Success</h1>
	<hr />

	Bill Number : ${electricBillBinder.billNumber}
	<br>Amount :${electricBillBinder.amount}
	<br>Dollar Sign:${electricBillBinder.dollarSign}
	<br>Date: ${electricBillBinder.date}
</body>
</html>