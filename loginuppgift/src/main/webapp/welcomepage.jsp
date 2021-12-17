<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="model.myjavabean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%

	//check if there is a session 
	if (session.getAttribute("mySession") == null) {
		out.print("<h1>Error, no user found. No session created. Try again..</h1>");
	}
	else {		
		String contentSession = (String) session.getAttribute("mySession");
		
		out.print("<h1>Welcome, " + contentSession + "</h1>");
		myjavabean user1=(myjavabean)request.getAttribute("msg");
		out.print(user1.getMsg());

		
	}
	%>
	
	
	
	<p>press this button to remove the session:</p>
	<form action="removsessionservlet" method="post">
		<input type="submit" value="remove the session" />
	</form>
	
	

</body>
</html>