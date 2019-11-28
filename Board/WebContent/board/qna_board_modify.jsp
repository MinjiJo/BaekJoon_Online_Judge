<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<form action="BoardModifyAction.bo"
	  method="post"	name="modifyform">
	<input type="hidden" name="BOARD_NUM"
		   value="${boarddata.BOARD_NUM }">
	<h1>MVC 게시판 - 수정</h1>
	<div class="form-group">
		<label for="board_name">글쓴이</label>
		<input type="text" class="form-control"
			   value="${boarddata.BOARD_NAME }" readOnly>
	</div>
	<div class="form-group">
		<label for="board_subject">제목</label>
		<input type="text" name="BOARD_SUBJECT" 
			   id="board_subject"
			   maxlength="100" class="form-control"
			   value="${boarddata.BOARD_SUBJECT} ">
	</div>
	<div class="form-group">
		<label for="board_content">내용</label>
		<textarea name="BOARD_CONTENT" id="board_content"
				  class="form-control"
			      rows="10">${boarddata.BOARD_CONTENT }</textarea>
	</div>
	
	<!-- 파일이 첨부되어 있으면 -->
	<c:if test="${!empty boarddata.BOARD_FILE }">
	<div class="form-group">
		<label for="board_file">파일 첨부</label>
		<div class="form-control">
			&nbsp;&nbsp;${boarddata.BOARD_FILE }
		</div>
	</div>
	</c:if>
	
	<div class="form-group">
		<label for="board_pass">비밀번호</label>
		<input name="BOARD_PASS" id="board_pass"
			   type="password" 	 maxlength="30"
			   class="form-control"	placeholder="Enter board_pass"
			   value="">
	</div>
	<div class="form-group">
		<button type=submit class="btn btn-primary">수정</button>
		<button type=reset  class="btn btn-danger" 
							onClick="history.go(-1)">취소</button>
	</div>
</form>
<!-- 게시판 수정 -->
</div>
</body>
</html>