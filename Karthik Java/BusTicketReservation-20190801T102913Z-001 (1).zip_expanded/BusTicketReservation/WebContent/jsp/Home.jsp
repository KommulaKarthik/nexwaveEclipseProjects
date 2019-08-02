<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../css/Style.css">
<!--<link rel="stylesheet" type="text/css" href="../header.jsp">

  -->
<title>HOME</title>
</head>
<header>
	<table>
		<tr>
			<td><h2>TRAVEL LINE</h2></td>
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

		<table>

			<tr>
				<td colspan="2"><h1>SEARCH SERVICE</h1></td>
			</tr>
			<tr>
				<td colspan="2"><hr></td>
			</tr>
			<form
				action="/BusTicketReservation/SearchController" method="post">
			<tr>
				<td>From:</td>
				<td><select id="source" name="city1" required="required">
						<option name="city1" value="Hyderabad">Hyderabad</option>
						<option name="city1" value="secundrabad">Secundrabad</option>
						<option name="city1" value="khammam">khammam</option>
						<option name="city1" value="kurnool">kurnool</option>
						<option name="city1" value="chennai">chennai</option>
						<option name="city1" value="kolkata">kolkata</option>
						<option name="city1" value="benglore">banglore</option>
						<option name="city1" value="aanavaram">annavaram</option>
				</select></td>
			</tr>
			<tr>
				<td>To:</td>
				<td><select id="destination" name="city" required="required">
						<option name="city" value="Hyderabad">Hyderabad</option>
						<option name="city" value="secundrabad">Secundrabad</option>
						<option name="city" value="khammam">khammam</option>
						<option name="city" value="kurnool">kurnool</option>
						<option name="city" value="chennai">chennai</option>
						<option name="city" value="kolkata">kolkata</option>
						<option name="city" value="benglore">banglore</option>
						<option name="city" value="aanavaram">annavaram</option>

				</select></td>
			</tr>
			<tr>
				<td>No.of passengers</td>
				<td><select name="passengercount"
					required="required">
						<option name="passengercount" value="1">1</option>
						<option name="passengercount" value="2">2</option>

						<option name="passengercount" value="3">3</option>

						<option name="passengercount" value="4">4</option>

						<option name="passengercount" value="5">5</option>

						

				</select></td>
			</tr>

			<tr>
				<td>Date of journey</td>
				<td><input type="date" id="doj" name="doj" required="required"></td>
			</tr>
			<!-- <tr>
				<td>Departure Time</td>
				<td><input type="time" id="Departurejourney"
					name="departureTime"></td>
			</tr> -->
			<tr>
				<td colspan="2" align="center"><input type="submit"
						name="SearchContinue" value="submit"></td>
			</tr>
			</form>
			<tr>
				<td colspan="2" align="center"><form
				action="/BusTicketReservation/SelectServiceController" method="get"><input type="submit"
						name="SearchContinue" value="continue"></form></td>
			</tr>
		</table>
	</div>
</body>
</html>