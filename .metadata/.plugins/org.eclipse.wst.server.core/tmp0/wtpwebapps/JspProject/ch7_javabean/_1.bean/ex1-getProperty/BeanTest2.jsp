<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "javabean.BeanTest" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>BeanTest</title>
</head>
<body>
	<h1>�ڹٺ� ����</h1>
	<jsp:useBean id="beantest" class="javabean.BeanTest"
				 scope="page" />
	<%-- id   �Ӽ� : JSP���� �ڹٺ� ��ü�� ������
		class �Ӽ� : �ڹٺ� ���� �Ծ࿡ �°� �ۼ��� Ŭ�������� ���� �־�� �մϴ�.
				       Ŭ������ ��Ű�� �ȿ� �ۼ��Ǿ� �ִٸ� ��Ű�� ��α��� ���� �־�� �մϴ�.
		scope �Ӽ� : ��� ������ page(�⺻��-pageContext��ü),
					request, session, application �� ����
					
		���� �±״� ������ ���� ����� �ǹ��Դϴ�.
		javabean.BeanTest beantest = new javabean.BeanTest();
		pageContext.setAttribute("beantest", beantest);
	--%>
	<h3><%=beantest.getName() %></h3>
</body>
</html>