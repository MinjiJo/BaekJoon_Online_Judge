<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c"
		   uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSTL core ���̺귯�� ��� ���� 2</title>
</head>
<body>
<%-- �ڹ��� for���� �����մϴ�.
	 items �Ӽ��� �÷����̳� �迭 ������ ��ü�� �����Ͽ�
	 ��ü�� �ε�����ŭ �ݺ��� �� �ֽ��ϴ�.
	 begin : ���� �ε���
	 end : �� �ε���
	 step : ������
	 var : �ݺ� ���� ��� ���� �ݺ��ϰ� �ִ� ���� ����ϴ� �����Դϴ�. --%>
<c:forEach var="test" begin="1" end="10" step="2">
	<b>${test }</b>&nbsp;
</c:forEach>
<hr>

<%
	pageContext.setAttribute("nameList",
			new String[]{"ȫ�浿", "�Ӳ���", "������", "�Ż��Ӵ�"});
%>
<%-- �迭�� ��� ������ ����մϴ�.
	 items���� ${pageScope.nameList} �Ǵ� ${nameList} ��� ���� --%>
<c:forEach var="name" items="${pageScope.nameList }">
	<li>${name}</li>
</c:forEach>
<hr>

<%-- �迭�� �ε��� 2���� 3������ ������ ����մϴ�.
	  ������ ������ ������ �����մϴ�. --%>
<c:forEach var="name" items="${nameList }" begin="2" end="3">
	<li>${name}</li>
</c:forEach>
<hr>

<%-- varStatus �Ӽ��� �ݺ� ������ ��� �ִ� ��ü(LoopTagStatus)��
	  ������ �������� ������ �����ϴ�.
	 varStatus="status"�� ���
	 status.index : �ݺ� ���࿡�� ������ �ε������� �ǹ��մϴ�.
	 status.count : �ݺ� ������ Ƚ���� �ǹ��մϴ�.
	  --%>
<c:forEach var="name" items="${nameList}" begin="2" end="3"
	varStatus="status">
	<li>${status.count }��° - index[${status.index }]:${name }</li>
</c:forEach>
<hr>
</body>
</html>