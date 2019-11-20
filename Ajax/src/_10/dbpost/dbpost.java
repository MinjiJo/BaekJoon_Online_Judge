package _10.dbpost;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonArray;

@WebServlet("/servlet.bo")
public class dbpost extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public dbpost() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DAO dao = new DAO();
		JsonArray array = dao.getList();
		Gson gson = new Gson();
		String json = gson.toJson(array);
		
		//response.setContentType("application/json;charset=utf-8");
		//지정해야 한글이 안깨집니다.
		response.setContentType("text/html;charset=utf-8");
		//page가 안바뀐상태에서 한 번 요청하면 갱신이 안되고 캐쉬에 남아있는 데이터를
		//계속 쓰게 됩니다.
		//ajax 처리시 캐쉬에 저장하지 않겠다고 세팅해야 합니다.
		response.setHeader("cache-control", "no-cache,no-store");
		
		//response객체에 대해 설정을 한 후 response객체에서 getWriter()를
		//수행해야 response 설정이 적용됩니다.
		//순서가 바뀌면 적용되지 않습니다.
		PrintWriter out = response.getWriter();
		out.print(json);
		System.out.println("json=" + json);
		
		/*
		DAO2 dao = new DAO2();
		String array = dao.getList();
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print(array);
		System.out.println(array);
		*/
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		VO vo = new VO();
		vo.setName(request.getParameter("name"));
		vo.setModelnumber(request.getParameter("modelnumber"));
		vo.setSeries(request.getParameter("series"));
		DAO2 dao = new DAO2();
		int result = dao.insert(vo);
		if(result==1) {
			System.out.println("삽입 성공");
		} else {
			System.out.println("삽입 실패");
		}
		doGet(request, response);
	}
}