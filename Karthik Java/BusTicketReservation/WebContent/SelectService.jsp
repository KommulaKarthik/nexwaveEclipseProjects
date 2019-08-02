<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SelectService</title>
<link rel="stylesheet" type="text/css" href="./css/Style.css">
<!-- <link rel="stylesheet" href="header.jsp"> -->
<%-- <%@include file="header.jsp" %>
 --%>
</head>
<body>
	<center><h1><b>SELECT SERVICE</b></h1></center>
	<table cellpadding="5" cellspacing="2" border="1"
		style="margin-left: auto; margin-right: auto; align: center;">
		<tr>
			<th>Bus Id</th>
			<th>Bus Name</th>
			<th>Bus Price</th>
			<th>Options</th>
			<th>Date</th>
		</tr>
		<c:forEach items="${requestScope.ServiceList}" var="customer">
			<tr>
				<td>${customer.busId}</td>
				<td>${customer.serviceName}</td>
				<td>${customer.serviceFare}</td>
				<td><form action="/BusTicketReservation/BookedDetailsController" method="post"><button type="submit" >select</button></form></td>
				<td><c:set var="now" value="<%=new java.util.Date()%>" /> <fmt:formatDate
						type="date" value="${now}"  /></td>

			</tr>
		</c:forEach>
		<tr><td><form action="SeatSelection.jsp"><button type="submit">continue</button></form>
	</table>

</body>
</html>