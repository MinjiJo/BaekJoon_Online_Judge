package homework;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ch3/homework/MyformServlet")
public class MyformServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public MyformServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		String jumin1 = request.getParameter("jumin1");
		String jumin2 = request.getParameter("jumin2");
		String email = request.getParameter("email");
		String domain = request.getParameter("domain");
		String gender = request.getParameter("gender");
		String[] hobby = request.getParameterValues("hobby");
		String post1 = request.getParameter("post1");
		String address = request.getParameter("address");
		String intro = request.getParameter("intro");
		
		out.println("<html><head><style>");
		out.print("table{border: 1px solid silver; border-collapse: collapse; margin:0 auto}");
		out.print("td{border: 1px solid silver; font-size: 20px; text-align: center;}");
		out.print("td:first-child{width: 100px; background: lightblue; text-align: center;}");
		out.print("td:last-child{padding: 10px}");
		out.print("</style></head>");
		out.print("<body><table>");
		out.print("<tr><td>");
		out.print("ID");
		out.print("</td><td>");
		out.print(id);
		out.print("</td></tr><tr><td>");
		out.print("Password");
		out.print("</td><td>");
		out.print(pass);
		out.print("</td></tr><tr><td>");
		out.print("�ֹι�ȣ");
		out.print("</td><td>");
		out.print(jumin1 + "-" + jumin2);
		out.print("</td></tr><tr><td>");
		out.print("E-mail");
		out.print("</td><td>");
		out.print(email + "@" + domain);
		out.print("</td></tr><tr><td>");
		out.print("����");
		out.print("</td><td>");
		
		if(gender == "m") {
			out.print("����");
		} else {
			out.print("����");
		}
		
		out.print("</td></tr><tr><td>");
		out.print("���");
		out.print("</td><td>");
		
		for(int i = 0; i < hobby.length; i++) {
			if(i != hobby.length - 1) {
				out.print(hobby[i] + " / ");
			} else {
				out.print(hobby[i]);
			}
		}
		
		out.print("</td></tr><tr><td>");
		out.print("�����ȣ");
		out.print("</td><td>");
		out.print(post1);
		out.print("</td></tr><tr><td>");
		out.print("�ּ�");
		out.print("</td><td>");
		out.print(address);
		out.print("</td></tr><tr><td>");
		out.print("�ڱ�Ұ�");
		out.print("</td><td>");
		out.print(intro);
		out.print("</td></tr></table></body></html>");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
