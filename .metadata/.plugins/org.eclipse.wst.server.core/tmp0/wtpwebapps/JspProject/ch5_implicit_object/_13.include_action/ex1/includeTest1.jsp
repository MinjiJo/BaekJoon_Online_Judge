<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>includeTest1</title>
<style>
	body{text-align: center;}
	table{width: 500px; margin: 0 auto;}
</style>
</head>
<body>
<h2>Include �׼� �׽�Ʈ</h2>
<form action="includeTest2.jsp" method="post">

	<!-- hidden Ÿ���� input���� ���� ���������� ����� �ּҰ��� �����Ͽ����ϴ�. -->
	<input type="hidden" name="includePage"
		   value="includeTest3.jsp">
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