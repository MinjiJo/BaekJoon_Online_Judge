<%@page import="com.naver.vo.Member"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.List, com.naver.vo.Member" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ALL INFO</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<style>
	.container{width:50%;border:1px solid lightgray;
               padding:20px;margin-top:20px}
</style>
</head>
<body>
	<div class="container">
		<table class="table">
			<tr>
				<td>아이디</td>
				<td>비밀번호</td>
				<td>이름</td>
				<td>등록날짜</td>
				<td>삭제</td>
			</tr>
 <%
 	List<Member> members = (List<Member>)request.getAttribute("members");
 	for(Member member:members){ 	
 %>
 		<tr>
 			<td><%=member.getId() %></td>
 			<td><%=member.getPass() %></td>
 			<td><%=member.getName() %></td>
 			<td><%=member.getReg_date() %></td>
 			<%
 				if(!member.getId().equals("admin")){%>
 					<td><button class="btn btn-primary"
 					onclick="location.href='delete?id=<%=member.getId() %>'">삭제</button>
 			<% 
 				}else{%>	
 				<td></td>
 			<%}%>
 		</tr>
 <%
 	}
 %>
 		</table>
 		<button class="btn btn-primary"
          		  onclick="location.href='success'">확인</button>
 	</div>
</body>
</html>