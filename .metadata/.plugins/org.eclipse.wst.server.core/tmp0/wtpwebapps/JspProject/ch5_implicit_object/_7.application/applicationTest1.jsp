<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
<link rel="stylesheet"
 	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
<%--application ��ü�� �� ���ø����̼� ���ݿ� ���ļ� ���Ǵ� ������ ��� �ֽ��ϴ�. --%>
<div class="container">
<h2>application �׽�Ʈ</h2>
<table class="table table-striped">
	<tr>
		<td>Servlet API������ ����</td>
		<td><%=application.getMajorVersion() %>.
			<%=application.getMinorVersion() %></td>
	</tr>
	<tr>
		<td>�����̳� �̸��� ����</td>
		<td><%=application.getServerInfo() %></td>
	</tr>
	<tr>
		<td>�� ���ø����̼��� ���� ���Ͻý��� ���</td>
		<td><%=application.getRealPath("/") %></td>
	</tr>
</table>
</div>
</body>
</html>