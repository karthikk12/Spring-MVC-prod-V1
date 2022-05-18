<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="Silver">
	<div align="right">
		<a href="welcomePage">Log Out</a>
	</div>
	<div align="center">

		<h1>Electricity Bill Success</h1>
		<h3>Welcome ${electricBillBinder.name}</h3>
		<hr />


		Bill Number : ${electricBillBinder.billNumber} <br> <br>
		Amount :${electricBillBinder.amount} <br> <br>Dollar
		Sign:${electricBillBinder.dollarSign} <br> <br>Date:
		${electricBillBinder.date}

	</div>
</body>
</html>