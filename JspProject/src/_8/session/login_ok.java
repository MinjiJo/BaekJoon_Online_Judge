package _8.session;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/Example03_1108/login_ok")
public class login_ok extends HttpServlet {
 private static final long serialVersionUID = 1L;
 public login_ok() {
  super();
 }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     //응답의 컨텐츠 방식 : 캐릭터 셋 설정
     response.setContentType("text/html;charset=utf-8");
     //post 방식 요청 한글 처리
     request.setCharacterEncoding("euc-kr");

     PrintWriter out=response.getWriter();
     //HttpSession session=request.getSession(); : 세션 객체 생성하는 메소드 입니다.
     HttpSession session=request.getSession();
     String id=request.getParameter("id");
     String password=request.getParameter("password");
     if(!id.equals("java")) {
      out.print("<script>alert('아이디가 일치하지 않습니다.');");
      out.print("history.back();</script>");
      
     }else if(!password.equals("java")) {
      out.print("<script>alert('비밀번호가 일치하지 않습니다.');");
      out.print("history.back();</script>");
     }else {
     session.setAttribute("id", id);
     session.setAttribute("password", password);
     response.sendRedirect("loginSuccess.jsp");
     }
     out.close();
     //if(id.equals("java")&&password.equals("java")){
     //HttpSession session=request.getSession();
     //session.setAttribute("id", id);
     //response.sendRedirect("loginSuccess.jsp");
     //} else if(id.equals("java")) {
     // out.print("<script>alert('비밀번호가 일치하지 않습니다.');");
     // out.print("history.back();</script>"); 
     //} else{
     // out.print("<script>alert('아이디가 일치하지 않습니다.');");
     // out.print("history.back();</script>");
     //}
     //out.close();
 }
}