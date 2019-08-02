<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="./css/Style.css">

<title>FEEDBACK</title>
</head>
<header>
	<table>
		<tr>
			<td><h2>TRAVEL LINE </h2></td>
			<td><a href="../jsp/Home.jsp">&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
			&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
			&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;HOME</a></td>

			<td><a href="../jsp/FeedBack.jsp">&emsp;FEEDBACK</a></td>

			<td><a href="../jsp/About.jsp">&emsp;ABOUT US</a></td>

			<td><a href="../jsp/login.jsp">&emsp;LOGIN</a></td>

			<td><a href="../jsp/retrieval.jsp">&emsp;RETRIEVAL</a></td>
		</tr>
	</table>
</header>

<body>
<div align="center">
	
		<form action="/BusTicketReservation/" method="post">
		
			<table>
			
				<tr>
					<td colspan="2"><h1>PLEASE GIVE YOUR FEEDBACK</h1></td>
				</tr>
				<tr>
					<td colspan="2"><hr></td>
				</tr>
				<tr>
					<td>Enter Name</td>
					<td><input type="text" name="feedbackName"
						placeholder="enter username" required="required"></td>
				</tr>
				<tr>
					<td>Enter password</td>
					<td><input type="email" name="feedbackmail"
						placeholder="enter password"></td>
				</tr>
				<tr>
				<td>Enter your Comments</td>
				<td><textarea rows="5" cols="10"name="feedbackComments"placeholder="comments..."></textarea>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						name="login" value="submit"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>