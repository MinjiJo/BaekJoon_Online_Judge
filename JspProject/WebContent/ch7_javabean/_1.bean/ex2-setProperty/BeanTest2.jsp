<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>BeanTest1.jsp�� �ڹٺ� �׼� �±�(setProperty,getProperty)�� �ٲ�</title>
</head>
<body>
	<h1>�ڹٺ� ����</h1>
	<jsp:useBean id="beantest" class="javabean.BeanTest"
		scope="page" />
	
	<jsp:setProperty name="beantest" property="name"
		value="���̿�����~"/>
	<%--
		beantest.setName("���̿�����~");�� �ǹ��Ѵ�.
	 --%>
	<h3><jsp:getProperty name="beantest" property="name"/></h3>
</body>
</html>