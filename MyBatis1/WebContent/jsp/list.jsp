<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>회원 리스트-list.jsp</title>
</head>
<body>
<filedset>
<legend><h1>회원 리스트</h1></legend>
<table>
	<thead>
		<tr>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>수정</th>
			<th>삭제</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="l" items="${list }">
			<tr>
				<td>${l.id }</td>
				<td>${l.password}</td>
				<td><input type="button" value="수정"
				onclick='location.href="updateForm.net?id=${l.id}"'></td>
				<td>
					<c:if test="${l.id != 'admin' }">
						<input type="button" value="삭제"
						onclick='location.href="delete.net?id=${l.id}"'>
					</c:if>
				</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</filedset>
</body>
</html>