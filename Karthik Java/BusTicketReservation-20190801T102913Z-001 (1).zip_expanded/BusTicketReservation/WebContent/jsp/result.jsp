<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../css/Style.css">
<title>Insert title here</title>
</head>
<body>

<table border="1">
<tr>
<th>Journey Date</th>
<th>Source</th>
<th>Destination</th>
<th>Seat Number</th>
<th>Passenger Name</th>
<th>Bus Name</th>
<th>Bus Id</th>
</tr>
<c:forEach items="${requestScope.booklist}" var="book">
<tr>
<td>${book.bookingDetail.journeyDate}</td>
<td>${book.bookingDetail.source}</td>
<td>${book.bookingDetail.destination}</td>
<td>${book. bookingMapDetail.seatNumber}</td>
<td>${book.bookingMapDetail.travellerName }</td>
<td>${book.bookingDetail.selectedBusName }</td>
<td>${book.bookingDetail.selectedBusId}</td>
</tr>


</c:forEach>
</table>

</body>
</html>