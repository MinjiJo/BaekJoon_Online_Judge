package net.post.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.info.db.UserId_post;
import net.info.db.UserId_postDAO;

public class NewsfeedAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		UserId_postDAO udao = new UserId_postDAO();
		List<UserId_post> list = udao.newsFeed(request.getSession().getAttribute("id").toString());
		
		request.setAttribute("list", list);
		forward.setRedirect(false);
		forward.setPath("Post/newsfeed.jsp");
		return forward;
	}

}
