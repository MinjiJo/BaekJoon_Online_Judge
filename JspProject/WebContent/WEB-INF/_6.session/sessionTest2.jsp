<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.text.SimpleDateFormat"%>

<%
	session.setMaxInactiveInterval(10);//10�� ���� ��������
	//���� ��� - ���� �� 10�� �ȿ� ���� ��ħ(F5)�� ������.
	//		     ���� �� 10�� �Ŀ� ���� ��ħ(F5)�� ������.
	//10�� �� ���ο� ���� ID�� �����˴ϴ�.
	
	SimpleDateFormat formatter =
			new SimpleDateFormat("yyyy-MM-dd E���� HH:mm:ss");
%>
<html>
<head>
	<title>Session Test</title>
</head>
<body>
	<h2>���� �׽�Ʈ</h2>
		isNew():<%=session.isNew() %><br> <!-- ���ο� �����̸� true �ƴϸ� false -->
		���� �����ð�:<%=formatter.format(session.getCreationTime()) %><br>
		���� ���� �ð�:<%=formatter.format(session.getLastAccessedTime()) %><br>
		����ID:<%=session.getId() %><br>
		<!-- ID�� session ��ü �����ÿ� �� �����̳ʿ� ���� �ڵ����� �Ҵ�˴ϴ�. -->
</body>
</html>