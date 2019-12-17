package net.member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.member.db.Member;
import net.member.db.MemberDAO;

public class idokAction implements Action {

		@Override
		public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
			ActionForward forward = new ActionForward();
			MemberDAO dao = new MemberDAO();
			Member m = new Member();
			HttpSession session = request.getSession();
			String id = session.getAttribute("id").toString();
			session.setAttribute("id", id);
			
			
			forward.setRedirect(false);
			forward.setPath("Login/joinOk.jsp");
			return forward;
		
	}

}
