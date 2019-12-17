<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/join.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<title>회원관리 시스템 회원가입 페이지</title>
</head>
<body>
<form action="joinPro.net" method="post">
<h1>로그인 </h1>
      <hr>
      <b>아이디</b>
        <input type="text" name="id"
               placeholder="Enter id" required>
        <b>Password</b>
        <input type="password" name="password"
               placeholder="Enter password" required>
        <div class="clearfix">
          <button type="submit" class="submitbtn">회원가입</button><button type="reset" class="cancelbtn">취소</button>
        </div>
</form>
</body>
</html>