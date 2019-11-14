<%@page import="com.naver.vo.Member"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>INFO FORM</title>
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
<script src="http://code.jquery.com/jquery-latest.js"></script>
 <div class="container">
 <%
 	com.naver.vo.Member member = (com.naver.vo.Member)request.getAttribute("member");
 %>
    <form action="jsp/loginSuccess.jsp" method="post">
       <div class="form-group">
          <label for="id">Id</label>
          <input type="text" class="form-control" id="id"
               name="id" value="<%=member.getId()%>" readOnly>
       </div>
       <div class="form-group">
           <label for="pwd">Password</label>
           <input type="password" class="form-control" id="pwd" 
                  name="pass" value="<%=member.getPass()%>" readOnly>
       </div>
       <div class="form-group">
          <label for="name">Name</label>
          <input type="text" class="form-control" id="name"
          		 name="name" value="<%=member.getName()%>" readOnly>
       </div>
       <div class="form-group">
          <label for="date">가입일</label>
          <input type="text" class="form-control" id="date"
          		 name="date" value="<%=member.getReg_date()%>" readOnly>
       </div>
          <button class="btn btn-primary"
          		  onclick="location.href='success'">확인</button>
          <button class="btn btn-info"
          		  onclick="location.href='update'">수정</button>
     </form>
  </div>
</body>
</html>