package _8.config;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ch5_implicit_object/_8.config/LoginServlet2")
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
				
		HttpSession session = request.getSession();
		session.setAttribute("id", inputid);
		session.setAttribute("pass", inputpassword);
		out.println("<script>location.href='template.jsp'</script>");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
}