<!-- 
config���� ��ü�� JSP�������� ������ Ŭ������ ��ȯ�Ǿ� ������ �ν��Ͻ���
������ �� �����ؾ� �� �ʱ� ���� �������� ������ ���� ��ü�Դϴ�.
�̷��� �ʱ� ���� �������� �� �����̳ʰ� ������ �� ��ü������ ����/�����Ǹ�
������ �� 1������ ��ü�� �����Ǹ� ���� ������ �ν��Ͻ��� ������ config
��ü�� �����ϰ� �˴ϴ�.
������: 1. ��Ŭ���� Servers �信�� start ����
		2. ����������
			http://localhost:8088/JspProject/configTest2
			�Է��մϴ�.
 -->
<%@ page language="java" 
		 contentType="text/html; charset=EUC-KR"
    	 pageEncoding="EUC-KR"%>
<%@page import="java.util.Enumeration" %>
<html>
<head>
<title>config Test</title>
<meta name="viewport"
	  content="width=divice-width, initial-scale=1.0">
<link rel="stylesheet"
 	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
<div class="container">
<h2>config �׽�Ʈ</h2>
<table class="table table-striped">
	<tr>
		<td>�ʱ� �Ķ���� �̸�</td>
		<td>�ʱ� �Ķ���� ��</td>
	</tr>
	<tr>
		<td>�̸�</td>
		<td><%=config.getInitParameter("�̸�") %></td>
	</tr>
	<tr>
		<td>����</td>
		<td><%=config.getInitParameter("����") %></td>
	</tr>
	<tr>
		<td>email</td>
		<td><%=config.getInitParameter("email") %></td>
	</tr>
</table>
</div>
</body>
</html>