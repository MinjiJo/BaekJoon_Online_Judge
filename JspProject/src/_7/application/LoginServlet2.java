package _7.application;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ch5_implicit_object/_7.application/LoginServlet2")
public class LoginServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginServlet2() {
        super();
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//post방식 요청 한글 처리
		request.setCharacterEncoding("euc-kr");
		
		//응답의 컨텐츠 형식 : 캐릭터 셋 설정
		response.setContentType("text/html;charset=euc-kr");
		
		//출력 스트림 생성
		PrintWriter out = response.getWriter();
		
		//파라미터 id와 password의 값 가져오기
		String inputid = request.getParameter("id");
		String inputpassword = request.getParameter("passwd");
		
		String id = getServletContext().getInitParameter("id");
		String password = getServletContext().getInitParameter("password");
		
		if(id.equals(inputid) && password.equals(inputpassword)) {
			
			//세션 설정
			HttpSession session = request.getSession();
			
			//세션 객체에 id라는 속성으로 id값을 저장
			session.setAttribute("id", id);
			out.println("<script>");
			out.println("alert('" + id + "님 로그인에 성공하셨습니다.')");
			out.println("location.href='template.jsp'");
			out.println("</script>");		
		} else if(!id.equals(inputid)) { //입력 받은 값과 일치하지 않는 경우
			out.println("<script>");
			out.println("alert('아이디가 일치하지 않습니다.');");
			out.println("history.back();"); //바로 전 페이지로 이동
			out.println("</script>");
			out.close();
		} else if(!password.equals(inputpassword)) {
			out.println("<script>");
			out.println("alert('비밀번호가 일치하지 않습니다.');");
			out.println("history.back();"); //바로 전 페이지로 이동
			out.println("</script>");
			out.close();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
}