<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<%
	String language = "korea";

	//header의 이름 중에서 cookie의 값을 가져옵니다.
	String cookie = request.getHeader("Cookie");
	
	//쿠키가 존재하는지 확인합니다.
	if(cookie!=null){
		//존재하는 쿠키들을 배열로 가져옵니다.
		Cookie cookies[] = request.getCookies();
		
		//쿠키의 이름이 "language1"인 값을 찾기 위해 쿠키 배열들을 모두 확인합니다.
		for(int i=0;i<cookies.length;i++){
			if(cookies[i].getName().equals("language1")){
				language = cookies[i].getValue();				
			}
		}
		out.println(language);
	} 
%>
<meta charset="EUC-KR">
<title>쿠키를 이용한 화면 설정 예제</title>
<style>
	body{margin:100px auto; text-align:center; width:500px}
	fieldset{width:100%;}
</style>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script>
$(function(){
	<%-- var id = "#<%=language%>"; --%>
	var id = "input[value='<%=language%>']"
	$(id).prop('checked',true);
})
</script>
</head>
<body>
	<%
		if (language.equals("korea")) {
	%>
	<h3>안녕하세요. 이것은 쿠키 예제입니다.</h3>
	<%
		} else {
	%>
	<h3>Hello. This is Cookie example.</h3>
	<%		
		}
	%>
<form action="cookieExample2.jsp" method="post">
	<fieldset>
		<input type="radio" name="language" value="korea"
			   id="korea">한국어 페이지 보기
				
		<input type="radio" name="language" value="english"
			   id="english">영어 페이지 보기
				
		<input type="submit" value="설정">
	</fieldset>
</form>
</body>
</html>