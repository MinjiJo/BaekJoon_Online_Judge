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
		//post��� ��û �ѱ� ó��
		request.setCharacterEncoding("euc-kr");
		
		//������ ������ ���� : ĳ���� �� ����
		response.setContentType("text/html;charset=euc-kr");
		
		//��� ��Ʈ�� ����
		PrintWriter out = response.getWriter();
		
		//�Ķ���� id�� password�� �� ��������
		String inputid = request.getParameter("id");
		String inputpassword = request.getParameter("passwd");
		
		String id = getServletContext().getInitParameter("id");
		String password = getServletContext().getInitParameter("password");
		
		if(id.equals(inputid) && password.equals(inputpassword)) {
			
			//���� ����
			HttpSession session = request.getSession();
			
			//���� ��ü�� id��� �Ӽ����� id���� ����
			session.setAttribute("id", id);
			out.println("<script>");
			out.println("alert('" + id + "�� �α��ο� �����ϼ̽��ϴ�.')");
			out.println("location.href='template.jsp'");
			out.println("</script>");		
		} else if(!id.equals(inputid)) { //�Է� ���� ���� ��ġ���� �ʴ� ���
			out.println("<script>");
			out.println("alert('���̵� ��ġ���� �ʽ��ϴ�.');");
			out.println("history.back();"); //�ٷ� �� �������� �̵�
			out.println("</script>");
			out.close();
		} else if(!password.equals(inputpassword)) {
			out.println("<script>");
			out.println("alert('��й�ȣ�� ��ġ���� �ʽ��ϴ�.');");
			out.println("history.back();"); //�ٷ� �� �������� �̵�
			out.println("</script>");
			out.close();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
}