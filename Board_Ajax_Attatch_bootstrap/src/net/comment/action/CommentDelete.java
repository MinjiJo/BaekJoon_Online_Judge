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
		
		// 삭제 처리 실패한 경우
		if (result == 0) {
			System.out.println("댓글 삭제 실패");
			forward.setRedirect(false);
			request.setAttribute("message", "댓글 삭제 실패입니다.");
			forward.setPath("error/error.jsp");
			return forward;
		}
		
		System.out.println("댓글 삭제 성공");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print(result);
		System.out.println("댓글을 삭제하고 있어용");
		return null;
	}

}
