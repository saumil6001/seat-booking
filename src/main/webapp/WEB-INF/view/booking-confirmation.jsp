<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BOOKING</title>
</head>
<body>


	Seat Is Booked
	<br> 
	Please Pay
	<br>

	<form action="canclebook" method="get">
		<button name="seatnumber" type="submit" value="${param.seatnumber}">Back</button>
	</form>

	
	<form action="list" method="get">
		<button type="submit">Finish</button>
	</form>
	
	



</body>
</html>