<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../css/Style.css">

<title>Retrieval</title>
</head>
<header>
	<table>
		<tr>
			<td><h2>TRAVEL LINE</h2></td>
			<td><a href="Home.html">&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
					&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
					&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;HOME</a></td>

			<td><a href="./jsp/FeedBack.jsp">&emsp;FEEDBACK</a></td>

			<td><a href="./jsp/About.jsp">&emsp;ABOUT US</a></td>

			<td><a href="./jsp/login.jsp">&emsp;LOGIN</a></td>

			<td><a href="./jsp/retrieval.jsp">&emsp;RETRIEVAL</a></td>
		</tr>
	</table>
</header>

<body>
	<div align="center">

		<form action="/BusTicketReservation/RetrievalController" method="post">

			<table>

				<tr>
					<td colspan="2"><h1>RETRIEVAL FORM</h1></td>
				</tr>
				<tr>
					<td colspan="2"><hr></td>
				</tr>
				<tr>
					<td>Enter the booking id:</td>
					<td><input type = "number" name="bookingId" ></td>
				</tr>
			</table>
			<table>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						name="RetrievalSubmit" value="SUBMIT"></td>
					<td colspan="2" align="center"><button type="cancel"
						name="RetrievalCancel" onclick="window.location.href ='./jsp/Home.jsp';">CANCEL</button></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>