<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script src="../js/jquery-3.4.1.js"></script>
<script>
$(function() {
	$("button").click(function() { //������ Ŭ���ϸ�
		
		$("button").text('�ε��Ϸ�').css('color','red');
		
		//<p>�±� ������ "sample1.txt"�� ������ �ҷ��ɴϴ�.
		$("p").load("sample1.txt");
		
		$("pre").load("sample1.txt");
	});
});
</script>
</head>
<body>
	<button>����</button>
	<p>������ : ���� �� �ٲ���</p>
	<br>
	<pre>������ : ���� �ٲ�ϴ�.(�Է��� ��� ��µ˴ϴ�.)</pre>
</body>
</html>