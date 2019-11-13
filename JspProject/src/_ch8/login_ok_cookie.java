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
			//Ŭ���̾�Ʈ�� ��Ű���� �����մϴ�.
			response.addCookie(cookie);
		}
		
		if(web_id.equals(form_id) && web_pass.equals(form_pass)) {
			//���� ����
			HttpSession session = request.getSession();
			
			//���� ��ü�� id��� �Ӽ����� id���� ����
			session.setAttribute("id", web_id);
			out.write("<script>");
			out.write("alert('" + web_id + "�� ȯ���մϴ�.');");
			out.write("location.href='ch8_session_cookie/test_servlet2/loginSuccess.jsp'");
			out.write("</script>");
		} else if(!web_id.equals(form_id)) { //�Է� ���� ���� ��ġ���� �ʴ� ���
			out.write("<script>");
			out.write("alert('���̵� ��ġ���� �ʽ��ϴ�.');");
			out.write("location.href='cookielogin';"); //�ٷ� �� �������� �̵�
			out.write("</script>");
		} else if(!web_pass.equals(form_pass)) {
			out.write("<script>");
			out.write("alert('��й�ȣ�� ��ġ���� �ʽ��ϴ�.');");
			out.write("location.href='cookielogin';"); //�ٷ� �� �������� �̵�
			out.write("</script>");
		}
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}