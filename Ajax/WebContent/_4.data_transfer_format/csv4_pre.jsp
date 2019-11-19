<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
	td{
		border:1px solid gray;
	}
</style>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript">
/*
- jQuery.get() = $.get()
- ������ �����͸� HTTP GET������� ������ ������ ������ XML, CSV �������� �޽��ϴ�.
- $.get() �Լ��� �̿��ؼ� data.csv ������ �ҷ��ɴϴ�.
- $.get() �Լ��� ù��° �Ű��������� ������ URL �ּҸ� �����մϴ�.
- $.get() �Լ��� �ι�° �Ű������� �ݹ��Լ��� �̿��ؼ� �������� ������ csv ������
    �����͸� input���� �޽��ϴ�.
 */
$(document).ready(function(){
	$("button").click(function(){//��ư�� Ŭ���ϸ�
		$.get("data.csv", function(input){//input���� data.csv�� ������ ���
			//���پ� �ڸ��ϴ�.
			input = input.split('\n');
		
			var output = '';
			output += '<table>';
			output += '<tr><td>�̸�</td><td>����</td><td>����</td></tr>';
			for(var i = 0; i < input.length; i++){
				//��ǥ�� �������� �ڸ��ϴ�.
				input[i] = input[i].split(',');
				output += '<tr>';
				for(var j = 0; j < input[i].length; j++){
					input[i][j] = input[i][j].trim();
					output += '<td>';
					output += input[i][j];
					output += '</td>';
				}
				output += '</tr>';
			}
			output += '</table>';
			
			$("pre").empty();//���ϴ�.
			$("pre").append(output);

			/*
			$("pre").text("");
			var div = document.createElement('div');
			document.body.appendChild(div);
			$("div").html(output);
			*/
		})
	})
})
</script>
</head>
<body>
<button>������ �ҷ�����</button>
<pre>������</pre>
</body>
</html>