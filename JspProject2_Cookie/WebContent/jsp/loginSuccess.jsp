<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�α��� ����</title>
</head>
<body>
	<%
		String id = (String) session.getAttribute("id");
		if(id != null && !id.equals("")) {
	%>
	<%=id %>�� �α��ο� �����ϼ̽��ϴ�.
	<br>
	<ul>
		<li><a href="<%=request.getContextPath() %>/logout_cookie">�α׾ƿ�</a>
		</li>
		<li><a href="<%=request.getContextPath() %>/info">����������</a>
		</li>
		<%
			if (id.equals("admin")){
		%>
		<li><a href="<%=request.getContextPath() %>/all">��� ȸ�� ���� ����</a>
		</li>
		<%
			}
		%>
	</ul>
<%
		} else {
			response.sendRedirect("cookielogin");
		}
%>
</body>
</html>