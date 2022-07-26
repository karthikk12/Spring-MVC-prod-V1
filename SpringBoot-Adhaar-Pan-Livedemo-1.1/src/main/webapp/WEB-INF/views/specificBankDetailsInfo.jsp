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
	<div align="right">

		<a href="/display/allCandidateDatas"> Back</a>
	</div>
	
	<div align="center">
		<h1>Candidate Bank Details Info</h1>

		<hr />
		
		<h4>

		Bank Name : ${specificBankApiInfo.bankname}
		<br> <br>
		
		
		IFSC CODE : ${specificBankApiInfo.coder.firstFourAlphabets} 
		${specificBankApiInfo.coder.secondFourDigits}
		<br> <br>
		
		
	   Account Number :${specificBankApiInfo.number.firstFourDigit}
	   ${specificBankApiInfo.number.secondFourDigit}
	   ${specificBankApiInfo.number.thirdFourDigit}
	   ${specificBankApiInfo.number.fourthFourDigit}
		<br> <br>
		
		
	
		
</h4>

	</div>
</body>
</html>