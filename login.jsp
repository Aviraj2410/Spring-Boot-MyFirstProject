<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hey</title>

<link href="webjars/bootstrap/4.4.1-1/css/bootstrap.min.css"
	rel="stylesheet">

</head>
<body>
	<div class="container">
		<h1 align="center">
			<font color="blue"> ${ErrorMessage}</font>
		</h1>
		<form method="post">
			<h1 align="center">
				Name:<input type="text" name="Name" /><br>
			</h1>

			<h1 align="center">

				Password:<input type="password" name="Password"><br>
			</h1>

			<h1 align="center">
				<input type="Submit">

			</h1>
		</form>
		<script src="webjars/jquery/3.4.0/jquery.min.js"></script>
		<script src="webjars/bootstrap/4.4.1-1</js/bootstrap.min.js"></script>
	</div>
</body>
</html>