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
		//�����ؾ� �ѱ��� �ȱ����ϴ�.
		response.setContentType("text/html;charset=utf-8");
		//page�� �ȹٲ���¿��� �� �� ��û�ϸ� ������ �ȵǰ� ĳ���� �����ִ� �����͸�
		//��� ���� �˴ϴ�.
		//ajax ó���� ĳ���� �������� �ʰڴٰ� �����ؾ� �մϴ�.
		response.setHeader("cache-control", "no-cache,no-store");
		
		//response��ü�� ���� ������ �� �� response��ü���� getWriter()��
		//�����ؾ� response ������ ����˴ϴ�.
		//������ �ٲ�� ������� �ʽ��ϴ�.
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
			System.out.println("���� ����");
		} else {
			System.out.println("���� ����");
		}
		doGet(request, response);
	}
}