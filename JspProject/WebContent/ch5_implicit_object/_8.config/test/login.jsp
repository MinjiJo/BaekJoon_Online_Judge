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
			���̵� : <input type="text" id="id" name="id"
						 placeholder="Enter id" required><br>
			��й�ȣ: <input type="password" id="passwd" name="passwd"
						 placeholder="Enter password" required><br>
			<input type="submit" value="����"><input type="reset" value="���">
		</form>
	</body>
</html>