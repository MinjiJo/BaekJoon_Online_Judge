<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>dispatcher.jsp</title>
</head>
<body>
<!-- request ������ �Ӽ� "food" ��� �̸����� ����Ǿ� �ִ� ���� �����ͼ�
	 ����϶�� �ǹ��Դϴ�. -->
<%-- jsp���� <%= ~ %>�� �ǹ̴� ����� �ǹ��Դϴ�. --%>
	request �Ӽ� �� : <%=request.getAttribute("food") %>
</body>
</html>