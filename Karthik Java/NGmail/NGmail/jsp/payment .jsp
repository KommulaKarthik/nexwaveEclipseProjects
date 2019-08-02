<!DOCTYPE html>
<html>
<head><link rel="stylesheet" type="text/css" href="style.css">

<meta charset="ISO-8859-1">
<title>payment</title>
</head>
<body>
<div  style="width:50%;   background-color: red;font-family: cursive;color: white;" align="center">
<table>
<form method="post">
<tr><td>
Enter order id</td><td><input name="orderId"></td></tr>
<tr><td>Enter customer Id</td><td><input name="customerId"></td></tr>
<tr><td>Select payment type</td><td><select name="type">
<option>COD
<option>GPay
<option>Paytm

</select></td></tr>
<tr><td colspan="2" align="center"><input type="submit" name="pay" value="Pay"></td></tr>
</form>
</table>
</div>

</body>
</html>