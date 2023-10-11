<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="login" method="post">
		Email:<input type="email" name="email" required/>
		<br>
		<br>
		Password:<input type="password" name="password" required/>
		<br>
		<br>
		<button>Submit</button>
	</form>
	<form action="logout" method="post">
		<button>Logout</button>
	</form>
</body>
</html>