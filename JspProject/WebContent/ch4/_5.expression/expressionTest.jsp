<%--
	표현식(Expression)
	선언문 또는 스크립트릿 태그에서 선언된 변수나 매서드의 리턴값을 출력하기 위해
	사용되는 방법입니다.
	웹 컨테이너에 의해 _jspService() 메소드 내부에 출력 객체의
	print() 메소드 괄호안에
	통째로 들어가므로 scriptlet과는 달리 세미콜론을 사용해서는 안됩니다.
	형식)<%=변수 %>
		<%=리턴값이 있는 메소드 %>
		<%=수식 %>
--%>

<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%!
	//1부터 100까지의 합을 구하는 sum()메서드를 선언
	public int sum(){
		int total = 0;
		for (int i = 1; i <= 100; i++){
			total += i;
		}
		return total;
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
b{color: red;}
</style>
</head>
<body>
<h1>1부터 100까지의 합은 <b><%=sum() %></b>입니다.</h1>
<br>
<h1>1부터 100까지의 합에 3을 곱하면 <b><%=sum() * 3 %></b>이 됩니다.</h1>
<br>
<h1>1부터 100까지의 합을 1000으로 나누면 <b><%=sum() / 1000.0 %></b>가 됩니다.</h1>
</body>
</html>