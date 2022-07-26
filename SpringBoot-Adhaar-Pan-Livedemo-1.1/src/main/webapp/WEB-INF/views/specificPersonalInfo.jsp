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
		<h1>Candidate Personal Info</h1>

		<hr />
		
		<h4>

		First Name : ${candidatePersonalApiInfo.firstname}
		<br> <br>
		
		
		User Name : ${candidatePersonalApiInfo.username}
		<br> <br>
		
		Last Name : ${candidatePersonalApiInfo.lastname}
		<br> <br>
		
	   Email Id :<span style="color: blue;">${candidatePersonalApiInfo.emailId}</span> 
		<br> <br>
		
		Country : ${candidatePersonalApiInfo.country}
		<br> <br>
		
		Company : ${candidatePersonalApiInfo.company}
		<br> <br>
		
		Age : ${candidatePersonalApiInfo.age}
		<br> <br>
		
		Gender : ${candidatePersonalApiInfo.gender}
		<br> <br>
		
		Hobbies : <c:forEach var="candidates" items=" ${candidatePersonalApiInfo.hobbies}">
		
		${candidates},
		
		</c:forEach>
		
		
</h4>

	</div>
</body>
</html>