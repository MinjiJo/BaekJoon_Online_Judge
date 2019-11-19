<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>sample1</title>
<script src="../js/jquery-3.4.1.js"></script>
<script>
<%-- function(responseTxt, status, xhr)
- responseTxt: �����κ��� ���ϵ� �ؽ�Ʈ �����͸� �����ɴϴ�.
- status: �����κ����� ���ϵ� ���¸� �����ɴϴ�.
	(������ ��� "success", ������ ��� "error")
- xhr: XMLHttpRequest ��ü�� �����մϴ�.
- xhr.statusText : ���� ���� ���ڿ��� ���� �ɴϴ�.
					(�ַ� ���� ������ �������� ���� ����մϴ�.)
- xhr.status : ���� �ڵ带 �����ɴϴ�.
	��) 200 : ������ ������ �Ϸ������� �ƹ��� ������ ���� ���
	   404 : ������ ã�� ���ϴ� ���
	   405 : get, post �������� �ʾ��� ���(������ �� �� ���� �߻��ϴ� ����)
	   500 : �������� Ŭ���̾�Ʈ ��û�� ó�� �߿� ���� �߻��� ���
--%>
$(function() {
	function error(responseTxt, status, xhr){
		if(status == "success"){
			alert("status == success\n" + responseTxt);
		}else if(status == "error"){//���ϸ��� sample2.txt�� ������
			alert("xhr.status : " + xhr.status	//404
					+ "\n xhr.statusText : " + xhr.statusText);
		}
	}
	
	$("button").click(function() {//������ Ŭ���ϸ�
		$("button").text('�ε��Ϸ�').css('color','red');
	
		//<p>�±� ������ "sample.txt"�� ������ �ҷ��ɴϴ�.
		$("p").load("sample2.txt");
	});
});
</script>
</head>
<body>
	<button>����</button>
	<p>������ : ���� �ȹٲ���</p>
</body>
</html>