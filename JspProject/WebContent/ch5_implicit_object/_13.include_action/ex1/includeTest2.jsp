<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>��Ŭ��� �׼� �׽�Ʈ ����</h2>
	<%request.setCharacterEncoding("euc-kr"); %>
	<%-- <%request.getParameter("includePage"); %>
		 ǥ������ ���ڿ��� �ڹٷ� ǥ���ؾ� �ϹǷ� "�� ����ϰ� �׼� �±׿�����
		 '�� ����մϴ�. --%>
	<jsp:include page='<%=request.getParameter("includePage") %>'>
		<jsp:param name="tel" value="010-1234-5678"/>
		<jsp:param name="alias" value="happy"/>
	</jsp:include>
	<h2>��Ŭ��� �׼� �׽�Ʈ ��</h2>
</body>
</html>