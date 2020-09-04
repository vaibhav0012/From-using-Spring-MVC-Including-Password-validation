<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head lang="en">
<meta charset="UTF-8">
<title>Customer Registration Form</title>
<style>
.error {
	color: red
}
</style>
</head>
<body>
<header>
<h1> Welcome to customer registration form</h1>
</header>
	<section>
		<i>Fill the form. (*) represents mandatory field</i> <br> <br>
		<form:form action="processForm" modelAttribute="customer">
First Name: <form:input path="firstName" />
			<br>
			<br>
Last Name(*): <form:input path="lastName" />
			<form:errors path="lastName" cssClass="error" />
			<br>
			<br>
Free Pass:<form:input path="freePasses" />
			<form:errors path="freePasses" cssClass="error" />
			<br>
			<br>
Postal Code:<form:input path="postalCode" />
			<form:errors path="postalCode" cssClass="error" />
			<br>
			<br>
Course Code:<form:input path="courseCode" />
			<form:errors path="courseCode" cssClass="error" />
			<br>
			<br>
Password:<form:input path="password" />
			<form:errors path="password" cssClass="error" />
			<br>
			<br>
			<input type="submit" value="Submit" />
		</form:form>
	</section>
<footer>
<h2>Thank you for passing by!</h2></footer>
</body>
</html>