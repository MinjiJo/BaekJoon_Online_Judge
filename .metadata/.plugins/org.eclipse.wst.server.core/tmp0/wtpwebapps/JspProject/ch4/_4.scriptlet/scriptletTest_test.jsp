<%--
	��ũ��Ʈ��(Scriptlet)
	HTML �ڵ�� �� �κ��� �Ϲ� HTML����ó�� �״�� ����ϸ�
	�ڹ� �ڵ�� �̷���� ���� �κ��� <%..%>�� ǥ���Ǵ� ��ũ��Ʈ�� �±׸� ����Ͽ� �����մϴ�.
	
	JSP ������ ����� �� �� �����̳ʿ� ���� JSP �ڵ尡 �Ľ�(Parsing)������
	���ļ� ������ Ŭ������ ��ȯ�˴ϴ�.
	�̶� �Ϲ� ������ Ŭ������ service()�޼��忡 �ش��ϴ�
	_jspService()�޼��尡 �� �����̳ʿ� ���� �ڵ����� �����ǵǸ�
	�� �޼����� ���ο� �Ľ̵� JSP�ڵ尡 ���� �˴ϴ�.
	�̷��� �� �����̳ʿ� ���� ������ Ŭ������ �����Ǹ� �ν��Ͻ��� �����尡
	�����ǰ� _jspService()�޼��忡 ���� ���� �������� �������
	Ŭ���̾�Ʈ�� ���۵Ǿ� ��� �������� ǥ�õ˴ϴ�.
	
	C:\
 --%>

<%@ page language="java" 
		 contentType="text/html; charset=EUC-KR"
   		 pageEncoding="EUC-KR"%>
<%@ page import="java.util.Calendar" %>
<%
	Calendar c = Calendar.getInstance();
	int hour = c.get(Calendar.HOUR_OF_DAY);
	int minute = c.get(Calendar.MINUTE);
	int second = c.get(Calendar.SECOND);
%>
<!DOCTYPE html>
<html>
<head>
	<title>Scriptlet Test</title>
	<style>
		<% 
		if(hour < 12) {%>
			body{background: yellow}
		<%} else {%>
			body{background: green}		
		<%}%>		
	</style>
</head>
<body>
	<h1>���� �ð��� <%=hour %>��<%=minute %>��<%=second %>�� �Դϴ�.</h1>
	<%
		if(hour >= 12){
	%>
	<h2>���� �Դϴ�.</h2>
	<%
		} else {
	%>
	<h2>���� �Դϴ�.</h2>
	<%
		}
	%>
</body>
</html>