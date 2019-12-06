package net.member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.member.db.Member;
import net.member.db.MemberDAO;

public class Member_updateAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		ActionForward forward = new ActionForward();
		MemberDAO dao = new MemberDAO();
		Member m = new Member();
		
		HttpSession session = request.getSession();
		String id = session.getAttribute("id").toString();
		
		boolean result = false;
		m.setId(id);
		m.setName(request.getParameter("name"));
		m.setEmail(request.getParameter("email"));
		
		result = dao.membermodify(m);
		
		if(result == false) {
			forward.setRedirect(false);
			request.setAttribute("message", "������ ���� ����");
			forward.setPath("error/error.jsp");
			return forward;
		}
		forward.setRedirect(false);
		forward.setPath("/profileUpdate.do");
		return forward;
	}

}
