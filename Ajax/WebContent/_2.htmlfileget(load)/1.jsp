<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>������ �����͸� ��� ������Ʈ�� �����ϱ�</title>
<style>
div{
	width: 180px; height: 80px;
	margin: 3px; float: left;
}
</style>
<script src="../js/jquery-3.4.1.js"></script>
<script>
/*
 - jQuery���� �������ִ� load()�޼��带 ����ؼ� ������ menu.html ��������
      �����͸� �����ͼ� Ư�� ������Ʈ�� �߰��մϴ�.
*/
$(function(){
	$("#menu1").click(function(){
		//load()�޼��带 �̿��ؼ� menu.html ������ü�� �ε��Ͽ�
		//id�� message1�� ������Ʈ�� �ֽ��ϴ�.
		$("#message1").load("menu.html");
	});

	$("#menu2").click(function(){
		//load()�Լ��� �̿��ؼ� menu.html ������ ������ li ������Ʈ�� �о
		//id�� message2�� ������Ʈ�� �ֽ��ϴ�.
		$("#message2").load("menu.html li");
	});
});
</script>
</head>
<body>
<div>
	<a href="#" id="menu1">�޴� ���� 1</a>
	<p>
		<span id="message1"></span>
	</p>
</div>
<div>
	<a href="#" id="menu2">�޴� ���� 2</a>
	<p>
		<span id="message2"></span>
	</p>
</div>
</body>
</html>