<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<% request.setCharacterEncoding("euc-kr"); %>
<html>
<head>
<title>ȸ��������-���</title>
</head>
<body>
<jsp:useBean id="joinform" class="javabean.JoinForm" />
<%-- �ڹٺ��� ������Ƽ age�� �������� ���
	 private int age;
	 �Ķ���ͷ� �Ѱ� ���� ���ڿ� ���ڴ� ���������� ��ȯ�Ǿ� ����˴ϴ�. --%>
<jsp:setProperty name="joinform" property="*"/>
<table>
	<tr>
		<td>���̵�</td>
		<td><jsp:getProperty name="joinform" property="id"/></td>
	</tr>
	<tr>
		<td>��й�ȣ</td>
		<td><jsp:getProperty name="joinform" property="pass"/></td>
	</tr>
	<tr>
		<td>�̸�</td>
		<td><jsp:getProperty name="joinform" property="name"/></td>
	</tr>
	<tr>
		<td>����</td>
		<td><jsp:getProperty name="joinform" property="gender"/></td>
	</tr>
	<tr>
		<td>����</td>
		<td><jsp:getProperty name="joinform" property="age"/></td>
	</tr>
	<tr>
		<td>�̸����ּ�</td>
		<td><jsp:getProperty name="joinform" property="email"/></td>
	</tr>
</table>
</body>
</html>