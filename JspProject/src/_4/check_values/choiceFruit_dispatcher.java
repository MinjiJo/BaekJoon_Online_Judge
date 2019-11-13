package _4.check_values;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ch3/_4.check_values/choiceFruit_dispatcher")
public class choiceFruit_dispatcher extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public choiceFruit_dispatcher() {
        super();
    }

	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException {
		/*
		 * request.getParameterValues("dog")
		 * �ϳ��� �Ķ���� �̸�(dog)���� ���� ���� �� ���۵Ǿ� �� ��쿡 ���
		 * ���� �̸����� ���� ���� �Ķ���� ���� �����ϱ� ���ؼ� ����ϰ� �ִ�
		 * üũ �ڽ��� �̸��� ���������� dog�� �����Ǿ� �����Ƿ� �� üũ �ڽ���
		 * ������ ������ �̹��� ���ϸ��� �����Ͽ� �Ķ���� ������
		 * ������ �̹��� �̸��� ���۵ǵ��� �ϰ� �ֽ��ϴ�. 
		 */
		String[] fruit = request.getParameterValues("fruit");
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("fruit-get.jsp");
		
		//request��ü�� "fruit" �Ӽ��� value���� �����մϴ�.
		request.setAttribute("fruit", fruit);
		dispatcher.forward(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}
}