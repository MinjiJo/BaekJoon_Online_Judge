package _10.dbpost;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet.bo")
public class dbpost extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public dbpost() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DAO dao = new DAO();
		String array = dao.getList();
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print(array);
		System.out.println(array);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		VO vo = new VO();
		vo.setName(request.getParameter("name"));
		vo.setModelnumber(request.getParameter("modelnumber"));
		vo.setSeries(request.getParameter("series"));
		DAO dao = new DAO();
		int result = dao.insert(vo);
		if(result==1) {
			System.out.println("»ðÀÔ ¼º°ø");
		} else {
			System.out.println("»ðÀÔ ½ÇÆÐ");
		}
		doGet(request, response);
	}
}