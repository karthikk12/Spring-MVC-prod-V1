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
	<h1>My Login</h1>

	<form:form action="process-Page" method="POST">
	
	UserName :<input type="text" name="userName" />
		<br />
	Password:	<input type="password" name="password" />
		<input type="submit" name="Submit" />


	</form:form>

</body>
</html>