package net.post.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.info.db.UserId_postDAO;

public class PostDeleteAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		String id = request.getParameter("id");
		int itemNum = Integer.parseInt(request.getParameter("itemNum"));
		UserId_postDAO udao = new UserId_postDAO();
		
		boolean result = udao.deletePost(id, itemNum);
		
		if(!result) {
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<script> alert('삭제시 문제발생'); history.back() </script>");
			out.close();
			return null;
		}
		
		forward.setRedirect(false);
		forward.setPath("Post/Mypage.jsp");
		return forward;
	}

}
