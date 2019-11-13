$(document).ready(function(){
	var idcheck_value = '';		//id 중복검사시 값
	
	//ID중복검사 부분
	$('#idcheck').click(function(){
		var input_id=$.trim($("#id").val())
		if($.trim($("#id").val()) == "") {
			alert("ID를 입력하세요");
			$("#id").focus();
			return false;
		} else {
			//첫글자는 대문자이고 두번째부터는 대소문자, 숫자, _로 총 4개 이상
			pattern = /^[A-Z][a-zA-Z0-9_]{3,}$/;
			if(pattern.test(input_id)){
				idcheck_value = input_id;
				var ref = 'idcheck.html?id=' + input_id;
				window.open(ref, "ID 중복 확인", "width=300, height=250");
			} else {
				alert('첫글자는 대문자이고 두번째부터는 대소문자, 숫자, _로 총 4개 이상이어야 합니다.');
				$('#id').val('').focus();
			}
		}
	})

	/* 내코드
	$('input:button').eq(0).click(function(){
		var id = $('#id').val().trim();
		if(id == ''){ //ID를 입력하지 않았을 경우
			alert('ID를 입력하세요');
			$('#id').focus();
		}else{ //ID를 입력했을 경우
			//첫글자는 대문자이고 두번째부터는 대소문자, 숫자, _로 총 4개 이상
			pattern = /^[A-Z][a-zA-Z0-9_]{3,}$/;
			if(pattern.test(id)){
				//사용자가 입력한 방식을 get방식으로 넘깁니다.
				var ref = 'idcheck.html?id=' + id;
				
				//팝업창을 이용하여 자료를 넘김
				window.open(ref, "ID 중복 확인", "width=300, height=250");
			}else{
				alert('첫글자는 대문자이고 두번째부터는 대소문자, 숫자, _로 총 4개 이상이어야 합니다.');
				$('#id').focus();
			}
		}
	})*/
	
	$('#jumin1').keyup(function(){
		if($('#jumin1').val().length == 6){
			pattern = /^[0-9]{2}(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|[3][01])$/;
			if(pattern.test($('#jumin1').val())){ //6자리가 숫자인 경우
				$('#jumin2').focus();// 주민번호 뒷자리로 포커스 이동
			}else{
				alert('숫자 또는 형식에 맞게 입력하세요[yymmdd]');
				$('#jumin1').val('');
				$('#jumin1').focus();
			}
		}
	});
	
	$('#jumin2').keyup(function(){
		if($('#jumin2').val().length == 7){
			pattern = /^[1234][0-9]{6}$/;
			if(pattern.test($('#jumin2').val())){
				var c = $('#jumin2').val().substring(0,1);
				var index = (c-1)%2; //c=1,3이면 index=0
									 //c=2,4이면 index=1
				$('input[type=radio]').eq(index)
									 .prop('checked',true)
			}else {
				alert('형식에 맞게 입력하세요[1234][0-9]{6}');
				$('#jumin2').val('');
				$('#jumin2').focus();
			}
		}
	});
	
	//우편번호 버튼 클릭
	$('#postcode').click(function(){
		window.open("post.html", "우편번호 검색", "width=400, height=500,scrollbars=yes");
	});
	
	//도메인 선택 부분
	$('#sel').change(function(){
		var sel = $('#sel');
		var domain = $('#domain');

		if ($('#sel').val() == ''){ //직접 선택한 경우
			$('#domain').val('').focus();
			$('#domain').prop("readOnly",false); //attr 안 먹으면 prop으로!
		} else { //도메인 선택한 경우
			$('#domain').val($("#sel").val());
			$('#domain').prop("readOnly",true);
		}
	});
	
	//회원가입 버튼 클릭할 때 이벤트 처리 부분
	$('form').submit(function() {
		//$.trim()는 $("#id").val()값의 공백을 제거합니다.
		if($.trim($("#id").val()) == ''){
			alert('ID를 입력하세요');
			$('#id').focus();
			return false;
		}
		
		//id중복검사 눌렀는지 검사
		var submit_id_value = $.trim($("#id").val())
		if(submit_id_value != idcheck_value){
			alert('ID중복검사를 눌러주세요');
			return false;
		}
		
		//password 공백 유효성 검사
		if($.trim($("#pass").val()) == ''){
			alert('Password를 입력하세요');
			$('#pass').focus();
			return false;
		}
		
		//주민번호 앞자리 유효성 검사
		if($.trim($("#jumin1").val()) == ''){
			alert('주민번호 앞자리를 입력하세요');
			$('#jumin1').focus();
			return false;
		}
		
		//주민번호 앞자리 6자리인지 검사
		if($.trim($("#jumin1").val()).length != 6){
			alert('주민번호 앞자리 6자리를 입력하세요')
			$('#jumin1').val('');
			$('#jumin1').focus();
			return false;
		}
		
		//주민번호 뒷자리 유효성 검사
		if($.trim($("#jumin2").val()) == ''){
			alert('주민번호 뒷자리를 입력하세요');
			$('#jumin2').focus();
			return false;
		}
		
		//주민번호 뒷자리 7자리인지 검사
		if($.trim($("#jumin2").val()).length != 7){
			alert('주민번호 뒷자리 7자리를 입력하세요');
			$('#jumin2').val('');
			$('#jumin2').focus();
			return false;
		}
		
		//이메일 공백 유효성 검사
		if($.trim($("#email").val()) == ''){
			alert('E-mail을 입력하세요');
			$('#email').focus();
			return false;
		}
		
		//도메인 공백 유효성 검사
		if($.trim($("#domain").val()) == ''){
			alert('E-mail을 입력하세요');
			$('#domain').focus();
			return false;
		}
		
		//주민번호 뒷자리 입력시 자동 성별 선택해서 필요없게 됨
		/*if ($("#gender1").is(":checked") == false)
			&& $("#gender2").is(":checked") == false){
		alert("남자.여자 중에서 선택하세요");
		return false;
		}*/
		
		/*var cnt =$('input:radio:checked').length;
		if(cnt == 0){
			alert("성별을 선택하세요");
			return false;
		}*/
		
		//취미 2개 이상 체크하도록 하는 유효성 검사
		var cnt = $('input:checkbox:checked').length;
		
		if(cnt < 2){
			alert("취미는 2개이상 선택하세요");
			return false;
		}
		
		//우편번호 공백 유효성 검사
		if($.trim($("#post1").val()) == ''){
			alert('우편번호를 입력하세요');
			$('#post1').focus();
			return false;
		}
		
		//주소 공백 유효성 검사
		if($.trim($("#address").val()) == ''){
			alert('주소를 입력하세요');
			$('#address').focus();
			return false;
		}
		
		//자기소개 공백 유효성 검사
		if($.trim($("#intro").val()) == ''){
			alert('자기소개를 입력하세요');
			$('#intro').focus();
			return false;
		}
	})
})