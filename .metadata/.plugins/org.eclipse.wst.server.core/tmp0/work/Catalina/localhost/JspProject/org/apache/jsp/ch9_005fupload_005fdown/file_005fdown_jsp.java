/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.47
 * Generated at: 2019-11-13 08:35:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.ch9_005fupload_005fdown;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.File;
import java.io.*;
import java.net.*;

public final class file_005fdown_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.net");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("java.io");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.io.File");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=EUC-KR");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;


	request.setCharacterEncoding("euc-kr");
	String fileName = request.getParameter("file_name");
	System.out.println("fileName = " + fileName);
	
	String savePath = "upload";
	
	//서블릿의 실행 환경 정보를 담고 있는 객체를 리턴합니다.
	//(application 내장 객체를 리턴합니다.)
	ServletContext context = pageContext.getServletContext();
	String sDownloadPath = context.getRealPath(savePath);
	//위 두 문장을 한 문장으로 나타내면 다음과 같습니다.
	//String sDownloadPath = application.getRealPath(savePath)
	
	//String sFilePath = sDownloadPath + "\\" + fileName; //"\"
	String sFilePath = sDownloadPath + "/" + fileName;
	System.out.println(sFilePath);
	
	byte b[] = new byte[4096];
	
	//sFilePath에 있는 파일의 MimeType을 구해옵니다.
	String sMimeType = context.getMimeType(sFilePath);
	System.out.println("sMimeType>>>" + sMimeType);
	
	/*
	  Content-Type: 전송되는 Content가 어떤 유형인지 알려주는 목적을 가지고 있습니다.
	  text/html, image/png, application/octet-stream 등의 값을 가집니다.
	  Content-Type을 통해서 브라우저는 해당 데이터를 어떻게 처리해야 할 지 판단할 수 
	   있게 됩니다.
	  예)- image/png: 브라우저는 해당 컨텐트를 이미지로써 간주하게 됩니다.
		- application/octet-stream: 미확인 Binary 정보를 의미하며,
		   이 경우 브라우저는 파일을 다운로드하는 형태로 동작합니다.
		- text/javascript: 브라우저는 Content를 Javascript문서로 취급하게 됩니다.
	*/
	
	/*
	  - octat-stream은 8비트로 된 일련의 데이터를 뜻합니다.
	  - 지정되지 않은 파일 형식을 의미합니다.
	*/
	if(sMimeType == null) sMimeType = "application/octet-stream";
	  
	response.setContentType(sMimeType);
	
	/*
	  - 이 부분의 한글 파일명이 깨지는 것을 방지해 줍니다.
	  - getBytes(캐릭터셋) : 자바 내부에 관리되는 유니코드 문자열을 인자로 지정된
	       캐릭터셋의 바이트 배열로 반환하는 메서드입니다.
	  - String(byte[] bytes, Charset charset)
	    new String(바이트배열, 캐릭터셋) 생성자 : 해당 바이트 배열을 주어진
	        캐릭터 셋으로 간주하여 스트링을 만드는 생성자입니다.
	*/
	String sEncoding =
	 new String(fileName.getBytes("euc-kr"),"ISO-8859-1");
	System.out.println(sEncoding);
	/*
	  - Content-Disposition: Content가 어떻게 처리되어야 하는지 나타냅니다.
	    1) Content-Disposition:
	       inline: 브라우저가 Content를 즉시 출력해야 함을 나타냅니다.
	       	이미지인 경우 브라우저 내에서 즉시 출력하며, 문서인 경우 텍스트로 출력합니다.
	    2) Content-Disposition:
	    	attachment: 브라우저는 해당 Content를 처리하지 않고,
	    	다운로드하게 됩니다.
	*/
	response.setHeader("Content-Disposition",
			"attachment; filename= " + sEncoding);
	/*
	 response.setHeader("Content-Dispostion",
			 "inline; filename= " + sEncoding);
	*/

//ServletOutputStream so = response.getOutputStream();
	try(
			//웹 브라우저로의 출력 스트림 생성합니다.
		BufferedOutputStream out2 = 
			new BufferedOutputStream(response.getOutputStream());
			
			//sFilePath로 지정한 파일에 대한 입력 스트림을 생성합니다.
		BufferedInputStream in =
			new BufferedInputStream(new FileInputStream(sFilePath));
			){
		int numRead;
		
		//read(b, 0, b.length) : 바이트 배열 b의 0번 부터 b.length
		//크기 만큼 읽어옵니다.
		while((numRead = in.read(b, 0, b.length)) != -1){//읽을 데이터가 존재하는 경우
									//바이트 배열 b의 0번 부터 numRead크기 만큼 브라우저로 출력
			out2.write(b, 0, numRead);			
		}
	}catch(Exception e){
		e.printStackTrace();
	}

    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}