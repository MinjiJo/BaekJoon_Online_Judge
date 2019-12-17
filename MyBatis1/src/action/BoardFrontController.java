package action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.net")
public class BoardFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public BoardFrontController() {
        super();
    }

    protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    	//��û�� �ѱ��� ������ �ʵ��� �մϴ�.
    	request.setCharacterEncoding("utf-8");
    	
    	String RequestURI = request.getRequestURI();
    	String contextPath = request.getContextPath();
    	String command = RequestURI.substring(contextPath.length());
    	ActionForward forward=null;
    	Action action=null;
    	
    	if(command.equals("/loginpro.net")) {
    		action = new Loginpro();
    		try {
    			forward = action.execute(request, response);
    		} catch(Exception e) {
    			e.printStackTrace();
    		}
    	} else if(command.equals("/joinPro.net")) {
    		action = new JoinAction();
    		try {
    			forward = action.execute(request, response);
    		} catch(Exception e) {
    			e.printStackTrace();
    		}
    	} else if(command.equals("/main.net")) {
    		forward = new ActionForward();
    		forward.setRedirect(false);
    		forward.setPath("jsp/main.jsp");
    	} else if(command.equals("/logout.net")) {
    		action = new logout();
    		try {
    			forward = action.execute(request, response);
    		} catch(Exception e) {
    			e.printStackTrace();
    		}
    	} else if(command.equals("/loginForm.net")) {
    		forward = new ActionForward();
    		forward.setRedirect(false);
    		forward.setPath("jsp/loginForm.jsp");
    	} else if(command.equals("/list.net")) {
    		action = new ListAction();
    		try {
    			forward = action.execute(request, response);
    		} catch(Exception e) {
    			e.printStackTrace();
    		}
    	} else if(command.equals("/delete.net")) {
    		action = new DeleteAction();
    		try {
    			forward = action.execute(request, response);
    		} catch(Exception e) {
    			e.printStackTrace();
    		}
    	} else if(command.equals("/updateForm.net")) {
    		action = new updateForm();
    		try {
    			forward = action.execute(request, response);
    		} catch(Exception e) {
    			e.printStackTrace();
    		}
    	} else if(command.equals("/updatePro.net")) {
    		action = new updatePro();
    		try {
    			forward = action.execute(request, response);
    		} catch(Exception e) {
    			e.printStackTrace();
    		}
    	} else if(command.equals("/joinForm.net")) {
    		forward = new ActionForward();
    		forward.setRedirect(false);
    		forward.setPath("jsp/joinForm.jsp");
    	} else if(command.equals("/term.net")) {
    		action = new termAction();
    		try {
    			forward = action.execute(request, response);
    		} catch(Exception e) {
    			e.printStackTrace();
    		}
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
