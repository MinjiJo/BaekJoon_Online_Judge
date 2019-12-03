package net.comment.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.board.action.Action;
import net.board.action.ActionForward;
import net.comment.db.CommentDAO;

public class CommentDelete implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		
		int num=Integer.parseInt(request.getParameter("num"));
		
		CommentDAO dao = new CommentDAO();
		
		int result = dao.commentsDelete(num);
		
		ActionForward forward = new ActionForward();
		
		// ���� ó�� ������ ���
		if (result == 0) {
			System.out.println("��� ���� ����");
			forward.setRedirect(false);
			request.setAttribute("message", "��� ���� �����Դϴ�.");
			forward.setPath("error/error.jsp");
			return forward;
		}
		
		System.out.println("��� ���� ����");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print(result);
		System.out.println("����� �����ϰ� �־��");
		return null;
	}

}
