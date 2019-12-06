package net.member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.member.db.MemberDAO;

public class idokAction implements Action {

		@Override
		public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
			ActionForward forward = new ActionForward();
			MemberDAO dao = new MemberDAO();
			
			String id = request.getParameter("id");
			System.out.println(id);
			request.getSession().setAttribute("id", id);
			forward.setRedirect(false);
			forward.setPath("Login/joinOk.jsp");
			return forward;
		
	}

}
