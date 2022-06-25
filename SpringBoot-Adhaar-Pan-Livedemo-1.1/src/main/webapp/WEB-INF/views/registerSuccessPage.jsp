<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="Silver">
	<div align="center">
		<h1>Candidate Details</h1>
		<hr />
<h4>
		<br> <br> Candidate UserName : ${registerBundle.userName} <br>
		<br> Candidate FirstName : ${registerBundle.firstName} <br>
		<br> Candidate LastName : ${registerBundle.lastName} <br> <br>
		Candidate Country : ${registerBundle.country} <br> <br>
		Candidate Company : ${registerBundle.company} <br> <br>
		Candidate Hobbies :
		
		<c:forEach var="temp" items="${registerBundle.hobbies}">
 
 ${temp},

</c:forEach>
		<br> <br> Candidate Age : ${registerBundle.age} <br> <br>
		Candidate Gender : ${registerBundle.gender}

</h4>

	</div>
</body>
</html>