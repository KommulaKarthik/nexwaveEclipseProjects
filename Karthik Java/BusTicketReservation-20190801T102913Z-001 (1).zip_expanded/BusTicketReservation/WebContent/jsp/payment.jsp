<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../css/Style.css">
<title>PAYMENT PAGE</title>
</head>
<header>
	<table>
		<tr>
			<td><h2>TRAVEL LINE </h2></td>
			<td><a href="Home.html">&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
			&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
			&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;HOME</a></td>

			<td><a href="FeedBack.html">&emsp;FEEDBACK</a></td>

			<td><a href="Aboutus.html">&emsp;ABOUT US</a></td>

			<td><a href="Login.html">&emsp;LOGIN</a></td>

			<td><a href="Retrieval.html">&emsp;RETRIEVAL</a></td>
		</tr>
	</table>
</header>
<body>
<div align="center">
	
		<form action="/BusTicketReservation/PaymentController" method="post">
		
			<table>
			
				<tr>
					<td colspan="2"><h1>PAYMENT FORM</h1></td>
				</tr>
				<tr>
					<td colspan="2"><hr></td>
				</tr>
				<tr>
					<td>Card Holder Name</td>
					<td><input type="text" name="CardHolderName"
						placeholder="enter name" required="required"></td>
				</tr>
				<tr>
					<td>Card Number</td>
					<td><input type="number" name="CardNo"
						placeholder="enter card number"></td>
				</tr>
				<tr><td>CVV</td>
				<td><input type="number" name="cvv" placeholder="enter cvv" pattern="[0-3]"></td>
				</tr>

				<tr><td>Expiry Date</td> 
				<td><input type="date" data-date-inline-picker="true" name="date" required></td></tr>
				
				<tr><td>Total Fare</td></tr>
				</table>
				<table>
				<tr>
				
 
				<td colspan="2" align="center"><button type="cancel"
						name="PaymentSubmit" onclick="window.location.href ='Retrieval.html';">submit</button></td></form>
					
	<td colspan="2" align="center">
<button type="cancel" name="PaymentCancel" onclick="window.location.href ='Home.html';">cancel</button></td>
						
						
				</tr>
			</table>
	</div>
</body>
</html>
