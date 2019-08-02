<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../css/Style.css">
<title>Modify service</title>
</head>
<header>
	<table>
		<tr>
			<td><h2>TRAVEL LINE </h2></td>
			<td><a href="Home.html">&emsp;HOME</a></td>

			<td><a href="login.html">&emsp;LOGIN</a></td>

			<td><a href="AddService.html">&emsp;ADD SERVICE</a></td>

			<td><a href="ModifyService.html">&emsp;MODIFY SERVCIE</a></td>
			<td><a href="lOGOUT.html">&emsp;LOGOUT</a></td>
			

			
		</tr>
	</table>
</header>
<body>
<div align="center">
	
		<form action="/BusTicketReservation/ModifyServiceController" method="post">
		
			<table>
			
				<tr>
					<td colspan="2"><h1>MODIFY SERVICE</h1></td>
				</tr>
				<tr>
					<td colspan="2"><hr></td>
				</tr>
				<tr>
				<td>ServiceId</td>
				 <td><input type="number" name="serviceId" required >
				</td>
				</tr>
				<tr>
					<td>serviceName</td>
					<td><input type="text" name="serviceName"
						placeholder="enter source" required></td>
				</tr>
				<tr>
					<td>serviceFrom</td>
					<td><input type="text" name="serviceFrom"
						placeholder="enter source" required ></td>
				</tr>
				<tr>
					<td>serviceTo</td>
					<td><input type="text" name="serviceTo"
						placeholder="enter destination" required ></td>
				</tr>
				
				<tr>
				<td>serviceFare</td>
				 <td><input type="number" name="serviceFare"  required>
				</td>
				</tr>
				
				</table>
				<table>
				<tr>
				
					<td colspan="2" align="center"><button type="submit"
						name="AddServiceSubmit" value="submit">SUBMIT</button></td>
				
				
					
				
				
					<td colspan="2" align="center"><button type="back"
						name="AddServiceCancel" value="back" onclick="home.html">back</button></td>
				</tr>
			</table>
		</form>
	</div>

</body>
</html>