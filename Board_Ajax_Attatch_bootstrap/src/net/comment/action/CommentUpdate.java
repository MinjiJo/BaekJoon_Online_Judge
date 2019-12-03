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
		//ajax이용시 한글 깨짐방지
		request.setCharacterEncoding("UTF-8");
		co.setContent(request.getParameter("content"));
		System.out.println("content="+co.getContent());
		co.setNum(Integer.parseInt(request.getParameter("num")));
		try {
			int ok = dao.commentsUpdate(co);
			response.getWriter().print(ok);
		} catch(Exception e) {
			System.out.println("댓글 수정 실패");
			ActionForward forward = new ActionForward();
			forward.setPath("error/error.jsp");
			request.setAttribute("message", "댓글 수정 실패입니다.");
			forward.setRedirect(false);
			return forward;
		}
		return null;
	}
}