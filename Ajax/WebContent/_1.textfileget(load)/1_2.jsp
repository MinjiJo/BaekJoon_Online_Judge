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
- responseTxt: 서버로부터 리턴된 텍스트 데이터를 가져옵니다.
- status: 서버로부터의 리턴된 상태를 가져옵니다.
	(성공인 경우 "success", 실패한 경우 "error")
- xhr: XMLHttpRequest 객체를 포함합니다.
- xhr.statusText : 상태 설명 문자열을 가져 옵니다.
					(주로 오류 내용을 가져오기 위해 사용합니다.)
- xhr.status : 상태 코드를 가져옵니다.
	예) 200 : 서버가 응답을 완료했으며 아무런 문제가 없는 경우
	   404 : 파일을 찾지 못하는 경우
	   405 : get, post 맞춰주지 않았을 경우(스프링 할 때 자주 발생하는 오류)
	   500 : 서버에서 클라이언트 요청을 처리 중에 에러 발생한 경우
--%>
$(function() {
	function error(responseTxt, status, xhr){
		if(status == "success"){
			alert("status == success\n" + responseTxt);
		}else if(status == "error"){//파일명을 sample2.txt로 변경해
			alert("xhr.status : " + xhr.status	//404
					+ "\n xhr.statusText : " + xhr.statusText);
		}
	}
	
	$("button").click(function() {//변경을 클릭하면
		$("button").text('로딩완료').css('color','red');
	
		//<p>태그 영역에 "sample.txt"의 내용을 불러옵니다.
		$("p").load("sample2.txt");
	});
});
</script>
</head>
<body>
	<button>변경</button>
	<p>변경전 : 줄이 안바뀌어요</p>
</body>
</html>