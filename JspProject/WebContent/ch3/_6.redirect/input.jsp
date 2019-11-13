<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Redirect 방식으로 이동</title>
</head>
<body>
	<form action='RedirectServlet'>
		<b>좋아하는 음식은 무엇인가요?</b><br>
			<input type='text' name='food'>
			<input type='submit' value='전송'>
	</form>
</body>
</html>