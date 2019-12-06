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
    <script>
  $(function(){
	  $("#upfile").change(function(){
			$("#filevalue").val('');
			console.log($(this).val());
			var inputfile=$(this).val().split("\\");
			$("#filevalue").text(inputfile[inputfile.length-1]);
		});
  })
</script>
  </head>
  <body>
    <main class="more">
    <div id="menu_action">
	<form action="addAction.do" method="post" enctype="multipart/form-data" name="boardform">
	<div class="form-group">
	<label for="upfile">
	<img src="image/attach.png" alt="첨부">
	</label>
	<input type="file" id="upfile" name="pic_url"><span id="filevalue"></span>
</div>
<div class="picture">
</div>
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