<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% 
		if(session.getAttribute("user")==null)
		{
			response.sendRedirect("login.jsp");
		}
		response.setHeader("cache-control","no-store,must-revalidate,no-cache");
		response.setHeader("Pragma","no-cache");
		response.setHeader("Expires","0");
	%>
	Hello
</body>
</html>