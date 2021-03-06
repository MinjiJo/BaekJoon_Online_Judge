package _ch8;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//http://localhost:8088/JspProject/login_ok_cookie
@WebServlet("/login_ok_cookie")
public class login_ok_cookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public login_ok_cookie() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=euc-kr");
		String web_id = getServletContext().getInitParameter("ID");
		String web_pass = getServletContext().getInitParameter("Pass");
		String form_id = request.getParameter("id");
		String form_pass = request.getParameter("pswd");
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
		
		if(web_id.equals(form_id) && web_pass.equals(form_pass)) {
			//세션 설정
			HttpSession session = request.getSession();
			
			//세션 객체에 id라는 속성으로 id값을 저장
			session.setAttribute("id", web_id);
			out.write("<script>");
			out.write("alert('" + web_id + "님 환영합니다.');");
			out.write("location.href='ch8_session_cookie/test_servlet2/loginSuccess.jsp'");
			out.write("</script>");
		} else if(!web_id.equals(form_id)) { //입력 받은 값과 일치하지 않는 경우
			out.write("<script>");
			out.write("alert('아이디가 일치하지 않습니다.');");
			out.write("location.href='cookielogin';"); //바로 전 페이지로 이동
			out.write("</script>");
		} else if(!web_pass.equals(form_pass)) {
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