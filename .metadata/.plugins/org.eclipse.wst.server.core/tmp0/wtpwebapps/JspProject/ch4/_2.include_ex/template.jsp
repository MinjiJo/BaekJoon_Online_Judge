<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>include �׽�Ʈ</title>
<style>
span{background:yellow}
footer{position:fixed;bottom:20px;width:100%}
body > footer > h3{background:lightgray;text-align:center}
</style>
</head>
<body>
	<%@ include file="header.jsp" %>
	<h1>template.jsp �����Դϴ�.</h1>
	<span>header.jsp�� id ���Դϴ�. : <%=id%></span>
	<footer>
	<%@ include file="footer.jsp" %>
	</footer>
</body>
</html>