<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr>
		<th>이름</th>
		<th>사원번호</th>
		<th>직업</th>
		<th>입사일</th>
		<th>부서번호</th>
	</tr>
	<c:forEach var="l" items="${list }">
		<tr>
			<td>${l.ename }</td>
			<td>${l.empno}</td>
			<td>${l.job }</td>
			<td>${l.hiredate }</td>
			<td>${l.deptno }</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>