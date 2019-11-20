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
	<%-- empty 연산자
	형식) empty 값
	: 값이 비어 있거나 null인지를 조사할 때 사용하는 연산자 입니다.
	    값이 null이면 true를 반환합니다.
	    문자열과 배열의 크기가 0인 경우에도 true를 반환합니다.
	  --%>
	<%-- session의 아이디값이 null인지 확인합니다.
			null이면 "로그인하셔야 합니다."
			아닌경우 "로그인 성공"이라고 출력합니다.
	 --%>
	 <% session.setAttribute("id","정말"); %>
	 <c:choose>
	 	<c:when test="${id == null }">
	 		<h1>로그인하셔야 합니다.</h1>
	 	</c:when>
	 	<c:otherwise>
	 		<h1>${id }님 로그인 성공</h1>
	 	</c:otherwise>
	 </c:choose>
</body>
</html>