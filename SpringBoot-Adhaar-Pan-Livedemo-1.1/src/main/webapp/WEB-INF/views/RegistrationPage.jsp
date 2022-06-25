<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.Registererror {
	color: Red;
	position: fixed;
	text-align: left;
	margin-left: 30px;
}
</style>
</head>

<div align="center">
	<body bgcolor="Silver">

		<h1>Candidate Registration Page</h1>
		<hr />
		<br>
		<form:form action="processRegister" modelAttribute="registerBundle">

			<label for="un">UserName :</label>
			<form:input path="userName" id="un" />
			<form:errors path="userName" cssClass="Registererror"/>
			<br>
			<br>

			<label for="fn">FirstName :</label>
			<form:input path="firstName" id="fn" />
			<br>
			<br>

			<label for="ln">LastName :</label>
			<form:input path="lastName" id="ln" />
			<br>
			<br>

			<label for="ct">Country :</label>
			<form:select path="country" id="ct">

				<form:option value="India" label="India" />
				<form:option value="Sri Lanka" label="Sri Lanka" />
				<form:option value="USA" label="USA" />
				<form:option value="London" label="London" />


			</form:select>

			<br>
			<br>

			<label for="cpn">Company Name :</label>
			<form:select path="company" id="cpn">

				<form:option value="Cognizant" label="Cognizant" />
				<form:option value="TCS" label="Tata Consultancy Service" />
				<form:option value="Wipro" label="Wipro" />
				<form:option value="Infosys" label="Infosys" />


			</form:select>
			<br>
			<br>

			<label> Hobbies :</label>
			Cricket : <form:checkbox path="hobbies" value="Cricket" />
			Video Game : <form:checkbox path="hobbies" value="game" />
			Movie : <form:checkbox path="hobbies" value="movie" />
			<br>
			<br>

			<label for="ag">Age :</label>
			<form:input path="age" id="ag" />
			<br>
			<br>

			<label for="gd">Gender :</label>
			Male :<form:radiobutton path="gender" value="Male" id="gd" />
			Female :<form:radiobutton path="gender" value="Female" id="gd" />
			<br>
			<br>
			<input type="submit" value="Register" />

		</form:form>
	</body>
</div>
</html>