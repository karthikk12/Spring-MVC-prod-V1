<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="Silver">

	<div align="center">
		
		<h1> Candidate Details </h1>
		
		<hr/>
		
		<h4>

		Candidate Id : ${candidatePersonalInfo.candid}
		<br>
		<br>
		FirstName  :${candidatePersonalInfo.firstname}
		<br>
		<br>
		User Name :${candidatePersonalInfo.username}
		<br>
		<br>
		Last Name :${candidatePersonalInfo.lastname}
		<br>
		<br>
		Email Id :${candidatePersonalInfo.emailId}
		<br>
		<br>
		Password :${candidatePersonalInfo.password}
		<br>
		<br>
		Country :${candidatePersonalInfo.country}
		<br>
		<br>
		Company :${candidatePersonalInfo.company}
		<br>
		<br>
		Age :${candidatePersonalInfo.age}
		<br>
		<br>
		Gender :${candidatePersonalInfo.gender}
		<br>
		<br>
		Hobbies :${candidatePersonalInfo.hobbies}
		<br>
		<br>
		
		</h4>
	</div>


</body>
</html>