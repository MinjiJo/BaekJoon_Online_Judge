package _ch8;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//http://localhost:8088/JspProject/cookielogin
@WebServlet("/cookielogin")
public class start extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public start() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=euc-kr");
		String id="";
		//header의 이름 중에서 cookie의 값을 가져옵니다.
		String cookie = request.getHeader("Cookie");
		//쿠키가 존재하는지 확인합니다.
		if(cookie!=null){
			//존재하는 쿠키들을 배열로 가져옵니다.
			Cookie cookies[] = request.getCookies();
			
			//쿠키의 이름이 "id"인 값을 찾기 위해 쿠키 배열들을 모두 확인합니다.
			for(int i = 0; i < cookies.length; i++){
				if(cookies[i].getName().equals("id")){
					id = cookies[i].getValue();				
				}
			}
		} 
		
		//이동할 페이지 주소
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("ch8_session_cookie/test_servlet2/login.jsp");
		request.setAttribute("id",id);
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}