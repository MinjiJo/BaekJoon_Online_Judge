function go(page){
	var limit = $('#viewcount').val();
	var data = "limit=" + limit + "&state=ajax&page=" + page;
	ajax(data);
}

function setPaging(href, digit){
	output += "<li class=page-item>";
	gray="";
	if(href==""){
		gray="gray";
	}
	anchor = "<a class='page-link " + gray + "'"
			+ href + ">" + digit + "</a></li>";
	output += anchor;
}

function ajax(data) {
	//1줄보기 선택시 리턴된 데이터
	/*
	 {"page":9,"maxpage":14,"startpage":1,"endpage":10,"listcount":14,"limit":1,
	 "boardlist":[{"BOARD_NUM":2,"BOARD_NAME":"test2","BOARD_PASS":"1234","BOARD_SUBJECT":"title3","BOARD_CONTENT":"content3","BOARD_RE_REF":0,"BOARD_RE_LEV":0,"BOARD_RE_SEQ":0,"BOARD_READCOUNT":12,"BOARD_DATE":"11월 26, 2019"}]}
	 */
	console.log(data)
	output = "";
	$.ajax({
		type : "POST",
		data : data,
		url : "BoardList.bo",
		dataType : "json",
		cache : false,
		success : function(data){
			$("#viewcount").val(data.limit);
			$("table").find("font")
					  .text("글 개수 : " + data.listcount);
			
			if(data.listcount > 0){//총갯수가 0보다 큰 경우
				$("tbody").remove();
				var num = data.listcount - (data.page - 1) * data.limit;
				console.log(num);
				output = "<tbody>";
				$(data.boardlist).each(
					function(index, item){
						output += '<tr><td>' + (num--) + '</td>'
						blank_count = item.BOARD_RE_LEV * 2 + 1;
						blank = '&nbsp;';
						for(i = 0; i < blank_count; i++){
							blank += '&nbsp;&nbsp;';
						}
						img="";
						if(item.BOARD_RE_LEV > 0){
							img="<img src='image/AnswerLine.gif'>";
						}
						output += '<td><div>' + blank + img;
						output += '<a href="./BoardDetailAction.bo?num=' 
								+ item.BOARD_NUM + '&page='
								+ data.page + '">';
						output += item.BOARD_SUBJECT + '</a></div></td>';
						output += '<td><div>' + item.BOARD_NAME + '</div></td>';
						output += '<td><div>' + item.BOARD_DATE + '</div></td>';
						output += '<td><div>' + item.BOARD_READCOUNT 
								+ '</div></td></tr>';
					})
				output += "</tbody>"
				$('table').append(output);//table완성
				
				$(".pagination").empty(); //페이징 처리
				output = "";
				
				digit = '이전&nbsp;'
				href="";
				if(data.page > 1){
					href = 'href=javascript:go(' + (data.page - 1) + ')';
				}
				setPaging(href, digit);
				
				for (var i = data.startpage; i <= data.endpage; i++){
					digit = i;
					href = "";
					if (i != data.page){
						href = 'href=javascript:go(' + i + ')';
					}
					setPaging(href, digit);
				}
				
				digit = '다음&nbsp;';
				href="";
				if(data.page < data.maxpage){
					href = 'href=javascript:go(' + (data.page + 1) + ')';
				}
				setPaging(href, digit);
				
				$('.pagination').append(output)
			}//if(data.listcount) end
			else {
				$(".container table").remove();
				$(".center-block").remove();
				$(".container")
				.append("<font size = 5>등록된 글이 없습니다.</font>");
			}
		},	//success end
		error : function(){
			console.log('에러');
		}
	})//ajax end
}//function ajax end

$(function(){
	$("#viewcount").change(function(){
		go(1);//보여줄 페이지를 1페이지로 설정합니다.
	});//change end
	
	$("button").click(function(){
		location.href="BoardWrite.bo";
	})
})