<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>LOGIN</title>
	</head>
	<body>
		<form action="/JspProject/loginTest" method="post">
			아이디 : <input type="text" id="id" name="id"
						 placeholder="Enter id" required><br>
			비밀번호: <input type="password" id="passwd" name="passwd"
						 placeholder="Enter password" required><br>
			<input type="submit" value="전송"><input type="reset" value="취소">
		</form>
	</body>
</html>