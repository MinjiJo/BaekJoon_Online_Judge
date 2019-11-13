package _9.context;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ch3/_9.context/context")
public class context extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public context() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String value = request.getParameter("food");
		request.setAttribute("food", value);
		
		HttpSession session = request.getSession();
		session.setAttribute("food", value);
		
		//���� �������� �Ҽӵ� �� ���ø����̼��� ServletContext��ü�� ���ؿɴϴ�.
		ServletContext sc = this.getServletContext();
		//ServletContext sc =
		//	request.getSession().getSErvletContext();
		sc.setAttribute("food", value);
		
		response.sendRedirect("scope.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
