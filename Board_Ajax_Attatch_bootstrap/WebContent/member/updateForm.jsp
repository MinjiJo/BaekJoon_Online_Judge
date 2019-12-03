<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/update.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<title>회원 정보 업데이트 페이지</title>
<script>
$(function(){
	var checkemail = true;	//데이터베이스에서 가져오는 mail은 이미 checked
	$('form').submit(function(){
		if(!$.isNumeric($("input[name='age']").val())){
			alert('나이는 숫자를 입력하세요');
			$("input[name='age']").val('');
			$("input[name='age']").focus();
			return false;
		}
		
		if(!checkemail){
			alert('이메일 형식에 맞는 이메일을 입력하세요');
			$('input:eq(5)').val('');
			$('input:eq(5)').focus();
			$("#email_message").text('');
			return false;
		}
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
			checkemail=false;
		} else {
			$("#email_message").css('color', 'green')
							   .html("이메일형식에 맞습니다.");
			checkemail=true;
		}//if
	});//keyup
	
	var pandan = '${member.gender}';
	if(pandan == "남"){
		$("input:radio").eq(0).attr('checked','checked');
	} else {
		$("input:radio").eq(1).attr('checked','checked');
	}
	$(".cancelbtn").click(function(){
		history.back();
	});
});//ready
</script>
<jsp:include page="../board/header.jsp" />
</head>
<body>
	<form name="updateform" action="updateProcess.net" method="post">
		<h1>회원 수정 페이지</h1>
		<hr>
		<b>아이디</b>
		<input type="text" name="id" placeholder="Enter id"
				required maxLength="12" value="${id }" readOnly>
		
		<b>비밀번호</b>
		<input type="password" name="pass" 
				placeholder="Enter password" required
				value="${member.pass}">
		
		<b>이름</b>
		<input type="text" name="name" placeholder="Enter name"
				maxlength=15 required value="${member.name }">
		
		<b>나이</b>
		<input type="text" name="age" maxlength=2
				placeholder="Enter age" required value="${member.age }">
		
		<b>성별</b>
		<div>
			<input type="radio" name="gender" value="남"><span>남자</span>
			<input type="radio" name="gender" value="여"><span>여자</span>
		</div>
		
		<b>이메일 주소</b>
		<input type="text" name="email" placeholder="Enter email" value="${member.email }"
				required><span id="email_message"></span>
		<div class="clearfix">
			<button type="submit" class="submitbtn">수정</button>
			<button type="reset" class="cancelbtn">취소</button>
		</div>
	</form>
</body>
</html>