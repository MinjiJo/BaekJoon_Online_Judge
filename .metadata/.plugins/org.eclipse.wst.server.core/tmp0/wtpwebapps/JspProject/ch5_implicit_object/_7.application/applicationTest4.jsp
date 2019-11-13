<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.Enumeration" %>
<html>
<head>
<title>Application Test - 초기화 파라미터 읽어오기</title>
</head>
	- 초기화 파라미터(초기에 필요한 데이터)는 web.xml에 작성합니다.
<body>
	<h2>web.xml에서 설정한 색상으로 지정</h2>
	<% String color = application.getInitParameter("color");
	%>
	<div style="background:<%=color %>">나는 무슨 색인가요?
	</div>
</body>
</html>