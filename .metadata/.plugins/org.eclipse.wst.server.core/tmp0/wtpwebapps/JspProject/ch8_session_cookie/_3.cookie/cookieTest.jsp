<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<%
		//��Ű �����մϴ�.
		//"name" : ��Ű�� �̸�, "hong" : ��Ű�� ��
		Cookie cookie = new Cookie("name", "hong");
	
		//cookie.setMaxAge(60*60*24);//��Ű ���� �ð��� �����մϴ�.
		//������ �ʷ� �Ϸ縦 �����մϴ�.
		cookie.setMaxAge(6); //6�ʵ��� ��Ű ���� �ð��� �����մϴ�.
		response.addCookie(cookie);//������ ��Ű�� Ŭ���̾�Ʈ�� �����մϴ�.
	%>
	<h2>
		��Ű �̸� : <%=cookie.getName() %></h2>
	<h2>
		��Ű �� : <%=cookie.getValue() %></h2>
	<h2>
		��Ű �����ð� : <%=cookie.getMaxAge() %>��
		(�� �ð��� ���� �� �Ʒ��� anchor�� Ŭ���� ������)
	</h2>
	<a href="cookieTest2.jsp">��Ű �� �ҷ�����</a>
</body>
</html>