<%-- ���� �������� �����ϸ� error500.jsp�� ����˴ϴ�.
	 8�� ���� ������ �߻����� 500�� ���� Ȯ���մϴ�. --%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>�Ķ���� ���</title>
</head>
<body>
name �Ķ���� ��: <%= request.getParameter("name").toUpperCase()//; 
%>
<%-- ;�� �߰��߽��ϴ�. --%>
</body>
</html>