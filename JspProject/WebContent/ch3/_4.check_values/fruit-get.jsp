<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
body{background: black}
table{background:yellow; margin:0 auto}
td{color:red; font-size:20px; text-align:center; width=120px}
</style>
</head>
<body>
<table>
	<tr height=50px>
	<%
	String[] name = request.getParameterValues("fruit");
	for(int i = 0; i < name.length; i++){
	%>
		<td width=120px><%=name[i]%></td>
	<%
	}
	%>
	</tr>
	<tr height=120px>
	<%
	for(int i = 0; i < name.length; i++) {
		String src=name[i];
		%>
		<td width=120px><img src='<%=src %>' width='100px' height='100px'></td>
	<%
	}
	%>
	</tr>
</table>

<br><br>


<table>
<tr height=50px>
<%
for(int i = 0; i < name.length; i++) {
	out.println("<td width=120px>" + name[i] + "</td>");
}
	out.print("</tr><tr height=120px>");
for(int i = 0; i < name.length; i++) {
	out.println("<td width=120px><img src='" + name[i] + "' width='100px' height='100px'></td>");
}
%>
</tr>
</table>
</body>
</html>