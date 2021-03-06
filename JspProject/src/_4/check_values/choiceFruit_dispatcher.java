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
		 * 하나의 파라미터 이름(dog)으로 값이 여러 개 전송되어 올 경우에 사용
		 * 같은 이름으로 여러 개의 파라미터 값을 전송하기 위해서 사용하고 있는
		 * 체크 박스의 이름은 공통적으로 dog로 지정되어 있으므로 각 체크 박스의
		 * 값으로 강아지 이미지 파일명을 지정하여 파라미터 값으로
		 * 강아지 이미지 이름이 전송되도록 하고 있습니다. 
		 */
		String[] fruit = request.getParameterValues("fruit");
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("fruit-get.jsp");
		
		//request객체에 "fruit" 속성에 value값을 저장합니다.
		request.setAttribute("fruit", fruit);
		dispatcher.forward(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}
}