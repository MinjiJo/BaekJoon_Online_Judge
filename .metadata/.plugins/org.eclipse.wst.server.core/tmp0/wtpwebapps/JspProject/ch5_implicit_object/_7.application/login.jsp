<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<link href="login.css" rel="stylesheet" type="text/css">
		<title>LOGIN</title>
	</head>
	<body>
		
		<form action="LoginServlet2" method="post">
			���̵� : <input type="text" name="id"
						 placeholder="Enter id" required><br>
			��й�ȣ: <input type="password" name="passwd"
						 placeholder="Enter password" required><br>
			<input type="submit" value="����"><input type="reset" value="���">
		</form>
	</body>
</html>