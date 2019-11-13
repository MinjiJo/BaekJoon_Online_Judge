package _2.include_ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ch4/_2.include_ex/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public login() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//응답하는 데이터 타입이 html타입이고
		//charset=euc-kr로 지정하면서 응답되는 데이터들의 한글 처리를 한 부분입니다.
		response.setContentType("text/html;charset=euc-kr");

		request.setCharacterEncoding("euc-kr");
		
		String id = request.getParameter("id");
		
		//파라미터에 'id'라는 이름이 없는 경우
		/*
		if(id==null){
			System.out.println("null 입니다.");
		}
		*/
		
		//파라미터 'id'의 값이 없는 경우
		/*
		if(id.equals(""){
			System.out.println("공백입니다.");
		}
		 */
		HttpSession session = request.getSession();
		
		session.setAttribute("id", id);
		response.sendRedirect("template.jsp");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
