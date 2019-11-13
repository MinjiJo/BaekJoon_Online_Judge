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
    
    /*������ �̵�
      2. Redirect ���
       - �̵��� �� �������� �ּ� ǥ������ URL�� ����Ǿ� ��û�� �ٲ�� �˴ϴ�.
       	  �̵��� ������������ request ������ ������ �Ӽ� ���� ������ �� �����ϴ�.
       - Web Container�� Redirect������ ������ �� ����������
       	  �ٸ� �������� �̵��϶�� ������ ������ �� �������� URL�� ���÷� �ּҸ� �ٲٰ�
       	  �� �ּҷ� �̵��մϴ�.  
       - ���ο� �������� request�� response��ü�� ���Ӱ� �����˴ϴ�.
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