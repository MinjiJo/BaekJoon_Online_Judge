<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>placeholder</title>
<link href="../css/form.css" rel="stylesheet" type="text/css">
<script src="../../js/jquery-3.4.1.js"></script>
<script src="../js/ex3_1.js" charset="UTF-8"></script>
</head>
<body>
<form>
	<span>이름</span>
		<input type="text" placeholder="이름" id="name" name="name">
		<br>
	<span>나이</span>
		<input type="text" placeholder="나이" id="age" name="age">
		<br>
	<span>주소</span>
		<input type="text" placeholder="주소" id="address" name="address">
		<br>
	<input type="submit" value="전송">
</form>
<div></div>
</body>
</html>