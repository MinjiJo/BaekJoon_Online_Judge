package net.member.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.info.db.UserId_FollowDAO;

public class FollowAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String selectedId = request.getParameter("selectedID");
		String id = request.getSession().getAttribute("id").toString();
		
		UserId_FollowDAO ufdao = new UserId_FollowDAO(); 
		int result = ufdao.follow(id, selectedId);
		
		PrintWriter out = response.getWriter();
		if(result == -1) {
			out.print("<script> alert('팔로우 액션 시 에러 발생'); history.back(); </script>");
			return null;
		}
		
		out.print(result);
		return null;
	}

}
