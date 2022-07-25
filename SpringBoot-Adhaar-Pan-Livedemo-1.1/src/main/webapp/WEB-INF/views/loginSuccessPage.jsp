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
		<h1>Hi ${candidateName} Login Success !!</h1>

		<form:form action="/display/processCandidateDetails">

			<input type="submit" value="Show Candidate Details" />
		</form:form>
		<br> <br>


		<form:form action="/display/allCandidateDatas">

			<input type="submit" value="Show All Candidates" />
		</form:form>

	</div>
</body>
</html>