<!-- 
config내장 객체는 JSP페이지가 서블릿 클래스로 변환되어 서블릿 인스턴스가
생성될 때 참조해야 할 초기 설정 정보들을 저장해 놓은 객체입니다.
이러한 초기 설정 정보들은 웹 컨테이너가 구동될 때 자체적으로 생성/관리되며
서블릿 당 1개만의 객체가 생성되며 같은 서블릿 인스턴스는 동일한 config
객체를 참조하게 됩니다.
실행방법: 1. 이클립스 Servers 뷰에서 start 선택
		2. 브라우저에서
			http://localhost:8088/JspProject/configTest2
			입력합니다.
 -->
<%@ page language="java" 
		 contentType="text/html; charset=EUC-KR"
    	 pageEncoding="EUC-KR"%>
<%@page import="java.util.Enumeration" %>
<html>
<head>
<title>config Test</title>
<meta name="viewport"
	  content="width=divice-width, initial-scale=1.0">
<link rel="stylesheet"
 	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
<div class="container">
<h2>config 테스트</h2>
<table class="table table-striped">
	<tr>
		<td>초기 파라미터 이름</td>
		<td>초기 파라미터 값</td>
	</tr>
	<tr>
		<td>이름</td>
		<td><%=config.getInitParameter("이름") %></td>
	</tr>
	<tr>
		<td>나이</td>
		<td><%=config.getInitParameter("나이") %></td>
	</tr>
	<tr>
		<td>email</td>
		<td><%=config.getInitParameter("email") %></td>
	</tr>
</table>
</div>
</body>
</html>