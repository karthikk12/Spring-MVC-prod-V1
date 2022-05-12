<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.newUserError {
	color: Red;
	position: fixed;
	text-align: left;
	margin-left: 30px;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="Silver">
	<h1 align="center">New User Registration Page</h1>
	<hr />
	<br />
	<div align="center">
		<form:form action="newSubmission" modelAttribute="newUserEntry">

			<label for="n"> Name :</label>
			<form:input path="name" id="n" />
			<form:errors path="name" cssClass="newUserError" />
			<br>
			<br>

			<label for="un">User Name :</label>
			<form:input path="userName" id="un" />
			<br>
			<br>

			<label for="pwd">Password :</label>
			<form:password path="password" id="pwd" />
			<br>
			<br>

			<label for="ct">Country :</label>
			<form:select path="country" id="ct">

				<form:option value="Ind" label="India" />
				<form:option value="SL" label="Sri Lanka" />
				<form:option value="US" label="USA" />
				<form:option value="UK" label="London" />


			</form:select>
			<br>
			<br>
			<label> Hobbies :</label>
			Cricket : <form:checkbox path="hobbies" value="Cricket" />
			Video Game : <form:checkbox path="hobbies" value="game" />
			Movie : <form:checkbox path="hobbies" value="movie" />
			<br>
			<br>

			<label for="gd">Gender :</label>
			Male :<form:radiobutton path="gender" value="Male" />
			Female :<form:radiobutton path="gender" value="Female" />
			<br>
			<br>

			<label for="ag">Age :</label>
			<form:input path="age" id="ag" />
			<br>
			<br>
			<hr>
			<h2>Communication :</h2>
			<label for="em">Email :</label>
			<form:input path="communicationDto.email" id="em" />

			<label for="ph">Phone :</label>
			<form:input path="communicationDto.phone" id="ph" />

			<br>
			<br>
			<input type="submit" value="Register">
		</form:form>

	</div>
</body>
</html>