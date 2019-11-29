<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<style>
table caption {
	caption-side: top;
	text-align: center;
}
h1{
	text-align: center;
}
.center-block {
	display: flex;
	justify-content: center; /* 가운데 정렬 */
}
li .current{
	background:#faf7f7;
}
</style>
<script src="js/jquery-3.4.1.js"></script>
<script>
$(function(){
	var selectedValue = '${search_field}'
	if(selectedValue != '-1')
		$("#viewcount").val(selectedValue);
	
	$("button").click(function(){
		if($("input").val()==''){
			alert("검색어를 입력하세요");
			return false;
		}
	})
	
	$("#viewcount").change(function(){
		selectedValue = $(this).val();
		$("input").val('');
		if(selectedValue == '3'){
			$("input").attr("placeholder", "여 또는 남을 입력하세요");
		}
	})
	
	$("tr > td:nth-child(3) > a").click(function(event){
		var answer = confirm("정말 삭제하시겠습니까?");
		console.log(answer);//취소를 클릭한 경우-false
		if(!answer){//취소를 클릭한 경우
			event.preventDefault();
		}
	})
})
</script>
<title>회원관리 시스템 관리자모드(회원 목록 보기)</title>
</head>
<body>
	<jsp:include page="/board/header.jsp" />
	<div class="container">
	<form action="member_list.net">
		<div class="input-group">
			<select id="viewcount" name="search_field">
				<option value="0" selected>아이디</option>
				<option value="1">이름</option>
				<option value="2">나이</option>
				<option value="3">성별</option>
			</select>
			<input name="search_word" type="text" class="form-control"
					placeholder="Search" value="${search_word }">
			<button class="btn btn-primary" type="submit">검색</button>
		</div>
	</form>
		<%--회원이 있는 경우 --%>
		<c:if test="${listcount > 0 }">
			<table class="table table-striped">
				<caption class="top">회원 목록</caption>
				<thead>
					<tr>
						<th colspan="2">MVC 게시판 - 회원 정보 list</th>
						<th>
							<font size=3>회원 수 : ${listcount }</font>
						</th>
					</tr>
					<tr>
						<td>아이디</td>
						<td>이름</td>
						<td>삭제</td>
					</tr>
				</thead>
				<tbody>
					<c:set var="num" value="${listcount-(page-1)*10 }" />
					<c:forEach var="m" items="${totallist }">
						<tr>
							<td><a href="member_info.net?id=${m.id }">${m.id }</a></td>
							<td>${m.name}</td>
							<td><a href="member_delete.net?id=${m.id }">삭제</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>

			<div class="center-block">
				<div class="row">
					<div class="col">
						<ul class="pagination">
							<c:if test="${page <= 1 }">
								<li class="page-item"><a class="page-link" href="#">이전&nbsp;</a>
								</li>
							</c:if>
							<c:if test="${page > 1 }">
								<li class="page-item"><a
									href="member_list.net?page=${page-1 }&search_field=${search_field}&search_word=${search_word}" class="page-link">이전</a>&nbsp;
								</li>
							</c:if>

							<c:forEach var="a" begin="${startpage }" end="${endpage }">
								<c:if test="${a == page }">
									<li class="page-item">
										<a class="page-link current" href="#">${a }</a>
									</li>
								</c:if>
								<c:if test="${a != page }">
									<li class="page-item">
										<a href="member_list.net?page=${a }&search_field=${search_field}&search_word=${search_word}"
										   class="page-link">${a }</a>
										</li>
								</c:if>
							</c:forEach>

							<c:if test="${page >= maxpage }">
								<li class="page-item"><a class="page-link" href="#">&nbsp;다음</a>
								</li>
							</c:if>
							<c:if test="${page < maxpage }">
								<li class="page-item"><a
									href="member_list.net?page=${page+1 }&search_field=${search_field}&search_word=${search_word}" class="page-link">&nbsp;다음</a>
								</li>
							</c:if>
						</ul>
					</div>
				</div>
			</div>

		</c:if>
		<c:if test="${listcount == 0 }">
			<font size=5>검색된 회원이 없습니다.</font>
		</c:if>
	</div>
</body>
</html>