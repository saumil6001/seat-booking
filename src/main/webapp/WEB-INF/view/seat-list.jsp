<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Seat List</title>
</head>
<body>

	<table>


		<tr>
			<th>
				<h2>Seat</h2>
			</th>
			<th>
				<h2>Status</h2>
			</th>

		</tr>



		<c:forEach var="seat" items="${seat}">


			<tr>
				<td><c:set var="seatbook" value="${seat.bookingStatus}" /> <c:choose>

						<c:when test="${seatbook==true}">
							<button name="seatnumber">${seat.seat}</button>


						</c:when>
						<c:otherwise>
							<form action="book" method="get">
								<button name="seatnumber" type="submit" value="${seat.id}">${seat.seat}</button>
							</form>

						</c:otherwise>
					</c:choose></td>

				<td><c:set var="seatbook" value="${seat.bookingStatus}" /> <c:choose>
						<c:when test="${seatbook==true}">
        				NOT AVAILABLE
        				
						</c:when>
						<c:otherwise>
        				BOOK NOW 	
						</c:otherwise>
					</c:choose></td>
			</tr>

		</c:forEach>

	</table>


</body>
</html>