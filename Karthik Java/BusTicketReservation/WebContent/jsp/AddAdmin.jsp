<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="./css/Style.css">
<title>ADD ADMIN</title>
</head>
<header>
	<table>
		<tr>
			<td><h2>TRAVEL LINE </h2></td>
			<td><a href="Home.html">&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
			&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;HOME</a></td>
			<td><a href="Aboutus.html">&emsp;ABOUT US</a></td>
            <td><a href="ViewFeedBack.html">&emsp;VIEW FEEDBACK</a></td>
            <td><a href="ViewScheduleController">&emsp;VIEW SCHEDULES</a></td>
			<td><a href="LogoutController">&emsp;LOGOUT</a></td>
			<td>Welcome ${sessionScope.adminName}</td>
		</tr>
	</table>
</header>
<body>
<div id="fun1">
<div align="center">
	
		<form action="AddAdminController" method="post">
		
			<table>
			
				<tr>
					<td colspan="2"><h1>ADD ADMIN</h1></td>
				</tr>
				<tr>
					<td colspan="2"><hr></td>
				</tr>
				<tr>
					<td>Administrator Username (Unique)</td>
					<td><input type="text" name="AdministratorName"
						placeholder="enter name" required="required"></td>
				</tr>
				<tr>
					<td>Administrator Password</td>
					<td><input type="password" name="AdminPassword" id="password"
						placeholder="enter password"></td>
				</tr>
				<tr>
				<td>Confirm Password</td>
				 <td><input type="password" name="ConfirmPassword" placeholder="Confirm Password" >
				</td>
				</tr>
				</table>
				<table>
				<tr>
				
					<td colspan="2" align="center"><button type="submit"
						name="PaymentSubmit" value="submit"  class="pure-button pure-button-primary">SUBMIT</button></td>
				
							
					<td colspan="2" align="center"><button type="cancel"
						name="loginn" value="CANCEL" onclick="">CANCEL</button></td>
				</tr>
			</table>
		</form>
		<div>${requestScope.message}</div>
	</div>
	

	</div>
</body>
</html>