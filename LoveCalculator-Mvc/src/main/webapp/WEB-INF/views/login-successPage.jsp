<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<div align="center">
	<h1>User Welcome Page</h1>
	<hr />
	<body bgcolor="Silver">
		<h3>Welcome Again ${userData.userName}.... Below are the things U
			can do here..</h3>
		<hr />
		<div>
			<a href="creditWelcomePage">Credit Card Bill</a> <br> <a
				href="emailSend">Email Send</a>

		</div>
	</body>
</div>
</html>