package _4.check_values;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ch3/_4.check_values/choiceFruit")
public class choiceFruit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public choiceFruit() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		/*
		 * request.getParameterValues("dog")
		 * �ϳ��� �Ķ���� �̸�(dog)���� ���� ���� �� ���۵Ǿ� �� ��쿡 ���
		 * ���� �̸����� ���� ���� �Ķ���� ���� �����ϱ� ���ؼ� ����ϰ� �ִ�
		 * üũ �ڽ��� �̸��� ���������� dog�� �����Ǿ� �����Ƿ� �� üũ �ڽ���
		 * ������ ������ �̹��� ���ϸ��� �����Ͽ� �Ķ���� ������
		 * ������ �̹��� �̸��� ���۵ǵ��� �ϰ� �ֽ��ϴ�. 
		 */
		String[] name = request.getParameterValues("fruit");
		String name1 = request.getParameter("fruit");
		System.out.println(name1);
		out.print("<html><head><style>");
		out.print("body{background:black;}");
		out.print("table{background:yellow; margin:0 auto}");
		out.print("td{color:red; font-size:20px; text-align:center}");
		out.print("</style></head>");
		out.print("<body><table>");
		out.print("<tr height=50px>");
		for(int i = 0; i < name.length; i++) {
			out.print("<td width=120px>" + name[i] + "</td>");
		}
		out.print("</tr><tr height=120px>");
		for(int i = 0; i < name.length; i++) {
			out.print("<td width=120px><img src='" + name[i] + "' width='100px' height='100px'></td>");
		}
		out.print("</tr></table></body></html>");
		out.close();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

}