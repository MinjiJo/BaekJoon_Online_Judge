<%--
	ǥ����(Expression)
	���� �Ǵ� ��ũ��Ʈ�� �±׿��� ����� ������ �ż����� ���ϰ��� ����ϱ� ����
	���Ǵ� ����Դϴ�.
	�� �����̳ʿ� ���� _jspService() �޼ҵ� ���ο� ��� ��ü��
	print() �޼ҵ� ��ȣ�ȿ�
	��°�� ���Ƿ� scriptlet���� �޸� �����ݷ��� ����ؼ��� �ȵ˴ϴ�.
	����)<%=���� %>
		<%=���ϰ��� �ִ� �޼ҵ� %>
		<%=���� %>
--%>

<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%!
	//1���� 100������ ���� ���ϴ� sum()�޼��带 ����
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
<h1>1���� 100������ ���� <b><%=sum() %></b>�Դϴ�.</h1>
<br>
<h1>1���� 100������ �տ� 3�� ���ϸ� <b><%=sum() * 3 %></b>�� �˴ϴ�.</h1>
<br>
<h1>1���� 100������ ���� 1000���� ������ <b><%=sum() / 1000.0 %></b>�� �˴ϴ�.</h1>
</body>
</html>