<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>dispatcher.jsp</title>
</head>
<body>
<!-- request 영역에 속성 "food" 라는 이름으로 저장되어 있는 값을 가져와서
	 출력하라는 의미입니다. -->
<%-- jsp에서 <%= ~ %>의 의미는 출력의 의미입니다. --%>
	request 속성 값 : <%=request.getAttribute("food") %>
</body>
</html>