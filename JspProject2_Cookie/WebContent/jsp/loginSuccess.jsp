<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>로그인 성공</title>
</head>
<body>
	<%
		String id = (String) session.getAttribute("id");
		if(id != null && !id.equals("")) {
	%>
	<%=id %>님 로그인에 성공하셨습니다.
	<br>
	<ul>
		<li><a href="<%=request.getContextPath() %>/logout_cookie">로그아웃</a>
		</li>
		<li><a href="<%=request.getContextPath() %>/info">내정보보기</a>
		</li>
		<%
			if (id.equals("admin")){
		%>
		<li><a href="<%=request.getContextPath() %>/all">모든 회원 정보 보기</a>
		</li>
		<%
			}
		%>
	</ul>
<%
		} else {
			response.sendRedirect("cookielogin");
		}
%>
</body>
</html>