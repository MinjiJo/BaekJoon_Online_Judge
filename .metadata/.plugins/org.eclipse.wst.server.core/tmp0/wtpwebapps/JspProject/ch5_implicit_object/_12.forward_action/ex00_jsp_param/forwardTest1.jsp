<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<title>forwardTest1</title>
<style>
	body{text-align: center;}
	table{width: 500px; margin: 0 auto;}
</style>
</head>
<body>
<h2>������ �׼� �׽�Ʈ</h2>
<form action="forwardTest2.jsp" method="post">
	<table>
		<tr>
			<td>�̸�</td>
			<td><input type="text" name="name" required></td>
		</tr>
		<tr>
			<td>����</td>
			<td><input type="text" name="age" required></td>
		</tr>
		<tr>
			<td>�ּ�</td>
			<td><input type="text" name="address" required></td>
		</tr>
		<tr><td colspan=2>
			<input type="submit" value="����">
		</td></tr>
	</table>
</form>
</body>
</html>