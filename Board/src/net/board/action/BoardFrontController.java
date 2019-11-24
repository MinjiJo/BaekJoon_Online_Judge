package net.board.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.bo")
public class BoardFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public BoardFrontController() {
        super();
    }

    protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    	/*
    	   ��û�� ��ü URL�߿��� ��Ʈ ��ȣ ���� ���� ������ ���ڿ����� ��ȯ�˴ϴ�.
    	   ��) http://localhost:8088/JspProject/login.net�� ���
    	     "/JspProject/BoardList.bo" ��ȯ�˴ϴ�.
    	 */
    	String RequestURI = request.getRequestURI();
    	System.out.println("RequestURI = " + RequestURI);
    	
    	//getContextPath() : ���ؽ�Ʈ ��ΰ� ��ȯ�˴ϴ�.
    	//contextPath�� "/JspProject"�� ��ȯ�˴ϴ�.
    	String contextPath = request.getContextPath();
    	System.out.println("contextPath = " + contextPath);
    	
    	//RequestURI���� ���ؽ�Ʈ ��� ���� ���� �ε��� ��ġ�� ���ں���
    	//������ ��ġ ���ڱ��� �����մϴ�.
    	//command�� "/login.net" ��ȯ�˴ϴ�.
    	String command = RequestURI.substring(contextPath.length());
    	System.out.println("command = " + command);
    	
    	//�ʱ�ȭ
    	ActionForward forward=null;
    	Action action=null;
    	
    	if(command.equals("/BoardList.bo")) {
    		action = new BoardListAction();//�������� ���� ��ĳ����
    		try {
    			forward=action.execute(request, response);
    		}catch(Exception e) {
    			e.printStackTrace();
    		}
    	} else if(command.equals("/BoardWrite.bo")) {
    		forward=new ActionForward();
    		forward.setRedirect(false);	//������ ������� �ּҰ� �ٲ��� �ʾƿ�
    		forward.setPath("board/qna_board_write.jsp");
    	}
    	
    	if(forward != null) {
    		if(forward.isRedirect()) {//�����̷�Ʈ �˴ϴ�.
    			response.sendRedirect(forward.getPath());
    		} else {//�������˴ϴ�.
    			RequestDispatcher dispatcher = 
    					request.getRequestDispatcher(forward.getPath());
    			dispatcher.forward(request, response);
    		}
    	}
    }
    
    //doProcess(request, response)�޼��带 �����Ͽ� ��û�� GET����̵�
    //POST������� ���۵Ǿ� ���� ���� �޼��忡�� ��û�� ó���� �� �ֵ��� �Ͽ����ϴ�.
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

}
