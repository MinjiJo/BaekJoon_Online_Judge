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
     <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css"
    integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf"
    crossorigin="anonymous">
    <link rel="stylesheet" href="css/add.css">
    <script>
  $(function(){
	  $("#filevalue").text("사진을 올려주세요").css("color", "gray");
	  
	  $("#upfile").change(function(){
		  $("#preview").css("display", "inline");
			$("#filevalue").val('');
			console.log("fakepath="+$(this).val());
			var inputfile=$(this).val().split("\\");
			$("#filevalue").text(inputfile[inputfile.length-1]);
			imageChange();
			$('.picture').css("display","none");
			$('#preview').css({
				'max-width': '600px',
				'height': 'auto'
			})
			$('.preview').css("display", "flex");
			
			//$(".picture").empty();
			//$(".picture").append("<img id='preview_img' src='icons/"+inputfile[inputfile.length-1]+"'>");

		});
	  
/*  	  $("#upfile").change(function(){
			$("#filevalue").val('');
			var files_name='';
			for(var i=0; i<$(this).get(0).files.length; i++){
				console.log("files_name="+$(this).get(0).files[i].name);
				if(i==$(this).get(0).files.length-1){
					files_name+=$(this).get(0).files[i].name;
					break;
				}
				files_name+=$(this).get(0).files[i].name+",";
			}
			$("#filevalue").val(files_name);
			
			$(".picture").empty();

		  	var inputfile=files_name.split(",");
			for(var i=0; i<inputfile.length; i++){
				$(".picture").append("<img id='preview_img' src='icons/"+inputfile[i]+"'>");
			}
		  	console.log("전체 파일 이름="+inputfile);
		});  */
 	  
/*  	 function handleImgFileSelect(e){
 		 sel_files=[];
 		 $(".picture").empty();
 		 var files=e.target.files;
 		 var filesArr=Array.prototype.slice.call(files);
 		 
 		 var index=0;
 		 filesArr.forEach(function(f){
 			 sel_files.push(f);
 			 console.log(sel_files);
 		 });
 	 } */
	  
	  $("#filevalue").click(function(){
		 $("#upfile").click(); 
	  });

  })
  
  function imageChange(event){
	var input=document.boardform.pic_url;
	var fReader=new FileReader();
	fReader.readAsDataURL(input.files[0]);
	fReader.onloadend=function(event){
		
		console.log(event.target.result);		
		document.a.src=event.target.result;
	}
}
  
  //javascript:getRealPath(this);
   function getRealPath(obj){
 	 obj.select();
 	 // document.selection.createRange().text.toString(); 이게 실행이 안된다면....
 	 // document.selection.createRangeCollection()[0].text.toString(); 이걸로....
 	 $("#filevalue").val(document.file.path());
	}

   
/*    var clean=$('input[type=file]').val().split('\\').pop(); // clean from C:\fakepath OR C:\fake_path 
   alert('clean file name : '+ fileName);
   var filename = $('input[type=file]')[0].files.length ? ('input[type=file]')[0].files[0].name : "";
   
   var pathArray = $('input[type=file]').val().split('\\');
   alert(pathArray[pathArray.length - 1]);
   
   function fileSelect(id, e){
	    console.log(e.target.files[0].name);
	}
   var fileUpload    = $("#ContentPlaceHolder1_FileUpload_mediaFile").get(0); 
   var files         =  fileUpload.files; 
   var mediafilename = ""; 

   for (var i = 0; i < files.length; i++) { 
     mediafilename = files[i].name; 
   } 
   
   $('#upfile').on('change',function(){
       // output raw value of file input
       $('#filevalue').html($(this).val().replace(/.*(\/|\\)/, '')); 

        // or, manipulate it further with regex etc.
        var filename = $(this).val().replace(/.*(\/|\\)/, '');
        // .. do your magic

        $('#filevalue').html(filename);
    }); */
   
  // onchange="this.select(); document.getElementById('filevalue').value=document.selection.createRange().text.toString();

  </script>
  </head>
  <body>
    <main class="more">
    <div id="menu_action">
	<form action="addAction.do" method="post" enctype="multipart/form-data" name="boardform">
	<div class="form-group">
	<label for="upfile">
	<img src="image/attach.png" alt="첨부" >
	</label>
	<input type="file" accept=".gif, .jpg, .png, jpeg" id="upfile" name="pic_url" >
	<span id="filevalue"></span>
	</div>
<div class="picture">
</div>
<div class="preview">
	<img id="preview"  name="a">
</div>
<textarea name="content" cols="500" rows="5" placeholder="어떤 사진인지 설명해주세요"></textarea>
<br>
<div class="location_select">
<select name='level' id="open_level">
			<option value='1' selected>전체 공개</option>
			<option value="2">팔로우 공개</option>
			<option value="3">비공개</option>
</select>	
<input type="text" name="location" id="location" placeholder="지금 어디 계시나요?"> &nbsp;
<!--  <button type="submit" class="btn btn-primary">등록</button>-->
</div>
<div class="form-group">
<button type="submit" class="btn btn-primary">등록</button>
</div> 
</form>
</div>
<div class="menu__width"></div>
</main>

</body>
</html>