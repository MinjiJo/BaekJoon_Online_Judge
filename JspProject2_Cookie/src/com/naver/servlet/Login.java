package com.naver.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.naver.dao.MemberDAO;
import com.naver.vo.Member;

@WebServlet("/login_ok_cookie")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Login() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=euc-kr");

		String form_id = request.getParameter("id");
		String form_pass = request.getParameter("pass");
		/*
		 * if(rs.next()) {
				if(rs.getString(2).equals(pass)) {
					result = 1;		//아이디와 비밀번호 일치하는 경우
				} else {
					result = 0;		//비밀번호가 일치하지 않는 경우
				}
			} else {
				result = -1; //아이디가 존재하지 않습니다.
			}
		 */
		
		MemberDAO dao = new MemberDAO();
		int result = dao.isId(form_id, form_pass);
		
		PrintWriter out = response.getWriter();
		
		Cookie cookie=new Cookie("id",
				request.getParameter("id"));
		String remember = request.getParameter("remember");
		if(remember==null) {
			cookie.setMaxAge(0);
			response.addCookie(cookie);
		}else {
			cookie.setMaxAge(2*60);
			//클라이언트로 쿠키값을 전송합니다.
			response.addCookie(cookie);
		}
		
		if(result == 1) {
			HttpSession session = request.getSession();
			session.setAttribute("id", form_id);
			out.write("<script>");
			out.write("alert('" + form_id + "님 환영합니다.');");
			out.write("location.href='success'");
			out.write("</script>");
		} else if(result == -1) { //입력 받은 값과 일치하지 않는 경우
			out.write("<script>");
			out.write("alert('아이디가 존재하지 않습니다.');");
			out.write("location.href='cookielogin';"); //바로 전 페이지로 이동
			out.write("</script>");
		} else if(result == 0) {
			out.write("<script>");
			out.write("alert('비밀번호가 일치하지 않습니다.');");
			out.write("location.href='cookielogin';"); //바로 전 페이지로 이동
			out.write("</script>");
		}
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}