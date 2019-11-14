package com.naver.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.naver.dao.MemberDAO;
import com.naver.vo.Member;

@WebServlet("/all")
public class All extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public All() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberDAO dao = new MemberDAO();
		List<Member> member = dao.getList();
		
		RequestDispatcher dispatcher
			= request.getRequestDispatcher("jsp/all.jsp");
		request.setAttribute("members", member);
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
