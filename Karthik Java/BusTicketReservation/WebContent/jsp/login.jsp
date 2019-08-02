<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="./css/Style.css">

<title>Login Page</title>
</head>

<header>
	<table>
		<tr>
			<td><h2>TRAVEL LINE </h2></td>
			<div class="index">
			<td><a href="Home.html">&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
					&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
					&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;HOME</a></td>

			<td><a href="FeedBack.html">&emsp;FEEDBACK</a></td>

			<td><a href="Aboutus.html">&emsp;ABOUT US</a></td>

			<td><a href="Retrieval.html">&emsp;RETRIEVAL</a></td>
			</div>
		</tr>
	</table>
</header>
<body>
	<div align="center">
	
		<form action="LoginController" method="post">
		
			<table>
			
				<tr>
					<td colspan="2"><h1>ADMIN LOGIN</h1></td>
				</tr>
				<tr>
					<td colspan="2"><hr></td>
				</tr>
				<tr>
					<td>Enter username</td>
					<td><input type="text" name="adminName"
						placeholder="enter username"></td>
				</tr>
				<tr>
					<td>Enter password</td>
					<td><input type="password" name="password"
						placeholder="enter password"></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						name="login" value="submit"></td>
				</tr>
			</table>
		</form>
		<div>${requestScope.message}</div>
	</div>
</body>
</html>