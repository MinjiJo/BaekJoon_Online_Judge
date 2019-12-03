package net.comment.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.board.action.Action;
import net.board.action.ActionForward;
import net.comment.db.Comment;
import net.comment.db.CommentDAO;

public class CommentAdd implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		CommentDAO dao = new CommentDAO();
		Comment co = new Comment();
		//ajax이용시 한글 깨짐방지
		request.setCharacterEncoding("UTF-8");
		co.setId(request.getParameter("id"));
		co.setContent(request.getParameter("content"));
		System.out.println("content="+co.getContent());
		co.setBoard_re_ref(
				Integer.parseInt(request.getParameter("BOARD_RE_REF")));
		try {
			int ok = dao.commentsInsert(co);
			response.getWriter().print(ok);
		} catch(Exception e) {
			System.out.println("댓글 등록 실패");
			ActionForward forward = new ActionForward();
			forward.setPath("error/error.jsp");
			request.setAttribute("message", "댓글 등록 실패");
			forward.setRedirect(false);
			return forward;
		}
		return null;
	}

}
