<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>�Ķ���� ���</title>
</head>
<body>
<%-- �Ķ���� name���� ��û�� ���� ���� ������
	 request.getParameter("name")�� NullPointerException �߻��մϴ�. --%>
name �Ķ���� ��:
	<%= request.getParameter("name").toUpperCase() %>
</body>
</html>