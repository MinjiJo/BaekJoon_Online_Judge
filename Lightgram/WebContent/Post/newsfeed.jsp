<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix ="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" />
		<script src="js/jquery-3.4.1.js"></script>
		<script src="js/newsfeed.js"></script>
		<jsp:include page="header.jsp"/>
		<link rel="stylesheet" type="text/css" href="css/newsfeed.css" />
		<style>
			th > a { text-decoration: none;}
			table {background : white;border:1px solid lightgray; margin:0px auto;}
			body {background: #FAFAFA; margin-top: 120px;}
			div {margin:20px;}
		</style>
	</head>
	<body>
		<c:if test="${!empty list }">
			<c:forEach var="newsfeedList" items="${list }">
			<div class="more">
				<div class="container">
					<table class="table table-borderless" style="width:760px; ">
						<thead>
							<tr id="newsfeed_header">
								<th width="85%"><a href='userPage.net?page=${newsfeedList.id }' style="color: black; text-decoration: none;">
									<img src="image/cat.png" style="border-radius: 50px; width:50px;">${newsfeedList.id }</a></th>
								<th width="15%" style="text-align: right;">
									<img class="moreIcon" src="icons/more.png" style="width:30px">
									<div class="newsfeed_menu">
										<div onClick="location.href='postUpdate.do'">수정</div>
										<div onClick="location.href='postDelete.do'">삭제</div>
									</div>
								</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td colspan="2" style="padding:0" ><img src="id/${newsfeedList.id }/${newsfeedList.itemNum}/${newsfeedList.pic_url}" style="width:760px;"></td>
							<tr>
							<tr>
								<td style="height:10px;"><img src="icons/heart_none.jpg" style="width:20px"></td>
								<td >작성시간</td>
							</tr>
							<tr>
								<td><span style="font:bolder"><a href='userPage.net?page=${newsfeedList.id }'>${newsfeedList.id}</a></span>&nbsp;&nbsp;&nbsp;&nbsp;${newsfeedList.dataText }</td>
								<td>${newsfeedList.posted_time }</td>
							</tr>
							<tr>
								<td >댓글</td>
								<td >댓글시간</td>
							</tr>
							<tr style="border-top:1px solid lightgray">
								<td><input type="text" name="reply" placeholder="댓글쓰기" style="border: none;" size="70"></td>
								<td><a href="#" style="font:#CEE3F6; font-style: italic; opacity: 0.4;">댓글달기</a></td>
							</tr>
						</tbody>
					</table>
				</div>
				<div class="menu__width">
				</div>
			</div>
			</c:forEach>
		</c:if>
	</body>
</html>