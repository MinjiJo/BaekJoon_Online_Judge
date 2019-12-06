<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<jsp:include page="header_search.jsp" />
<!--  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> -->
<LINK REL="SHORTCUT ICON" HREF="http://morfik.homeip.com/favicon.ico">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css"
    integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf"
    crossorigin="anonymous">
	<link rel="stylesheet" href="css/Search.css">
    <script>
    $(document).ready(function(){
     
    });
    
    </script>
  </head>
  <body>
<!--   <div id="mask"></div>
  <div style="background-color: #86E57F; width: 300px; height: 300px; position: absolute; top:200px; left: 500px; display: none; z-index:10001;" id="test">
   </div> -->
<c:if test="${list==null}">
<!-- 처음 search 페이지 진입했을 시 -->
<span> 검색어를 입력해주세요.</span>
</c:if>
<c:if test="${list!=null}">
   <main class="more">
   <div>
		<table>
			<tr class="first">
				<th></th>
				<th><br># 아이디 <input type="button" value="follow"></th>
				<th></th>
			</tr>
<c:forEach var="list" items="${list}" varStatus="status">
	<c:if test="${status.count%3==1}">
	<tr>
		<td><div><a href="board.do?id=${id}&itemNum=${list.itemNum}"><img src="image/${list.pic_url}"></a></div></td>
	</c:if>
	<c:if test="${status.count%3==2}">
		<td><div><a href="board.do?id=${id}&itemNum=${list.itemNum}"><img src="image/${list.pic_url}"></a></div></td>
	</c:if>
	<c:if test="${status.count%3==0}"> 
		<td><div><a href="board.do?id=${id}&itemNum=${list.itemNum}"><img src="image/${list.pic_url}"></a></div></td>
	</tr>
	</c:if>
</c:forEach>
	</table>
	</div>
	<div class="menu__width"></div>
   </main>
  </c:if>

<!--   <div class="js-layer layer hidden">
    test
</div> -->

<!--    The Modal
   <div class="modal" id="myModal">
      <div class="modal-dialog">
         <div class="modal-content">
            Modal body
            <div class="modal-body">
               <form name="searchform" action="searchAction" method="post">
                  <div class="form-group">
                        <input type="text"
                        class="form-control" placeholder="검색...."
                        name="search_word" id="search_word">
                        	<select class="form-control" id="search_option">
								<option value="hash_sel" selected>해시태그로 검색</option>
								<option value="location_sel">지역으로 검색</option>
								<option value="name_sel">이름으로 검색</option>
								<option value="id_sel">아이디로 검색</option>
							</select>
                  </div>
                   <button type="submit" class="btn btn-primary">검색</button>
                   <button type="button" class="btn btn-danger">취소</button>
               </form>
            </div>
         </div>
      </div>
   </div> -->
</body>
</html>