package _6.redirect;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ch3/_6.redirect/RedirectServlet")
public class RedirectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public RedirectServlet() {
        super();
    }
    
    /*페이지 이동
      2. Redirect 방식
       - 이동될 때 브라우저의 주소 표시줄의 URL이 변경되어 요청이 바뀌게 됩니다.
       	  이동된 페이지에서는 request 영역에 공유한 속성 값에 접근할 수 없습니다.
       - Web Container는 Redirect명령이 들어오면 웹 브라우저에게
       	  다른 페이지로 이동하라고 명령을 내리고 웹 브라우저는 URL을 지시로 주소를 바꾸고
       	  그 주소로 이동합니다.  
       - 새로운 페이지는 request와 response객체가 새롭게 생성됩니다.
     */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String value = request.getParameter("food");
		request.setAttribute("food", value);
		response.sendRedirect("redirect.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
