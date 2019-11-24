<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%-- 업로드하기 위해 MultipartRequest 객체를 import합니다. --%>
<%@ page import="com.oreilly.servlet.MultipartRequest" %>

<%-- 파일 이름 중복 처리를 하기 위해 DefaultFileRenamePolicy 객체를 import 합니다. --%>
<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy" %>
<%@ page import="java.util.*" %>
<html>
<head>
	<jsp:include page="header.jsp" />
	<script src="js/writeform.js" charset="utf-8"></script>
	<style>
		tr.center-block {text-align:center}
		h1{font-size:1.5rem; text-align:center; color:#1a92b9}
		.container{width:60%}
		label{font-weight:bold}
		#upfile{display:none}
		img{width:20px;}
	</style>
</head>
<body>
<div class="container">
<form action="BoardAddAction.bo"	method="post"
	  enctype="multipart/form-data"	name="boardform">
	<h1>MVC 게시판 - write 페이지</h1>
	<div class="form-group">
		<label for="board_name">글쓴이</label>
		<input name="BOARD_NAME" id="board_name" value="${id }"
			   readOnly
			   type="text" size="10" maxlength="30"
			   class="form-control"
			   placeholder="Enter board_name">
	</div>
	<div class="form-group">
		<label for="board_pass">비밀번호</label>
		<input name="BOARD_PASS" id="board_pass"
			   type="password" size="10" maxlength="30"
			   class="form-control"
			   placeholder="Enter board_pass"
			   value="">
	</div>
	<div class="form-group">
		<label for="board_subject">제목</label>
		<input name="BOARD_SUBJECT" id="board_subject"
			   type="text" size="50" maxlength="100"
			   class="form-control"
			   placeholder="Enter board_subject"
			   value="">
	</div>
	<div class="form-group">
		<label for="board_content">내용</label>
		<textarea name="BOARD_CONTENT" id="board_content"
			   cols="67" rows="10" class="form-control"></textarea>
	</div>
	<div class="form-group">
		<label for="board_file">파일 첨부</label>
		<label for="upfile">
			<img src="image/attach.png" alt="사막"></label>
		<input type="file" id="upfile" name="BOARD_FILE">
	</div>
	<div class="form-group">
		<button type=submit class="btn btn-primary">등록</button>
		<button type=reset class="btn btn-danger">취소</button>
	</div>
</form>
</div>
<%
	String uploadPath = application.getRealPath("upload");
	out.print(uploadPath);
	
	int size = 10*1024*1024; //파일 최대 크기를 10MB로 지정합니다.
	String name="";
	String subject="";
	String filename="";
	String origfilename="";
	
	try{
		//업로드를 담당하는 부분입니다.
		//첫 번째 인자 request : 폼에서 가져온 값을 얻기 위해 request객체를 전달해 줍니다.
		//두 번째 인자 uploadPath : 업로드될 파일의 위치 입니다.
		//세 번째 인자 size : 업로드 할 크기이며 지정 크기보다 크면 Exception발생합니다.
		//네 번째 인자 "euc-kr" : 파일 이름이 한글인 경우 처리하는 부분입니다.
		//다섯 번째 인자 : 똑같은 파일을 업로드 할 경우 중복되지 않도록 자동으로
		//파일이름을 변환해주는 기능을 합니다.
		MultipartRequest multi=new MultipartRequest(request,
							uploadPath,
							size,
							"utf-8",
				new DefaultFileRenamePolicy());
	
		//name=multi.getParameter("name");
		//subject=multi.getParameter("subject");

		//업로드된 파일의 시스템 상에 업로드된 실제 파일명을 얻어 옵니다.
		filename = multi.getFilesystemName("fileName");
		out.println("<br>multi.getFilesystemName(fileName)="
						+ filename);
		
		//업로드된 파일의 원본 파일명을 얻어 옵니다.
		origfilename = multi.getOriginalFileName("fileName");
		out.println("<br>multi.getOriginalFileName(fileName)="
						+ origfilename);
	}catch(Exception e){
		//e.printStackTrace();
		out.print("에러입니다.");
	}
%>
</body>
</html>