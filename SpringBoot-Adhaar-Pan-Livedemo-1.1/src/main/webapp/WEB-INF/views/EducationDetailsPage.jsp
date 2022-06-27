<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<h1>Education Details</h1>
		<hr />

		<form:form action="educationProcessPage" modelAttribute="educationdetailsBundle">
		<label for="ssl">SSLC School :</label>
		<form:input path="sslcSchool" id="ssl"/> <form:input path="sslcMark" id="sslMk"/>
		<br>
		<br>
		
		<label for="hscSl">HSC School :</label>
		<form:input path="hscSchool" id="hscSl"/> Marks : <form:input path="HscMark" id="hscMk"/>
		<br>
		<br>
		
		<label for="clg">College :</label>
		<form:input path="collgeName" id="clg"/> <form:input path="collegeMark" id="clgMk"/>
		<br>
		<br>
		
		<input type="submit" value="Submit" />
		
		
		
		</form:form>
	</div>
</body>
</html>