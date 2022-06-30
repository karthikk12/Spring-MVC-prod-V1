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
			<br> Candidate UserName : ${registerBundle.username} <br> <br>
			Candidate FirstName : ${registerBundle.firstname} <br> <br>
			Candidate LastName : ${registerBundle.lastname} <br> <br>
			Candidate Country : ${registerBundle.country} <br> <br>
			Candidate Company : ${registerBundle.company} <br> <br>
			Candidate Hobbies :

			<c:forEach var="temp" items="${registerBundle.hobbies}">
 
 ${temp},

</c:forEach>
			<br> <br> Candidate Age : ${registerBundle.age} <br> <br>
			Candidate Gender : ${registerBundle.gender}

		</h4>

		<hr />

		<h1>Education Details</h1>
		<h4>


			SSLC School Name : ${educationdetailsBundle.sslcSchool} <span
				style="color: blue;"> &nbsp&nbsp Marks :</span>
			${educationdetailsBundle.sslcMark}<br> <br> HSC School Name
			: ${educationdetailsBundle.hscSchool} <span style="color: blue;">
				&nbsp&nbsp Marks :</span>${educationdetailsBundle.hscMark} <br> <br>

			College Name : ${educationdetailsBundle.collgeName} <span
				style="color: blue;"> &nbsp&nbsp Marks :</span>
			${educationdetailsBundle.collegeMark}<br> <br>




		</h4>
		<hr />
		<h1>Education Details</h1>
		<h4>

			Bank Name : ${bankDetailsBundle.bankname} <br> <br> IFSC
			Code : ${bankDetailsBundle.coder.firstFourAlphabets}
			${bankDetailsBundle.coder.secondFourDigits} <br> <br>
			Account Number : ${bankDetailsBundle.number.firstFourDigit}
			${bankDetailsBundle.number.secondFourDigit}
			${bankDetailsBundle.number.thirdFourDigit}
			${bankDetailsBundle.number.fourthFourDigit} <br> <br>


		</h4>
	</div>
</body>
</html>