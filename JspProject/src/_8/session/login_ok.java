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
     //������ ������ ��� : ĳ���� �� ����
     response.setContentType("text/html;charset=utf-8");
     //post ��� ��û �ѱ� ó��
     request.setCharacterEncoding("euc-kr");

     PrintWriter out=response.getWriter();
     //HttpSession session=request.getSession(); : ���� ��ü �����ϴ� �޼ҵ� �Դϴ�.
     HttpSession session=request.getSession();
     String id=request.getParameter("id");
     String password=request.getParameter("password");
     if(!id.equals("java")) {
      out.print("<script>alert('���̵� ��ġ���� �ʽ��ϴ�.');");
      out.print("history.back();</script>");
      
     }else if(!password.equals("java")) {
      out.print("<script>alert('��й�ȣ�� ��ġ���� �ʽ��ϴ�.');");
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
     // out.print("<script>alert('��й�ȣ�� ��ġ���� �ʽ��ϴ�.');");
     // out.print("history.back();</script>"); 
     //} else{
     // out.print("<script>alert('���̵� ��ġ���� �ʽ��ϴ�.');");
     // out.print("history.back();</script>");
     //}
     //out.close();
 }
}