<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>회원가입폼</title>
</head>
<body>
<form action="joinForm2.jsp" method="post">
<table>
	<tr>
		<td>아이디</td>
		<td><input type="text" name="id" id="id"></td>
	</tr>
	<tr>
		<td>비밀번호</td>
		<td><input type="password" name="pass" id="pass"></td>
	</tr>
	<tr>
		<td>이름</td>
		<td><input type="text" name="name" id="name"></td>
	</tr>
	<tr>
		<td>성별</td>
		<td>
			<input type="radio" name="gender" value="male"> 남
			<input type="radio" name="gender" value="female"> 여
		</td>
	</tr>
	<tr>
		<td>나이</td>
		<td><input type="text" name="age" id="age"></td>
	</tr>
	<tr>
		<td>이메일주소</td>
		<td><input type="email" name="email" id="email"></td>
	</tr>
	<tr>
		<td colspan=2>
			<button type="submit">가입</button>
			<button type="reset">다시 작성</button>
		</td>
	</tr>
</table>
</form>
</body>
</html>