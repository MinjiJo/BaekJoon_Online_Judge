<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/join.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<title>회원관리 시스템 회원가입 페이지</title>
<script>
$(document).ready(function(){
	$("input:eq(0)").on('keyup',function(){
		//처음에 pattern에 적합하지 않은 경우 메시지 출력 후
		//적합한 데이터를 입력해도 계속 같은 데이터 출력하므로
		//이벤트 시작할 때마다 비워둡니다.
		$("#message").empty();
		// \w => [A-Za-z0-9_]
		var pattern = /^\w{5,12}$/;
		var id = $("input:eq(0)").val();
		if(!pattern.test(id)){
			$("#message").css('color','red')
						 .html("영문자 숫자 _로 5~12자 가능합니다.")
			return;
		}
		
		$.ajax({
			type:"post",
			url:"join",
			data : {"id" : id},
			success : function(resp){
				if(resp == -1){
					$("#message").css('color','green').html("사용 가능한 아이디입니다.");
				} else {
					$("#message").css('color','blue').html("사용중인 아이디 입니다.");
				}
			}
		})
	})
	
	$("input:eq(6)").on('keyup', function(){
		$("#email_message").empty();
		//[A-Za-z0-9]와 동일한 것이 \w
		var pattern = /\w+@\w+[.]\w{3}/;
		var email = $("input:eq(6)").val();
		console.log(email);
		console.log(!pattern.test(email));
		if(!pattern.test(email)){
			$("#email_message").css('color', 'red')
							   .html("이메일형식이 맞지 않습니다.");
		} else {
			$("#email_message").css('color', 'green')
							   .html("이메일형식에 맞습니다.");
		}//if
	});//keyup
});//ready
</script>
</head>
<body>
	<form name="joinform">
		<h1>회원가입 페이지</h1>
		<hr>
		<b>아이디</b>
		<input type="text" name="id" placeholder="Enter id"
				required maxLength="12">
		<span id="message"></span>
		
		<b>비밀번호</b>
		<input type="password" name="pass" 
				placeholder="Enter password" required>
		
		<b>이름</b>
		<input type="text" name="name" placeholder="Enter name"
				maxlength=15 required>
		
		<b>나이</b>
		<input type="text" name="age" maxlength=2
				placeholder="Enter age" required>
		
		<b>성별</b>
		<div>
			<input type="radio" name="gender" value="남" checked><span>남자</span>
			<input type="radio" name="gender" value="여"><span>여자</span>
		</div>
		
		<b>이메일 주소</b>
		<input type="text" name="email" placeholder="Enter email"
				required><span id="email_message"></span>
		<div class="clearfix">
			<button type="submit" class="submitbtn">회원가입</button>
			<button type="reset" class="cancelbtn">다시작성</button>
		</div>
	</form>
</body>
</html>