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
	alert('<%=id%>�� ȯ���մϴ�.');
	location.href = "templatetest.jsp";
</script>
<% 	
} else if (id.equals(inputid)){
%>
<script>
	alert("��й�ȣ�� Ȯ���ϼ���.");
	history.back();
</script>
<% 
} else {
%>
<script>
	alert('���̵� Ȯ���ϼ���.');
	history.back();
</script>
<%
	} 
%>
</body>
</html>