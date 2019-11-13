<%--ServletContext�� �̿��� ���� --%>
<%@ page contentType="text/html; charset=EUC-KR"%>
<%@ page import="java.io.File" %>
<%@ page import="java.io.*" %>
<%@ page import="java.net.*" %>

<%--htmlȭ�鿡�� jsp�������� ���� ���ִ� JSP�ڵ� --%>
<%@ page trimDirectiveWhitespaces="true" %>

<%
	request.setCharacterEncoding("euc-kr");
	String fileName = request.getParameter("file_name");
	System.out.println("fileName = " + fileName);
	
	String savePath = "upload";
	
	//�������� ���� ȯ�� ������ ��� �ִ� ��ü�� �����մϴ�.
	//(application ���� ��ü�� �����մϴ�.)
	ServletContext context = pageContext.getServletContext();
	String sDownloadPath = context.getRealPath(savePath);
	//�� �� ������ �� �������� ��Ÿ���� ������ �����ϴ�.
	//String sDownloadPath = application.getRealPath(savePath)
	
	//String sFilePath = sDownloadPath + "\\" + fileName; //"\"
	String sFilePath = sDownloadPath + "/" + fileName;
	System.out.println(sFilePath);
	
	byte b[] = new byte[4096];
	
	//sFilePath�� �ִ� ������ MimeType�� ���ؿɴϴ�.
	String sMimeType = context.getMimeType(sFilePath);
	System.out.println("sMimeType>>>" + sMimeType);
	
	/*
	  Content-Type: ���۵Ǵ� Content�� � �������� �˷��ִ� ������ ������ �ֽ��ϴ�.
	  text/html, image/png, application/octet-stream ���� ���� �����ϴ�.
	  Content-Type�� ���ؼ� �������� �ش� �����͸� ��� ó���ؾ� �� �� �Ǵ��� �� 
	   �ְ� �˴ϴ�.
	  ��)- image/png: �������� �ش� ����Ʈ�� �̹����ν� �����ϰ� �˴ϴ�.
		- application/octet-stream: ��Ȯ�� Binary ������ �ǹ��ϸ�,
		   �� ��� �������� ������ �ٿ�ε��ϴ� ���·� �����մϴ�.
		- text/javascript: �������� Content�� Javascript������ ����ϰ� �˴ϴ�.
	*/
	
	/*
	  - octat-stream�� 8��Ʈ�� �� �Ϸ��� �����͸� ���մϴ�.
	  - �������� ���� ���� ������ �ǹ��մϴ�.
	*/
	if(sMimeType == null) sMimeType = "application/octet-stream";
	  
	response.setContentType(sMimeType);
	
	/*
	  - �� �κ��� �ѱ� ���ϸ��� ������ ���� ������ �ݴϴ�.
	  - getBytes(ĳ���ͼ�) : �ڹ� ���ο� �����Ǵ� �����ڵ� ���ڿ��� ���ڷ� ������
	       ĳ���ͼ��� ����Ʈ �迭�� ��ȯ�ϴ� �޼����Դϴ�.
	  - String(byte[] bytes, Charset charset)
	    new String(����Ʈ�迭, ĳ���ͼ�) ������ : �ش� ����Ʈ �迭�� �־���
	        ĳ���� ������ �����Ͽ� ��Ʈ���� ����� �������Դϴ�.
	*/
	String sEncoding =
	 new String(fileName.getBytes("euc-kr"),"ISO-8859-1");
	System.out.println(sEncoding);
	/*
	  - Content-Disposition: Content�� ��� ó���Ǿ�� �ϴ��� ��Ÿ���ϴ�.
	    1) Content-Disposition:
	       inline: �������� Content�� ��� ����ؾ� ���� ��Ÿ���ϴ�.
	       	�̹����� ��� ������ ������ ��� ����ϸ�, ������ ��� �ؽ�Ʈ�� ����մϴ�.
	    2) Content-Disposition:
	    	attachment: �������� �ش� Content�� ó������ �ʰ�,
	    	�ٿ�ε��ϰ� �˴ϴ�.
	*/
	response.setHeader("Content-Disposition",
			"attachment; filename= " + sEncoding);
	/*
	 response.setHeader("Content-Dispostion",
			 "inline; filename= " + sEncoding);
	*/

//ServletOutputStream so = response.getOutputStream();
	try(
			//�� ���������� ��� ��Ʈ�� �����մϴ�.
		BufferedOutputStream out2 = 
			new BufferedOutputStream(response.getOutputStream());
			
			//sFilePath�� ������ ���Ͽ� ���� �Է� ��Ʈ���� �����մϴ�.
		BufferedInputStream in =
			new BufferedInputStream(new FileInputStream(sFilePath));
			){
		int numRead;
		
		//read(b, 0, b.length) : ����Ʈ �迭 b�� 0�� ���� b.length
		//ũ�� ��ŭ �о�ɴϴ�.
		while((numRead = in.read(b, 0, b.length)) != -1){//���� �����Ͱ� �����ϴ� ���
									//����Ʈ �迭 b�� 0�� ���� numReadũ�� ��ŭ �������� ���
			out2.write(b, 0, numRead);			
		}
	} catch(Exception e) {
		e.printStackTrace();
	}
%>