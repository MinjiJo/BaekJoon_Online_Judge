<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	session.setMaxInactiveInterval(10);//10�� ���� ��������
	//���� ��� - ���� �� 10�� �ȿ� ���� ��ħ(F5)�� ������.
	//		     ���� �� 10�� �Ŀ� ���� ��ħ(F5)�� ������.
	//10�� �� ���ο� ���� ID�� �����˴ϴ�.
%>
<html>
<head>
	<title>Session Test</title>
</head>
<body>
	<h2>���� �׽�Ʈ</h2>
		isNew():<%=session.isNew() %><br> <!-- ���ο� �����̸� true �ƴϸ� false -->
		���� �����ð�:<%=session.getCreationTime() %><br>
		���� ���� �ð�:<%=session.getLastAccessedTime() %><br>
		����ID:<%=session.getId() %><br>
		<!-- ID�� session ��ü �����ÿ� �� �����̳ʿ� ���� �ڵ����� �Ҵ�˴ϴ�. -->
		
</body>
</html>