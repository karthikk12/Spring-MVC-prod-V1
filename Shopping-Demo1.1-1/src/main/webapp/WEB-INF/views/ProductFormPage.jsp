<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<script type="text/javascript">
	function showPopupMsg() {

		alert("Data Saved Successfully...")
	}
</script>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<div align="center">
	<body bgcolor="Silver">
		<h1>Product Page</h1>
		<hr>

		<form:form action="/product/saveProcessProduct"
			modelAttribute="productBundle">

			<label for="laps"> Laptops : </label>
			<form:select path="laptops" id="laps">

				<form:option value="Hp" label="HP Laptop" />
				<form:option value="Dell" label="Dell" />
				<form:option value="Samsung" label="samsung" />
				<form:option value="sony" label="Sony" />


			</form:select>

			<br>
			<br>

			<label for="mobile"> Mobiles : </label>
			<form:select path="mobiles" id="mobile">

				<form:option value="Oneplus" label="Oneplus" />
				<form:option value="MI" label="MI" />
				<form:option value="Nokia" label="Nokia" />
				<form:option value="iPhone" label="iPhone" />


			</form:select>
			<br>
			<br>
			<input onclick="showPopupMsg()" type="submit" value="Save" />



		</form:form>
		<br>


		<form action="/emp/employmentForm">

			<input type="submit" value="Next" />
		</form>

	</body>
</div>
</html>