<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script>
	$(document).ready(function(){
		//데이터를 보여주는 함수
		function selectData(m){
			
			var senddata = $("#insert_form").serialize();
			$('#output').empty();
			//Ajax를 수행합니다.
			$.ajax({
				type: m, //"get", "post" - 전송방식
				url : '../../servlet.bo',
				data : senddata, //보낼 데이터
				dataType : 'json',
				success : function(rdata){
					var output = '';
					$(rdata).each(function(index, item){
						output += '<tr>';
						output += '	<td>' + item.id + '</td>';
						output += '	<td>' + item.name + '</td>';
						output += '	<td>' + item.modelnumber + '</td>';
						output += '	<td>' + item.series + '</td>';
						output += '</tr>';
					});//each end
						$('#output').append(output);
				}//success end
				,error:function(){
					console.log("오류 발생");
				}
			})
		}//function end
		
		//초기 화면에 데이터를 표시합니다.
		selectData("get");
		
		//데이터를 추가합니다.
		$("#insert_form").submit(function(e){
			selectData("post");
			//기본 이벤트를 제거합니다.
			e.preventDefault();
		});//submit end;
	})
</script>
</head>
<body>
<div>
	<form id="insert_form">
	<table>
		<tr>
			<td><label>상품명</label></td>
			<td><input type="text" name="name" id="name" required></td>
		</tr>
		
		<tr>
			<td><label>모델 번호</label></td>
			<td><input type="text" name="modelnumber" id="modelnumber" required></td>
		</tr>
		
		<tr>
			<td><label>시리즈</label></td>
			<td><input type="text" name="series" id="series" required></td>
		</tr>
	</table>
	<input type="submit" value="추가">
	</form>
</div>
<table border="1">
	<thead>
		<tr><th>아이디</th><th>상품명</th><th>모델번호</th><th>시리즈</th></tr>
	</thead>
	<tbody id="output">
	</tbody>
</table>
</body>
</html>