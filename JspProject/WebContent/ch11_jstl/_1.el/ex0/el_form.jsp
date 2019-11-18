<%--
	* ǥ�����(Expression Language:EL)
	    ��Ĺ���� �����ϱ� ������ ���� ������ �ʿ� �����ϴ�.
	  JSP ��ũ��Ʈ ����Ͽ� �Ӽ� ������ �� �� ���ϰ� ����ϱ�
	    ���� �����Ǵ� ����Դϴ�.
	    ����) ${ }
	    
	    ǥ���� �±�
	  1. <%=article.getID()%>	//article - �ڹٺ�
	  2. <%=session.getAttribute("test")%>
	  3. <%=request.getParameter("name")%>
	  4. <%=request.getParameterValues("hobby")%>
	  5. <%=request.getAttribute("hoho")%>
	  
	    ǥ�����(EL)
	  1. ${article.id} �Ǵ� ${article["id"]}
	  				       �Ǵ� ${article['id']}
	  2. ${sessionScope.test}
	  3. ${param.name}
	  4. ${paramValues.hobby} ����� ��Ʈ�� �迭(String[])
	  	  ���ʴ�� ����� ���
	  	 - ${paramValues.hobby[0]}
	  	 - ${paramValues.hobby[1]}
	  	 - ${paramValues.hobby[2]}
	  5. ${requestScope.hoho}
	  	  �Ǵ�
	  	 ${hoho} :
	  	  �� ��쿡��
	  	 page -> request -> session -> application ���� ������
	  	 'hoho' �̸��� attribute�� ã���ϴ�.
 --%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>EL ����</title>
<link rel="stylesheet"
 	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
	<form action="el_result.jsp" method="post">
	<h3>EL ����</h3>
	<table class="table table-bordered">
		<tr>
			<td>�̸�</td>
			<td><input type="text" name="name" value="ȫ�浿"></td>
		</tr>
		<tr>
			<td>���</td>
			<td>
				<input type="checkbox" name="hobby"
						id="hobby1" value="����">����
				<input type="checkbox" name="hobby"
						id="hobby2" value="���">���
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
			<input type="submit" value="�Է�"></td>
		</tr>
	</table>
	</form>
</div>
</body>
</html>