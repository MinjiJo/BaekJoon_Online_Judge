package net.comment.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.JsonArray;

public class CommentList implements net.board.action.Action {

	@Override
	public net.board.action.ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		net.comment.db.CommentDAO dao 
			= new net.comment.db.CommentDAO();
		
		int BOARD_RE_REF =
				Integer.parseInt(request.getParameter("BOARD_RE_REF"));
		System.out.println(BOARD_RE_REF);
		
		JsonArray json = dao.getCommentList(BOARD_RE_REF);
		response.setContentType("text/html;charset=utf-8");
		response.setHeader("cache-control", "no-cache,no-store");
		PrintWriter out = response.getWriter();
		out.print(json);
		System.out.println(json);
		return null;
	}
}