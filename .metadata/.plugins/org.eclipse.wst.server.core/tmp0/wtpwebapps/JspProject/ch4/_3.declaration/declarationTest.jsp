<!-- 
선언문(Declarations)
JSP페이지에서 자바 코드의 멤버 변수(필드)와 메소드를 선언하기 위해 사용합니다.
선언문을 사용해 선언된 변수는 JSP파일이 웹 컨테이너에 의해 컴파일될 때 멤버 변수로 인식되기 때문에 
JSP 페이지의 어느 위치에서도 해당 변수를 참고하는 것이 가능합니다.
C:\workspace\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\work\
Catalina\localhost\JspProject\org\apache\jsp\ch4\_005f3_declaration
 -->
<%@ page language="java" 
	contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<h1><%=getStr() %></h1>
<%!
	private String getStr(){
		str += " 테스트입니다.";
		return str;
	}
	private String str="선언문";
%>