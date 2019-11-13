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
		//�����ϴ� ������ Ÿ���� htmlŸ���̰�
		//charset=euc-kr�� �����ϸ鼭 ����Ǵ� �����͵��� �ѱ� ó���� �� �κ��Դϴ�.
		response.setContentType("text/html;charset=euc-kr");

		request.setCharacterEncoding("euc-kr");
		
		String id = request.getParameter("id");
		
		//�Ķ���Ϳ� 'id'��� �̸��� ���� ���
		/*
		if(id==null){
			System.out.println("null �Դϴ�.");
		}
		*/
		
		//�Ķ���� 'id'�� ���� ���� ���
		/*
		if(id.equals(""){
			System.out.println("�����Դϴ�.");
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
