<!DOCTYPE html>
<html>
<head><link rel="stylesheet" type="text/css" href="style.css">

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<nav>
<a href="searchrest.html">Search restaurant</a>
<a href="searchmenu.html">Search menu</a>
<a href="login.html">Login</a>
<a href="registration.html">Registration</a>

</nav>

<div  style="width:50%;   background-color: red;font-family: cursive;color: white;" align="center">
<form action="" method="post">
<table border="0">
<tr><td colspan="2" align="center"><h1>Zomato Order</h1> </td></tr>
<tr><td colspan="2" align="center"><hr/></td></tr>

<tr>
<td>
Select the offer</td>
<td>
<select name="offerId">
<option value="2001">50%
<option value="2002">40%
<option value="2004">30%
<option value="2003">40%
<option value="2003">50%

</td>

</tr>
<tr>
<td>
Slect the menu item
</td>
<td>
<select name="menuId">
<option value="8001">m biryani
<option value="8002">c biryani
<option value="8004">v biryani
<option value="8003">f rest

</select>
</td>

</tr>

<tr>
<td>
select the restaurant
</td>
<td>
<select name="restaurantId">
<option value="4001">mohan rest
<option value="4002">johan rest
<option value="4004">yohan rest
<option value="4003">pohan rest
<option value="4005">uohan rest

</select>
</td>

</tr>

<tr><td>Enter the quantity</td>
<td><input type="number" name="orderQuantity">
</td>
</tr>



<tr> <td colspan="2" align="center"><input type="submit" name="order" value="Order">
</td></tr>
</table>

</form>

</div>



</body>







</body>
</html>