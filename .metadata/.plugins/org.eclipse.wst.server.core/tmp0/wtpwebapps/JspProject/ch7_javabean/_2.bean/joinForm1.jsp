<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>ȸ��������</title>
</head>
<body>
<form action="joinForm2.jsp" method="post">
<table>
	<tr>
		<td>���̵�</td>
		<td><input type="text" name="id" id="id"></td>
	</tr>
	<tr>
		<td>��й�ȣ</td>
		<td><input type="password" name="pass" id="pass"></td>
	</tr>
	<tr>
		<td>�̸�</td>
		<td><input type="text" name="name" id="name"></td>
	</tr>
	<tr>
		<td>����</td>
		<td>
			<input type="radio" name="gender" value="male"> ��
			<input type="radio" name="gender" value="female"> ��
		</td>
	</tr>
	<tr>
		<td>����</td>
		<td><input type="text" name="age" id="age"></td>
	</tr>
	<tr>
		<td>�̸����ּ�</td>
		<td><input type="email" name="email" id="email"></td>
	</tr>
	<tr>
		<td colspan=2>
			<button type="submit">����</button>
			<button type="reset">�ٽ� �ۼ�</button>
		</td>
	</tr>
</table>
</form>
</body>
</html>