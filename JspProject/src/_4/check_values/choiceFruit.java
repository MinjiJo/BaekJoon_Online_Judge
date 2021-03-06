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
		 * 하나의 파라미터 이름(dog)으로 값이 여러 개 전송되어 올 경우에 사용
		 * 같은 이름으로 여러 개의 파라미터 값을 전송하기 위해서 사용하고 있는
		 * 체크 박스의 이름은 공통적으로 dog로 지정되어 있으므로 각 체크 박스의
		 * 값으로 강아지 이미지 파일명을 지정하여 파라미터 값으로
		 * 강아지 이미지 이름이 전송되도록 하고 있습니다. 
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
