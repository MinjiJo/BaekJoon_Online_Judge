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
/*
JSON(JavaScript Object Notation)은 자바스크립트에서 사용하는 객체 형태로 데이터를  표현하는 방법이며 Ajax를 사용할 때 거의 표준으로 사용되는 
    데이터 표현 방식입니다.
   - 문자열은 무조건 큰 따옴표(")를 사용합니다. 작은 따옴표(')는 안됩니다.
   - JSON은 키와 값을 쌍으로 가지는 구조입니다. 
   - 배열을 사용할 때는 대괄호([ ])안에 중괄호({ })를 사용하여 조합합니다.
   - 각 키/값의 쌍은 콤마로 구분합니다. 
    예) 두 개의 객체(리터널 {} 사용)를 배열 리터널 []를 이용하여 저장합니다.
   [
     {
      "name" : "홍 길동",
      "loc" : "서울시",
      "age" : "25세"
     },
     {
      "name" : "신사임당",
      "loc" : "울산시",
      "age" : "45세"
     }  
  ]          
   장점) 
      - 데이터의 가독성이 좋습니다.
      - HTML/XML보다는 간결합니다.
   단점)    
      - 데이터의 양이 엄청나게 많아지면 데이터 추출 속도가 현저하게 떨어집니다.
      - 문법에 예민해서 문법에 맞지 않으면 파일 전체를 처리하지 못하게 됩니다.
- jQuery에서는 JSON으로 표현한 데이터를 파일에 저장해 두었다가 필요할 때
     이를 로드할 수 있는 $.getJSON()메서드를 제공합니다.
     
- 서버로부터 get방식의 요청을 하고, 응답을 JSON형식으로 받기 위해서
  $.getJSON()메서드를 사용합니다.
- $.getJSON()메서드의 첫번째 매개변수는 서버의 URL주소를 지정합니다.
  ('item.json')
- 서버로 요청이 성공적으로 완료되면,
    두번째 매개변수로 기술한 콜백함수가 호출됩니다.
  (function(data, textStatus))
    콜백함수의 첫번째 매개변수인 data는 서버에서 돌려받은 JSON 객체 형식의 데이터이고,
    두번째 매개변수인 textStatus는 성공일 때 "success"라는 문자열이 전달됩니다.
    
    자바스크립트의 JSON객체는 JSON데이터를 자바스크립트 객체로 변환할 수 있습니다.
    또한 자바스크립트 객체를 문자열로 변환하기도 합니다.
  - JSON.stringfv()메서드는 자바스크립트 객체를 JSON형식의 문자열로 변환합니다.
    이를 이용해서 자바스크립트 객체를 브라우저로부터 다른 애플리케이션으로 전송할 수 있습니다.
  - JSON.parse()메서드는 JSON데이터를 브라우저가 사용할 수 있는 자바스크립트
    객체로 변환합니다.
 */
 
 $(function(){
	 $("button").click(function(){//버튼을 클릭하면
		$.ajax({
			url : "item.json", //요청 전송 url
			dataType : "json",//return data의 Type(에이잭스 성공 후 돌려받은 자료의 형을 정의, "json","xml","html","txt"...)
			cache : false, //cache 사용하지 않겠다.
			success : function(data){
				$("#treeData").append(	//<table>태그뒤에 추가
					"<tr><td>id</td><td>name</td>"
					+"<td>price</td><td>description</td></tr>");
					 
				$.each(data, function(index, item) { //반복문
					$('#treeData').append("<tr>"
					+ "<td>" + this.id + "</td>"
					+ "<td>" + this.name + "</td>"
					+ "<td>" + this.price + "</td>"
					+ "<td>" + this.description + "</td>" + "</tr>")
				})
				alert("아작스가 성공하였습니다.");
			},//HTTP 요청이 성공한 경우 실행할
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