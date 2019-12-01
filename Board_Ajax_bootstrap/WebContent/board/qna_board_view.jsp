<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" 
		   uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<jsp:include page="header.jsp" />
	<title>MVC 게시판 - view</title>
	<style>
	#myModal {
		display: none;
	}
	</style>
</head>
<body>
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
					<a href="BoardReplyView.bo?num=${boarddata.BOARD_NUM }">
						<button class="btn btn-primary">답변</button>
					</a>
				<c:if test="${boarddata.BOARD_NAME == id || id == 'admin' }">
					<a href="BoardModifyView.bo?num=${boarddata.BOARD_NUM }">
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
	                  <input type="hidden" name="num" value="${param.num}">
	
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
	</div>
</body>
</html>