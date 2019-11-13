<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>BeanTest1.jsp을 자바빈 액션 태그(setProperty,getProperty)로 바꿈</title>
</head>
<body>
	<h1>자바빈 예제</h1>
	<jsp:useBean id="beantest" class="javabean.BeanTest"
		scope="page" />
	
	<jsp:setProperty name="beantest" property="name"
		value="제이에스피~"/>
	<%--
		beantest.setName("제이에스피~");를 의미한다.
	 --%>
	<h3><jsp:getProperty name="beantest" property="name"/></h3>
</body>
</html>