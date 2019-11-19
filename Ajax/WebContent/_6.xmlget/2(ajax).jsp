<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
<style>
	td{
		border:1px solid gray;
	}
</style>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript"> 
 $(function(){
	 $("button").click(function(){//버튼을 클릭하면
		$.ajax({
			url : "item.xml", //요청 전송 url
			dataType : "xml",//return data의 Type(에이잭스 성공 후 돌려받은 자료의 형을 정의, "json","xml","html","txt"...)
			cache : false, //cache 사용하지 않겠다.
			success : function(data){
				$("#treeData").append(	//<table>태그뒤에 추가
					"<tr><td>id</td><td>name</td>"
					+"<td>price</td><td>description</td></tr>");
				
				//서버에서 얻어온 데이터에서 셀렉터로 item 태그를 찾습니다.
				$(data).find('item').each(function() { //반복문
					//each() : 반복 하는 메서드로 item을 찾을 때마다 반복해서 아래 문장들을 수행
					var $item = $(this);
					//6개의 item태그 중 현재 처리중인 item태그를 this로 접근한 후에
					//$(this)를 사용하여 jQuery객체를 생성합니다.
					$("#treeData").append("<tr>"
					+ "<td>" + $item.attr('id') + "</td>"
					+ "<td>" + $item.attr('name') + "</td>"
					+ "<td>" + $item.find('price').text() + "</td>"
					+ "<td>" + $item.find('description').text() + "</td>" + "</tr>")
					//$item.attr('id') : 속성 id의 값을 구해옵니다.
					//$item.attr('name') : price 태그를 찾습니다.
					//$item.find('price').text() : price 태그 사이의 값을 구해옵니다.
					//$item.find('description') : description 태그를 찾습니다.
				})
				alert("아작스가 성공하였습니다.");
			},//HTTP 요청이 성공한 경우 실행할 함수
			error : function(request, status, error){
				if(status == "success"){
					alert("status == success\n" + responseTxt);
				}else if(status == "error"){//파일명을 sample2.txt로 변경해
					alert("xhr.status : " + xhr.status	//404
							+ "\n xhr.statusText : " + xhr.statusText);
				}
			},
			complete : function(){
				alert("아작스가 완료되었습니다.");
			}//요청의 실패, 성공과 상관 없이 완료 될 경우
		});//ajax end
	 });//click end
 });//ready end
</script>
</head>
<body>
<button>JSON 불러오기</button>
<table>
	<tbody id="treeData"></tbody>
</table>
</body>
</html>