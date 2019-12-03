<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" 
		   uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="header.jsp" />
<script src="js/view3.js" charset="utf-8"></script>
<title>MVC 게시판 - view</title>
<style>
body{width:100%;}
table {margin:0 auto;}
td:first-child {width:30%;}
td:last-child {sidth:70%;}
textarea {background-color:#e8e8e8;}
div {text-align:center;}
img {width:20px; height:20px;}
#myModal {display:none;}
#count {
	position: relative;
	top: -10px;
	left: -10px;
	background: orange;
	color: white;
	border-radius: 30%;
}
</style>
</head>
<body>
<input type="hidden" id="loginid" value="${id }" name="loginid">
	<div class="container">
		<table class="table table-striped">
			<tr>
				<th colspan="2">MVC 게시판 - view 페이지</th>
			</tr>
			<tr>
				<td>글쓴이</td>
				<td>${boarddata.BOARD_NAME }</td>
			</tr>
			<tr>
				<td>제목</td>
				<td>${boarddata.BOARD_SUBJECT }</td>
			</tr>
			<tr>
				<td>내용</td>
				<td><textarea class="form-control" rows="5"
				readOnly style="width:102%">${boarddata.BOARD_CONTENT }</textarea></td>
			</tr>
			
			<c:if test="${!empty boarddata.BOARD_FILE }">
			<tr>
				<td>
					<div>첨부파일</div>
				</td>
				<td>
					<img src="image/down.png" width="10px">
					<a href="BoardFileDown.bo?filename=${boarddata.BOARD_FILE}">
					${boarddata.BOARD_FILE }</a>
				</td>
			</tr>
			</c:if>
			<tr>
				<td colspan="2" class="center">
					<button class="btn btn-primary start">댓글</button>
					<span id="count">${count }</span>
				<c:if test="${boarddata.BOARD_NAME == id || id == 'admin' }">
					<a href="./BoardModifyView.bo?num=${boarddata.BOARD_NUM }">
						<button class="btn btn-info">수정</button>
					</a>
					<a href="#">
						<button class="btn btn-danger" data-toggle="modal"
								data-target="#myModal">삭제</button>
					</a>
				</c:if>
					<a href="./BoardList.bo">
						<button class="btn btn-primary">목록</button>
					</a>
					<a href="BoardReplyView.bo?num=${boarddata.BOARD_NUM }">
						<button class="btn btn-warning">답변</button>
					</a>
				</td>
			</tr>
		</table>
		<%--게시판 수정 end --%>
		
		<%-- modal 시작 --%>
		<div class="modal" id="myModal">
	      <div class="modal-dialog">
	         <div class="modal-content">
	
	            <!-- Modal body -->
	            <div class="modal-body">
	               <form name="deleteForm" action="BoardDeleteAction.bo"
	                  	 method="post">
	                  <%--http://localhost:8088/Board_Ajax_bootstrap/BoardDetailAction
	                  	   주소를 보면 num을 파라미터로 넘기고 있습니다.
	                  	   이 값을 가져와서 ${param.num}을 사용
	                  	   또는 ${boarddata.BOARD_NUM}
	                   --%>
	                  <input type="hidden" name="num" value="${param.num}"
	                  		 id="BOARD_RE_REF">
					  <input type="hidden" name="BOARD_FILE" value="${boarddata.BOARD_FILE }">
	                  <div class="form-group">
	                     <label for="pwd">비밀번호</label> 
	                     <input type="password"
	                       		class="form-control" placeholder="Enter password"
	                        	name="BOARD_PASS" id="board_pass">
	                  </div>
	                  <button type="submit" class="btn btn-primary" >Submit</button>
					  <button type="button" class="btn btn-danger">Close</button>
	               </form>
	            </div>
	         </div>
	      </div>
	   </div>
	   
	   <div id="comment">
	   	<button class="btn btn-info float-left">총 50자까지 가능합니다.</button>
	   	<button id="write" class="btn btn-info float-right">등록</button>
	   		<textarea rows=3	class="form-control"
	   				  id="content"	maxLength="50"></textarea>
	   		<table class="table table_striped">
	   			<thead>
	   				<tr><td>아이디</td><td>내용</td><td>날짜</td></tr>
	   			</thead>
	   			<tbody>
	   			
	   			</tbody>
	   		</table>
	   		<div id="message"></div>
	   </div>
	</div>
</body>
</html>