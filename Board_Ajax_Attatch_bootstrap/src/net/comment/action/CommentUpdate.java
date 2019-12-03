package net.comment.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.board.action.Action;
import net.board.action.ActionForward;
import net.comment.db.Comment;
import net.comment.db.CommentDAO;

public class CommentUpdate implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		CommentDAO dao = new CommentDAO();
		Comment co = new Comment();
		//ajax�̿�� �ѱ� ��������
		request.setCharacterEncoding("UTF-8");
		co.setContent(request.getParameter("content"));
		System.out.println("content="+co.getContent());
		co.setNum(Integer.parseInt(request.getParameter("num")));
		try {
			int ok = dao.commentsUpdate(co);
			response.getWriter().print(ok);
		} catch(Exception e) {
			System.out.println("��� ���� ����");
			ActionForward forward = new ActionForward();
			forward.setPath("error/error.jsp");
			request.setAttribute("message", "��� ���� �����Դϴ�.");
			forward.setRedirect(false);
			return forward;
		}
		return null;
	}
}