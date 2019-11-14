package com.naver.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.naver.dao.MemberDAO;
import com.naver.vo.Member;

@WebServlet("/info")
public class Info extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Info() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberDAO dao = new MemberDAO();
		HttpSession session = request.getSession();
		String id = session.getAttribute("id").toString();
		Member member = dao.member_info(id);
		
		RequestDispatcher dispatcher
			= request.getRequestDispatcher("jsp/info.jsp");
		request.setAttribute("member", member);
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
