<%@ page session="true" 
autoFlush="true"
buffer="8kb"
info="Login Page"
isELIgnored="false"
isErrorPage="false"
isThreadSafe="true"
import="com.virtusa.zomato.model.LoginDetail"
language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    
    errorPage="error.jsp"
%>




<!DOCTYPE html>


<html>
<head>
<script src="/gmail/js/validate.js"></script>
<meta charset="ISO-8859-1">
<title>Login page</title>

<link rel="stylesheet" type="text/css" href="style.css">



</head>
${requestScope.message }

<%! 
public void print(){
	
	System.out.println("hello how are you");
	
	
}%>


<% this.print(); %>

<%-- <%       String message= (String)request.getAttribute("message");    %>
<%=message %> --%>




<body>

<div  class="makewhite" align="center">
<form action="/gmail/LoginController" method="post" name="login" onsubmit="return validate();">
<table border="0">
<tr><td colspan="2" align="center"><h1>Zomato Login</h1> </td></tr>
<tr><td colspan="2" align="center"><hr/></td></tr>
<tr><td>Enter username </td><td><input type="text" id="username" class="makeblack" name="username" placeholder="Enter User name">
 </td></tr>
<tr><td>Enter password</td>  <td>
<input type="password" name="password"  class="makeblack" id="password" placeholder="Enter Password">
</td></tr>
<tr> <td colspan="2" align="center"><input type="submit" name="login" value="Submit">
</td></tr>
</table>

</form>

</div>





</body>
</html>