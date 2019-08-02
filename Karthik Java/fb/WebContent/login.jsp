<%@ page  session="true"
autoFlush="true"
buffer="8kb"
info="login page"
isELIgnored="false"
isErrorPage="false"
isThreadSafe="true"

language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"
errorPage="error.jsp"
%>


<html>
<head>
<script src="/gmail/js/validate.js"></script>
<meta charset="ISO-8859-1">
<title>Login page</title>
<link rel="stylesheet" type="text/css" href="/gmail/css/style.css">
</head>
${requestScope.message }
<%! 
public void print(){
	
	System.out.print("hello how are you");
	
}    %>


<%this.print(); %>
	
<%-- <%  String mesage=  (String) request.getAttribute("message"); %>
<%=mesage %>
 --%>
<body>
<div  class="makewhite" align="center">
<form action="/fb/LoginController" method="post" name="login" onsubmit="return validate();">
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