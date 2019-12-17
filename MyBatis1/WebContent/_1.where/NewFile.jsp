<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<%--
	조회기간 날짜를 반드시 입력합니다.
	select * from emp
	where hiredate between ? and ?
 --%>
	<form action="<%=request.getContextPath() %>/term.net"
		  method="post">
		<label>조회기간</label><br>
		<input type="date" name="startday"
			   min="1980-01-01" max="1987-12-31" required>
		~<input type="date" name="endday"
			   min="1980-01-01" max="1987-12-31" required>
		<input type="submit" value="검색">
	</form>
</body>
</html>