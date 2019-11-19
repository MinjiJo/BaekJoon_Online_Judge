<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>서버의 데이터를 대상 엘리먼트에 삽입하기</title>
<style>
div{
	width: 180px; height: 80px;
	margin: 3px; float: left;
}
</style>
<script src="../js/jquery-3.4.1.js"></script>
<script>
/*
 - jQuery에서 제공해주는 load()메서드를 사용해서 서버의 menu.html 페이지의
      데이터를 가져와서 특정 엘리먼트에 추가합니다.
*/
$(function(){
	$("#menu1").click(function(){
		//load()메서드를 이용해서 menu.html 문서전체를 로드하여
		//id가 message1인 엘리먼트에 넣습니다.
		$("#message1").load("menu.html");
	});

	$("#menu2").click(function(){
		//load()함수를 이용해서 menu.html 문서의 내용중 li 엘리먼트만 읽어서
		//id가 message2인 엘리먼트에 넣습니다.
		$("#message2").load("menu.html li");
	});
});
</script>
</head>
<body>
<div>
	<a href="#" id="menu1">메뉴 보기 1</a>
	<p>
		<span id="message1"></span>
	</p>
</div>
<div>
	<a href="#" id="menu2">메뉴 보기 2</a>
	<p>
		<span id="message2"></span>
	</p>
</div>
</body>
</html>