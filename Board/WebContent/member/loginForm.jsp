<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!doctype html>
<html>
<head>
<title>회원관리 시스템 로그인 페이지</title>
<link href="css/login.css"
      type="text/css"
      rel ="stylesheet">
      <script src="js/jquery-3.4.1.js"></script>
      <script>
       $(function(){
    	   $(".join").click(function(){
        	   location.href="join.net";
           });
       })
      </script>
</head>
<body>
<form name="loginform" action="loginProcess.net"
      method="post"><h1>로그인 </h1>
      <hr>
      <b>아이디</b>
        <input type="text" name="id"
               placeholder="Enter id" required>
        <b>Password</b>
        <input type="password" name="pass"
               placeholder="Enter password" required>
        <div class="clearfix">
          <button type="submit" class="submitbtn">로그인</button>
          <button type="button" class="join">회원가입</button>
        </div>
</form>
</body>
</html>