<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>




<html>
<head>
<link rel="stylesheet" type="text/css" href="style.css">

<meta charset="ISO-8859-1">
<title>registration page</title>
</head>
<body>
<%@ include file="header.jsp" %>

<%-- <jsp:include page="header.jsp"></jsp:include> --%>


<div  style="width:50%;   background-color: red;font-family: cursive;color: white;" align="center">
<form action="/fb/UpdateController" method="post">
<table border="0">
<tr><td colspan="2" align="center"><h1>Zomato Registration</h1> </td></tr>
<tr><td colspan="2" align="center"><hr/></td></tr>

<!--  db element -->
<tr><td>Enter  Name </td><td><input type="text" id="customerName" value="${customer.customerName }" name="customerName" placeholder="Enter User Name" 
pattern="[a-z]{5,10}" required="required">
 </td></tr>
 <tr><td><input type="text" name="cid" value="${customer.customerId }" readonly="readonly"></td></tr>
<tr><td>Enter Email Id </td><td><input type="email" id="customerEmail" value="${customer.customerEmail }" name="customerEmail" placeholder="Enter User email" required="required">
 </td></tr>
<tr><td>Enter password</td>  <td>
<input type="password" pattern="[a-z]{4,6}[0-9]{4,6}" name="password" id="password" value="${customer.password }" placeholder="Enter Password" required="required">
</td></tr>
<tr><td>Enter address</td>  <td>
<input type="text" name="customerAddress" id="customerAddress" value="${customer.customerAddress }" required="required">
</td></tr>

<tr><td>Enter phone</td>  <td>
<input type="number" name="customerContact" id="customerContact" value="${customer.customerContact }" placeholder="Enter phone"

pattern="[0-9]{10,12}"
 required="required">

</td></tr>




<tr>
<td>Select gender</td>
<td>Male<input type="radio" name="gender" value="m" >
Female<input type="radio" name="gender" value="f" >
Others<input type="radio" name="gender" value="o" >
</td>
</tr>
<tr>
<td>
Select the country
</td>
<td>
<select name="country" id="country">
<option>India
<option>US
<option>UK
<option>AUS
<option>CHINA


</select>


</td>

</tr>
<tr>
<td>
Select the state
</td>
<td>
<select name="state" id="state">
<option>AP
<option>TS
<option>MAH
<option>UP
<option>UK
</select>
</td>

</tr>

<tr>
<td>
Select the city
</td>
<td>
<select name="city" id="city">
<option>HYD
<option>PUNE
<option>BANGLORE
<option>CHENNAI
<option>MUMBAI
</select>
</td>

</tr>

<!-- <tr><td>Select file</td><td > <input type="file" name="filename" id="filename" required="required"></td></tr>
 -->


<tr> <td colspan="2" align="center"><input type="submit" name="register" value="Update">
</td></tr>
</table>

</form>

</div>

<%--dynamic include --%>
<%-- 
<jsp:include page="header.jsp"></jsp:include>
--%>
<%--static include --%>

<%@ include file="footer.jsp" %>


</body>
</html>