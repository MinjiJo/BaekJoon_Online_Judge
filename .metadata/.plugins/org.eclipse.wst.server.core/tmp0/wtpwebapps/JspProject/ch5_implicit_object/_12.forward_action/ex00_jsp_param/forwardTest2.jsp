<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%	request.setCharacterEncoding("euc-kr"); %>
<html>
<body>
<h1> forwardTest2.jsp 입니다.(제가 화면에서 보여질까요?)</h1>
<jsp:forward page='forwardTest3.jsp'>
	<jsp:param name="tel" value="010-1234-5678"/>
	<jsp:param name="alias" value="사랑이"/>
</jsp:forward>
<%="저는 출력이 될까요?" %>
</body>
</html>