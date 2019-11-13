<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>loginSuccess</title>
<style>
div{color:green;}
</style>
</head>
<body>

<%
String id = application.getInitParameter("id"); 
String password = application.getInitParameter("password");
String inputid = request.getParameter("id");
String inputpassword = request.getParameter("passwd");

if(id.equals(inputid) && password.equals(inputpassword)){ 
	session.setAttribute("id",id);
%>
<script>
	alert('<%=id%>님 환영합니다.');
	location.href = "templatetest.jsp";
</script>
<% 	
} else if (id.equals(inputid)){
%>
<script>
	alert("비밀번호를 확인하세요.");
	history.back();
</script>
<% 
} else {
%>
<script>
	alert('아이디를 확인하세요.');
	history.back();
</script>
<%
	} 
%>
</body>
</html>