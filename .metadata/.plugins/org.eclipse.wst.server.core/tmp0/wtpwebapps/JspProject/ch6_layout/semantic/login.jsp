<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>LOGIN</title>
	</head>
	<body>
		<form action="login_ok.jsp" method="post">
			<h1>�α���</h1>
			<hr>
			<b>���̵�</b>
				<input type="text" name="id"
						placeholder="Enter id" required><br>
			<b>��й�ȣ</b>
				<input type="password" name="passwd"
						placeholder="Enter password" required><br>
			<div class="clearfix">
				<button type="submit" class="submitbtn">Submit</button>
				<button type="reset" class="cancelbtn">Cancel</button>
			</div>
		</form>
	</body>
</html>