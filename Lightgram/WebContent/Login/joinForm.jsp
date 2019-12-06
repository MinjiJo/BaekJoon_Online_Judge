<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>회원가입</title>
<script src="js/jquery-3.4.1.js"></script>
<script>
	$(function() {
		
		$('form').submit(function() {
				$('#message').text('');
			
			var pattern = /^\w{5,12}$/;
			var id = $('input:eq(0)').val();
			if (!pattern.test(id)) {
					alert('아이디는 영문자 , 숫자 포함 5~12자 사이로 정해주세요');
					$('input:eq(0)').val('').focus();
				return false;
			}
			$('#email_message').empty();

			var pattern = /^\w+@\w+[.]\w{3}$/;
			var email = $('input:eq(2)').val();
			if (!pattern.test(email)) {
				alert('이메일 형식에 맞지 않습니다.');
				$('input:eq(2)').focus();
				return false;
			} else {
				alert('회원가입에 성공했습니다.');
			}
		})
	})
</script>
</head>
<link href="css/joinForm.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<form name="joinform" action="joinProcess.net" method="post" id="joinform">
		<fieldset>
			<table>
				<tr>
				<td id="td1"><img src="icons/cat_logo.jpg"></td>
				</tr>
				<tr style="height:40px;">
					<td>친구들의 사진을 보려면 <br> 가입하세요
					</td>
				</tr>
				
				
				<tr style="height:50px;">
					<td><input type="text" name="id" placeholder="  아이디" 
					id="id" required></td>
					</tr>
				<tr style="height:50px;">
					<td><input type="text" name="name" id="name" placeholder="  사용자 이름"
					value=""></td>
				</tr>
				<tr style="height:50px;">
					<td><input type="email" name="email"id="email" placeholder="  이메일" required></td>
				</tr>
				<tr style="height:50px;">
					<td><input type="password" name="pass" id="pass"placeholder="  비밀번호" required></td>
				</tr>
				<tr style="height:30px;">
					<td><button type="submit">가입하기</button></td>
				</tr>
				
				
			</table>
		</fieldset>
		<fieldset class="h70">
			<table>
				<tr>
					<td>계정이 있으신가요?<a href="login.net">&nbsp;로그인</a></td>
				</tr>
			</table>
		</fieldset>
	</form>
</body>
</html>