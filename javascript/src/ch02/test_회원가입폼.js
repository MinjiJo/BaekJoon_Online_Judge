//회원가입 버튼 클릭했을 경우
function check(){	
	//id 공백 유효성 검사
	var id = document.getElementById("id");
	if(id.value == ''){
		alert('ID를 입력하세요');
		id.focus();
		return false;
	}
	
	//비밀번호 공백 유효성 검사
	var pass = document.getElementById("pass");
	if(pass.value == ''){
		alert('Password를 입력하세요');
		pass.focus();
		return false;
	}
	
	//주민번호 앞자리 공백 유효성 검사
	var jumin1 = document.getElementById("jumin1");
	if(jumin1.value == ''){
		alert('주민번호 앞자리를 입력하세요');
		jumin1.focus();
		return false;
	}
	
	//주민번호 뒷자리 공백 유효성 검사
	var jumin2 = document.getElementById("jumin2");
	if(jumin2.value == ''){
		alert('주민번호 뒷자리를 입력하세요');
		jumin2.focus();
		return false;
	}
	
	//이메일 공백 유효성 검사
	var email = document.getElementById("email");
	if(email.value == ''){
		alert('E-mail을 입력하세요');
		email.focus();
		return false;
	}
	
	//도메인 공백 유효성 검사
	var domain = document.getElementById("domain")
	if(domain.value == ''){
		alert('E-mail을 입력하세요');
		domain.focus();
		return false;
	}
	
	//성별 미선택 유효성 검사
	var gender1 = document.getElementById("gender1");
	var gender2 = document.getElementById("gender2");
	if(gender1.checked == false && gender2.checked == false){
		alert("남, 여 중에서 1개를 선택하세요");
		return false;
	}
	
	//취미 2개 이상 미선택 유효성 검사
	var j = 0;
	var hobby = document.getElementsByName("hobby");
	for(var i = 0; i < hobby.length; i++){
		if(hobby[i].checked){
			j++;
		}
	}
	if(j < 2){
		alert('2개 이상 취미를 선택하세요');
		return false;
	}
	
	//우편번호 공백 유효성 검사
	var post1 = document.getElementById("post1");
	if(post1.value == ''){
		alert('우편번호를 입력하세요');
		post1.focus();
		return false;
	}
	
	//주소 공백 유효성 검사
	var address = document.getElementById("address");
	if(address.value == ''){
		alert('주소를 입력하세요');
		address.focus();
		return false;
	}
	
	//자기소개 공백 유효성 검사
	var intro = document.getElementById("intro");
	if(intro.value == ''){
		alert('자기소개를 입력하세요');
		intro.focus();
		return false;
	}
}

//ID 중복 검사 부분
function idcheck(){
	var id = document.getElementById("id");
	if(id.value == ''){ //ID를 입력하지 않았을 경우
		alert('ID를 입력하세요');
		id.focus();
	}else{ //ID를 입력했을 경우
		//사용자가 입력한 방식을 get방식으로 넘깁니다.
		var ref = "idcheck.html?id=" + id.value;
		
		//팝업창을 이용한 자료를 넘김
		window.open(ref, "ID 중복 확인", "width=300, height=250");
	}
}

function move(){
	var jumin1 = document.getElementById("jumin1");
	var jumin2 = document.getElementById("jumin2");
	
	//주민번호 앞자리 6자리인 경우
	if(jumin1.value.length == 6){
		if (!isNaN(jumin1.value)){ //6자리가 숫자인 경우
			jumin2.focus();
		}else{//6자리가 숫자가 아닌 경우
			alert("숫자를 입력하세요");
			jumin1.value = ''; //앞자리 모두 초기화
			jumin1.focus(); //앞자리에 포커스 준다.
		}
	}
	
	//주민번호 뒷자리 7자리인 경우
	if(jumin2.value.length == 7){
		if(isNaN(jumin2.value)){
			alert("숫자를 입력하세요");
			jumin2.value = '';
			jumin2.focus();
		}
	}
}

//select 태그에서 선택한 도메인 설정하는 부분
function domain1(){
	var sel = document.getElementById('sel');
	var domain = document.getElementById('domain');
	if (sel.value == ""){ //직접 선택한 경우
		domain.readOnly = false;
		domain.value = "";
		domain.focus();
	} else{ //option 중에서 선택한 경우
		domain.readOnly = true; //수정 불가
		domain.value = sel.value;
	}
}

function post(){
	window.open("post.html","우편번호 검색", "width=400, height=500");
}