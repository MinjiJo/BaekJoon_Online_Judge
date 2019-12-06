<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<jsp:include page="header.jsp" />
<LINK REL="SHORTCUT ICON" HREF="http://morfik.homeip.com/favicon.ico">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css"
    integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf"
    crossorigin="anonymous">
    <link rel="stylesheet" href="css/add.css">
  </head>
  <body>
    <main class="more">
	    <div id="menu_action">
			<div class="picture">
				<img src="id/${item.id }/${item.itemNum}/${item.pic_url}">
			</div>
			<form action="modifyAction.do" method="post" name="boardform">
				<textarea name="content" cols="500" rows="5" placeholder="어떤 사진인지 설명해주세요"></textarea>
				<br>
				<div class="location_select">
					<select name='level' id="open_level">
								<option value='1' selected>전체 공개</option>
								<option value="2">팔로우 공개</option>
								<option value="3">비공개</option>
					</select>	
					<input type="text" name="location" placeholder="지금 어디 계시나요?"> &nbsp;
				</div>
				<div class="form-group">
					<br><br>
					<button type="submit" class="btn btn-primary">등록</button>
				</div>
			</form>
		</div>
		<div class="menu__width"></div>
	</main>
</body>
</html>