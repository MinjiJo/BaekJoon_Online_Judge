<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%-- empty ������
	����) empty ��
	: ���� ��� �ְų� null������ ������ �� ����ϴ� ������ �Դϴ�.
	    ���� null�̸� true�� ��ȯ�մϴ�.
	    ���ڿ��� �迭�� ũ�Ⱑ 0�� ��쿡�� true�� ��ȯ�մϴ�.
	  --%>
	<%-- session�� ���̵��� null���� Ȯ���մϴ�.
			null�̸� "�α����ϼž� �մϴ�."
			�ƴѰ�� "�α��� ����"�̶�� ����մϴ�.
	 --%>
	 <% session.setAttribute("id","����"); %>
	 <c:choose>
	 	<c:when test="${id == null }">
	 		<h1>�α����ϼž� �մϴ�.</h1>
	 	</c:when>
	 	<c:otherwise>
	 		<h1>${id }�� �α��� ����</h1>
	 	</c:otherwise>
	 </c:choose>
</body>
</html>