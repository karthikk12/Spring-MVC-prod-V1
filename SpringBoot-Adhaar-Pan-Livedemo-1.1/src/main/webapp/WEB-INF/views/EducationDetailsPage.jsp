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
		<h1>Education Details</h1>
		<hr />

		<form:form action="/Edu/educationSaver" modelAttribute="educationdetailsBundle">
		<label for="ssl">SSLC School :</label>
		<form:input path="sslcSchool" id="ssl"/> Marks :  <form:input path="sslcMark"/>
		<br>
		<br>
		
		<label for="hscSl">HSC School :</label>
		<form:input path="hscSchool" id="hscSl"/> Marks : <form:input path="hscMark" />
		<br>
		<br>
		
		<label for="clg">College :</label>
		<form:input path="collgeName" id="clg"/> Marks :  <form:input path="collegeMark"/>
		<br>
		<br>
		
		<input type="submit" value="Save" />
		
		</form:form>
		<br>
		
		<form:form action="/bankDetails/bankRegister" method="get">
		<input type="submit" value="Next"/>
		
		</form:form>
	</div>
</body>
</html>