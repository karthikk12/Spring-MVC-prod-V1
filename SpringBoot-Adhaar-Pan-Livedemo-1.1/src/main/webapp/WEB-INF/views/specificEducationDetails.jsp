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

		<a href="/display/allCandidateDatas"> Back</a>
	</div>
	
	<div align="center">
		<h1>Candidate Education Details</h1>

		<hr />

		SSLC School : ${specificCandidateEducation.sslcSchool} &nbsp&nbsp <span
			style="color: red;">SSLC Mark : </span>
		${specificCandidateEducation.sslcMark} <br> <br>
		
		HSC School : ${specificCandidateEducation.hscSchool} &nbsp&nbsp <span
			style="color: red;">HSC Mark : </span>
		${specificCandidateEducation.hscMark} <br> <br>
		
		College Name : ${specificCandidateEducation.collgeName} &nbsp&nbsp <span
			style="color: red;">College Mark : </span>
		${specificCandidateEducation.collegeMark} <br> <br>



	</div>
</body>
</html>