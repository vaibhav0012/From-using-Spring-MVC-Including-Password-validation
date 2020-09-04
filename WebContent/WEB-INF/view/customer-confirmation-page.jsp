<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Customer Confirmation success</title>
</head>
<body>The customer is confirmed: ${customer.firstName}
	${customer.lastName}
	<br>
	<br>
	Customer's Free passes: ${customer.freePasses}
	<br>
	<br>
	Postal Code: ${customer.postalCode }
	<br>
	<br>
	Course Code: ${customer.courseCode }
	<br>
	<br>
	Password: ${customer.password }
</body>
</html>