<%-- webContent ���� �Ʒ� upload ���� ���� �� �����ϼ���~ --%>
<%-- 
   �Ϲ� �Ķ���͸� ������ �� ����ϴ� ���ڵ��� ������ ���ε� �� �� ����ϴ�
   ���ڵ��� �ٸ��ϴ�.
   ��Ʈ�� ����� ���� ����� POST����� ������ �� ���� ���ڵ� ��Ŀ�
   ���� �����ϴ� ������ ������ �޶����ϴ�.
  1. application/x-www-form-urlencoded
  2. multipart/form-data
  
   ���ݱ����� �������� 1�� ���ڵ��� ����ؼ� �����͸� �����߽��ϴ�.
   ������ ���ε� �ϱ� ���ؼ��� 2�� ���ڵ��� ����ؾ� �մϴ�.
   form �±��� enctype �Ӽ� ���� "multipart/form-data"�� �������ָ�
   �˴ϴ�. method�� post��� �Դϴ�. 
 --%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>File Upload</title>
<link rel="stylesheet"
 	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
<%--������ ���ε��ϱ� ���ؼ� enctype �Ӽ��� "multipart/form-data"�� �����մϴ�. --%>
<form action="fileUpload2.jsp" method="post"
	  enctype="multipart/form-data">
	<table border=1 class="table-bordered table-striped table-hover">
		<tr class="yellow">
			<td colspan=2 class="center pad"><h3>���� ���ε� ��</h3>
		</tr>
		<tr>
			<td>�ø� ���</td><td><input type="text" name="name"></td>
		</tr>
		<tr>
			<td>����</td><td><input type="text" name="subject"></td>
		</tr>
		<tr>
			<td>���ϸ�1</td>
			<td><input type="file" name="fileName1">
			<!-- ������ �����Ͽ� ������ �� �ֵ��� type�Ӽ��� file�� �����մϴ�. -->
			</td>
		</tr>
		<tr>
			<td>���ϸ�2</td>
			<td><input type="file" name="fileName2"></td>
		</tr>
		<tr>
			<td colspan=2 class="center green">
			<input type="submit" value="����"></td>
		</tr>
	</table>
</form>
</body>
</html>