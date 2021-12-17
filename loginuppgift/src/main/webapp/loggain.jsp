<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%

if (session.getAttribute("mySession") != null) {
	
	
	RequestDispatcher rd = request.getRequestDispatcher("loggainservlet");
	rd.forward(request, response);
}
%>
    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="loggainservlet" method="post">

			Please enter your username 		
			<input type="text" name="un"/><br>		
		
			Please enter your password
			<input type="password" name="pw"/><br>
			
			Please enter a message
			<input type="text" name="msg">
			
			<input type="submit" value="submit">			
		
		</form>


</body>
</html>