<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Schedule</title>
</head>

<body>
<%-- ${requestScope.schedulelist }
 --%>
<table border="1">
<tr>
<th>Service Id</th><th>From</th><th>To</th><th>Fare</th></tr>

<c:forEach items="${requestScope.schedulelist}" var="schedule">
<tr>
<td>${schedule.serviceId}</td>
<td>${schedule.serviceFrom}</td>
 <td>${schedule.serviceTo}</td>
<td>${schedule.serviceFare}</td>

</tr>
</c:forEach>
</table>

</body>
</html>


