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
			Candidate UserName : ${registerBundle.username} <br> <br>
			Candidate FirstName : ${registerBundle.firstname} <br> <br>
			Candidate LastName : ${registerBundle.lastname} <br> <br>
		    Candidate Email : ${registerBundle.emailId} <br> <br>	
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
		<h1>Bank Details</h1>
		<h4>

			Bank Name : ${bankDetailsBundle.bankname} <br> <br> IFSC
			Code : ${bankDetailsBundle.coder.firstFourAlphabets}
			${bankDetailsBundle.coder.secondFourDigits} <br> <br>
			Account Number : ${bankDetailsBundle.number.firstFourDigit}
			${bankDetailsBundle.number.secondFourDigit}
			${bankDetailsBundle.number.thirdFourDigit}
			${bankDetailsBundle.number.fourthFourDigit} <br> <br>


		</h4>
		
		<hr />
		<h1>Emergency Contact Details</h1>
		<h4>

			RelationShip : ${contactBundle.relationShip} <br> <br> Phone
			Number : ${contactBundle.relationShip}
			 <br> <br>
			Parent Number : ${contactBundle.parentNumber}
			 <br> <br>
			Secondary Email : ${contactBundle.secondaryEmail}


		</h4>
		
		<hr />
		<h1>Proof Details</h1>
		<h4>

			Proof Name : ${proofBundle.nameAsProof} <br> <br>
			Aadhaar Number : ${proofBundle.aadhaarNo.firstFourDigits}
			${proofBundle.aadhaarNo.secondFourDigits}
			${proofBundle.aadhaarNo.thirdFourDigits}
			 <br> <br>
			Pan Card Number Email : ${proofBundle.pancardNo.firstAlphabeticChars}
             ${proofBundle.pancardNo.nextHalfChars}

		</h4>
	</div>
</body>
</html>