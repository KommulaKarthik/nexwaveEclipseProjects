<!DOCTYPE html>
<%@page import="com.virtusa.zomato.model.LoginDetail"%>
<html>
<head>

<style type="text/css">

a:link {color: #000000}
   a:visited {color: #006600}
   a:hover {color: #FFCC00}
   a:active {color: #FF00CC}
</style>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<%Object object = session.getAttribute("user");
if(object!=null){
LoginDetail detail=(LoginDetail) object;
out.print(detail.getUsername());
}else{
	
	response.sendRedirect("/gmail/jsp/login.jsp");
	
}





%>




<nav>
<a href="order.html">Order Food</a>
<a href="payment.html">Payment</a>
<a href="searchrest.html">Search restaurant</a>
<a href="searchmenu.html">Search menu</a>
<a href="login.html">Login</a>
<a href="registration.html">Registration</a>
<a href="/gmail/LogoutController">Logout</a>

</nav>




</body>
</html>