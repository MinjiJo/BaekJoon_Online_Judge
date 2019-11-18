package com.naver.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//http://localhost:8088/JspProject/cookielogin
@WebServlet("/cookielogin")
public class Start extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Start() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=euc-kr");
		String id="";
		//header�� �̸� �߿��� cookie�� ���� �����ɴϴ�.
		String cookie = request.getHeader("Cookie");
		//��Ű�� �����ϴ��� Ȯ���մϴ�.
		if(cookie!=null){
			//�����ϴ� ��Ű���� �迭�� �����ɴϴ�.
			Cookie cookies[] = request.getCookies();
			
			//��Ű�� �̸��� "id"�� ���� ã�� ���� ��Ű �迭���� ��� Ȯ���մϴ�.
			for(int i = 0; i < cookies.length; i++){
				if(cookies[i].getName().equals("id")){
					id = cookies[i].getValue();				
				}
			}
		} 
		
		//�̵��� ������ �ּ�
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("jsp/login.jsp");
		request.setAttribute("id",id);
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		doGet(request, response);
	}
}