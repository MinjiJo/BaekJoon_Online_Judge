<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>scope.jsp</title>
</head>
<body>
	request �Ӽ� : <%=request.getAttribute("food") %> <br>
	session �Ӽ� : <%=session.getAttribute("food") %><br>
	ServletContext �Ӽ� : <%=application.getAttribute("food") %>
</body>
</html>