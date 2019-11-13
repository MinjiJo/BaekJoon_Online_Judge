<%--
	JSP ���þ�(Directive)
	����) <%@		.....	%>
	   JSP ���� ������ JSP�� ������ �����̳ʿ��� �ش� �������� ���
	   ó���� ���ΰ��� ���� ���� �������� ������ �ִµ� ���˴ϴ�.
	���þ��� ����)
	   page ���þ�, include ���þ�, taglib ���þ�
	   - page ���þ�� JSP �������� ���� �Ӽ��� �����ϴ� ���þ�
	           ����) <%@ page �Ӽ�=�� ..... %>
	           
	   - include ���þ�� Ư���� JSP���� �Ǵ� HTML ������ �ش� JSP��������
	           ������ �� �ֵ��� �ϴ� ����� �����ϴ� ���þ��Դϴ�.
	           ����) <%@ include file="���ϰ��" %>
	           
	   - taglib ���þ�� JSTL(JSP Standard Tag Library)�̳�
	   	  Ŀ���� �±� �� �±� ���̺귯���� JSP���� ����� ��
	   	  ���λ縦 �����ϱ� ���� ���˴ϴ�.
	   	  ����) <%@ taglib uri="http://taglib.com/sampleURI"
	   	  				 prefix="samplePrefix" %>
 --%>
<%@ page language="java" 
		 contentType="text/html; charset=EUC-KR"
    	 pageEncoding="EUC-KR"%>
<%-- 1. contentType :
		JSP�������� �����ϴ� ������ ������ �� ������ �� �������� ������ ��
		���Ǵ� ���ڵ� Ÿ���Դϴ�.
		������ ������ ������ ������ ���°� ��� MIME�������� �Ǿ� �ִ���
		�����ϴ� �Ӽ��Դϴ�.
		
		MIME(Multipurpose Internet Mail Extensions)��
		���ͳ��� ���� ������ �ְ� ���� �� ���Ǵ� ���� ������ ������ ���� ���Դϴ�.
		���� text/html, image/gif, video/avi �� ���� ���� Ÿ���� �����մϴ�.
		
	 2. charset=EUC-KR�� ������ �� �ֽ��ϴ�.
	 	������ ��� �⺻ ĳ���ͼ��� ISO-8859-1�� ����ϰ� �˴ϴ�.
	 
	 3. pageEncoding :
	 	���� �������� ���� ���ڵ� ����� ������ �� ����ϴ� �Ӽ��Դϴ�.
	 	�� �Ӽ��� ����Ǿ� ���� ������ contentType �Ӽ����� ������
	 	���� �ڵ�� JSP������ �о� ���Դϴ�.		
--%>
<!DOCTYPE html>
<%-- SimpleDateFormatŬ���� ��� ���� import
	 import �Ӽ� : JSP ���������� ����� Ŭ����(�������̽�) ����
--%>
<%@ page import="java.text.SimpleDateFormat"%>

<%-- DateŬ���� ������� import --%>
<%@ page import="java.util.*"%>

<%-- �� �� ������ �� �������� ��Ÿ���� ������ �����ϴ�. �޸��� �����ؼ� �ۼ��մϴ�.
<%@page import="java.text.SimpleDateFormat, java.util.*"%>
--%>
<html>
	<head>
		<title>import �Ӽ� �׽�Ʈ</title>
	</head>
	<body>
		<h1> ���� �ð���
		<%=new SimpleDateFormat().format(new Date()) %>�Դϴ�.</h1>
	</body>
</html>