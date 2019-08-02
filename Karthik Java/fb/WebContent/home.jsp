<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@ include file="header.jsp" %>

<a href="LogoutController">Logout</a>

<c:if test="${empty sessionScope.username }">

<jsp:forward page="login.jsp"></jsp:forward>
</c:if>
<c:if test="${!empty sessionScope.username }">
<table>
<c:forEach items="${ requestScope.details}" var="customer">

<tr>                                                                                                                                  
<td>${customer.customerId }</td>
<td>${customer.customerName }</td>
<td>${customer.customerContact }</td>
<td>${customer.customerEmail }</td>
<td>${customer.customerAddress }</td>
<td>${customer.gender }</td>
<td>${customer.state }</td>
<td>${customer.city }</td>
<td>${customer.country }</td>
<td>${customer.password}</td>
<td><a href="/fb/ViewController?cid=${customer.customerId}">Update</a>
</td>
<td><a href="/fb/DeleteController?cid=${customer.customerId}">delete</a>
</td>


</tr>

</c:forEach>


</table>
</c:if>


<%@ include file="footer.jsp" %>

</body>
</html>