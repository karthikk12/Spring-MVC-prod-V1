<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<script type="text/javascript">
	function showPopupMsg() {

		alert("Data saved SUccessfully..");
	}
</script>
<head>
<meta charset="ISO-8859-1">
<title>Employment</title>
</head>
<body bgcolor="Silver">
	<div align="center">
		<h1>Employment Details</h1>
		<hr>
		<form:form action="/emp/saveEmploymentData"
			modelAttribute="employmentBundle">

			<label for="cn"> Company Name :</label>
			<form:input path="companyName" id="cn" />
			<br>
			<br>

			<label for="dt"> Designation :</label>
			<form:input path="designation" id="dt" />
			<br>
			<br>


			<label for="sl"> Salary :</label>

			<form:input path="salary" id="sl" />

			<br>
			<br>


			<label for="cl"> Company Location :</label>
			<form:input path="companyLocation" id="cl" />
			<br>
			<br>


			<label for="jl"> Job Level</label>
			<form:select path="jobPosition" id="jl">
				<form:option value="JL1" label="JL1" />
				<form:option value="Jl2" label="JL2" />
				<form:option value="Jl3" label="JL3" />
				<form:option value="Jl4" label="JL4" />
			</form:select>


			<br>
			<br>


			<input onclick="showPopupMsg()" type="submit" value="Save" />


		</form:form>
		<br>

		<form action="/pay/paymentForm">

			<input type="submit" value="Submit">
		</form>


	</div>
</body>
</html>