<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<% request.setCharacterEncoding("euc-kr"); %>
<html>
<head>
<title>회원가입폼-결과</title>
</head>
<body>
<jsp:useBean id="joinform" class="javabean.JoinForm" />
<%-- 자바빈의 프로퍼티 age가 정수형인 경우
	 private int age;
	 파라미터로 넘겨 받은 문자열 숫자는 정수형으로 변환되어 저장됩니다. --%>
<jsp:setProperty name="joinform" property="*"/>
<table>
	<tr>
		<td>아이디</td>
		<td><jsp:getProperty name="joinform" property="id"/></td>
	</tr>
	<tr>
		<td>비밀번호</td>
		<td><jsp:getProperty name="joinform" property="pass"/></td>
	</tr>
	<tr>
		<td>이름</td>
		<td><jsp:getProperty name="joinform" property="name"/></td>
	</tr>
	<tr>
		<td>성별</td>
		<td><jsp:getProperty name="joinform" property="gender"/></td>
	</tr>
	<tr>
		<td>나이</td>
		<td><jsp:getProperty name="joinform" property="age"/></td>
	</tr>
	<tr>
		<td>이메일주소</td>
		<td><jsp:getProperty name="joinform" property="email"/></td>
	</tr>
</table>
</body>
</html>