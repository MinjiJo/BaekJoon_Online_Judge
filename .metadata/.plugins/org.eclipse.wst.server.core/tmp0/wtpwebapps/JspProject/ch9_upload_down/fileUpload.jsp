<%-- webContent ���� �Ʒ� upload ���� ���� �� �����ϼ���~ --%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"%>

<%-- ���ε��ϱ� ���� MultipartRequest ��ü�� import�մϴ�. --%>
<%@ page import="com.oreilly.servlet.MultipartRequest" %>

<%-- ���� �̸� �ߺ� ó���� �ϱ� ���� DefaultFileRenamePolicy ��ü�� import �մϴ�. --%>
<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy" %>
<%@ page import="java.util.*" %>
<%
	String uploadPath = application.getRealPath("upload");
	out.print(uploadPath);
	
	int size = 10*1024*1024; //���� �ִ� ũ�⸦ 10MB�� �����մϴ�.
	String name="";
	String subject="";
	String filename1="";
	String filename2="";
	String origfilename1="";
	String origfilename2="";
	
	try{
		//���ε带 ����ϴ� �κ��Դϴ�.
		//ù ��° ���� request : ������ ������ ���� ��� ���� request��ü�� ������ �ݴϴ�.
		//�� ��° ���� uploadPath : ���ε�� ������ ��ġ �Դϴ�.
		//�� ��° ���� size : ���ε� �� ũ���̸� ���� ũ�⺸�� ũ�� Exception�߻��մϴ�.
		//�� ��° ���� "euc-kr" : ���� �̸��� �ѱ��� ��� ó���ϴ� �κ��Դϴ�.
		//�ټ� ��° ���� : �Ȱ��� ������ ���ε� �� ��� �ߺ����� �ʵ��� �ڵ�����
		//�����̸��� ��ȯ���ִ� ����� �մϴ�.
		MultipartRequest multi=new MultipartRequest(request,
							uploadPath,
							size,
							"euc-kr",
				new DefaultFileRenamePolicy());
	
		name=multi.getParameter("name");
		subject=multi.getParameter("subject");
	
		//������ �Ѿ�� ���� �̸����� ���ؿɴϴ�.
		Enumeration files=multi.getFileNames();
		
		//ù��° ���� �̸��� ��� �ɴϴ�.
		String file1 = (String)files.nextElement();
		
		//ù��° ���ε�� ������ �ý��� �� ���ε�� ���� ���ϸ��� ��� �ɴϴ�.
		filename1 = multi.getFilesystemName(file1);
		
		//ù��° ���ε�� ������ ���� ���ϸ��� ��� �ɴϴ�.
		origfilename1 = multi.getOriginalFileName(file1);
		
		//�ι�° ���� �̸��� ��� �ɴϴ�.
		String file2 = (String)files.nextElement();
		filename2 = multi.getFilesystemName(file2);
		origfilename2 = multi.getOriginalFileName(file2);
	}catch(Exception e){
		//e.printStackTrace();
		out.print("�����Դϴ�.");
	}
%>
<html>
<body>
<form name="filecheck" action="fileCheck.jsp" method="post">
	<input type="hidden" name="name" value="<%=name %>">
	<input type="hidden" name="subject" value="<%=subject %>">
	<input type="hidden" name="filename1" value="<%=filename1 %>">
	<input type="hidden" name="filename2" value="<%=filename2 %>">
	<input type="hidden" name="origfilename1" value="<%=origfilename1 %>">
	<input type="hidden" name="origfilename2" value="<%=origfilename2 %>">
	<input type="submit" value="���ε� Ȯ�� �� �ٿ�ε� ������ �̵�">
</form>
</body>
</html>