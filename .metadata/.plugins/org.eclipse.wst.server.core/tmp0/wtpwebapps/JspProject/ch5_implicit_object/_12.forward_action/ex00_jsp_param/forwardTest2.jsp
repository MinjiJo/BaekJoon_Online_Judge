<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%	request.setCharacterEncoding("euc-kr"); %>
<html>
<body>
<h1> forwardTest2.jsp �Դϴ�.(���� ȭ�鿡�� ���������?)</h1>
<jsp:forward page='forwardTest3.jsp'>
	<jsp:param name="tel" value="010-1234-5678"/>
	<jsp:param name="alias" value="�����"/>
</jsp:forward>
<%="���� ����� �ɱ��?" %>
</body>
</html>