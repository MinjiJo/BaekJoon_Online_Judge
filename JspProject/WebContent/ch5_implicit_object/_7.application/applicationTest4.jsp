<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.Enumeration" %>
<html>
<head>
<title>Application Test - �ʱ�ȭ �Ķ���� �о����</title>
</head>
	- �ʱ�ȭ �Ķ����(�ʱ⿡ �ʿ��� ������)�� web.xml�� �ۼ��մϴ�.
<body>
	<h2>web.xml���� ������ �������� ����</h2>
	<% String color = application.getInitParameter("color");
	%>
	<div style="background:<%=color %>">���� ���� ���ΰ���?
	</div>
</body>
</html>