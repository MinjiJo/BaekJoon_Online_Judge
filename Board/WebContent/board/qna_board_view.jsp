<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" 
		   uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<jsp:include page="header.jsp" />
	<title>MVC 게시판 - view</title>
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
					<a href="BoardDelete.bo?num=${boarddata.BOARD_NUM }">
						<button class="btn btn-danger">삭제</button>
					</a>
				</c:if>
					<a href="BoardList.bo">
						<button class="btn btn-primary">목록</button>
					</a>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>