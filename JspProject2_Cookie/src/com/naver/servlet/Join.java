package com.naver.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.naver.dao.MemberDAO;
import com.naver.vo.Member;

@WebServlet("/join")
public class Join extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Join() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//이동할 페이지 주소		
		RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/join.jsp");
		
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		Member member = new Member();
		member.setId(request.getParameter("id"));
		member.setPass(request.getParameter("pass"));
		member.setName(request.getParameter("name"));
		MemberDAO dao = new MemberDAO();

		try {
			int result = dao.insert(member);
			if(result==1)
				response.sendRedirect("cookielogin");
		} catch (SQLException e) {
			RequestDispatcher dis = request.getRequestDispatcher("jsp/error.jsp");
			request.setAttribute("errorMsg", "SQL문 장애발생으로 데이터 입력 실패함!!!");
			dis.forward(request, response);
		}
	}
}