package net.member.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.net")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public FrontController() {
        super();
    }

    protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    	/*
    	   ��û�� ��ü URL�߿��� ��Ʈ ��ȣ ���� ���� ������ ���ڿ����� ��ȯ�˴ϴ�.
    	   ��) http://localhost:8088/JspProject/login.net�� ���
    	     "/JspProject/login.net" ��ȯ�˴ϴ�.
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
    	if(command.equals("/login.net")) {
    		forward=new ActionForward();
    		forward.setRedirect(false);//�ּ� ������� jsp�������� ������ �����ݴϴ�.
    		forward.setPath("member/loginForm.jsp");
    	} else if(command.equals("/join.net")) {
    		forward=new ActionForward();
    		forward.setRedirect(false);
    		forward.setPath("member/joinForm.jsp");
    	} else if(command.equals("/idcheck.net")) {
    		action = new IdCheckAction();
    		try {
    			forward=action.execute(request, response);
    		} catch(Exception e) {
    			e.printStackTrace();
    		}
    	} 
    	//joinProcess.net
    	else if(command.equals("/joinProcess.net")) {
    		action = new joinProcessAction();
    		try {
    			forward=action.execute(request, response);
    		} catch(Exception e) {
    			e.printStackTrace();
    		}
    	}else if(command.equals("/loginProcess.net")) {
    		action = new LoginProcessAction();
    		try {
    			forward=action.execute(request, response);
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
