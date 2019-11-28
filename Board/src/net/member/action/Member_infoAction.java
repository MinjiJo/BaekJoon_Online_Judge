package net.member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.member.db.Member;
import net.member.db.MemberDAO;

public class Member_infoAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		
		MemberDAO mdao = new MemberDAO();
		Member m = mdao.member_info(id);
		
		if(m==null) {
			System.out.println("���� �������� ����");
			forward.setRedirect(false);
			request.setAttribute("message", "���� �������� �����Դϴ�.");
			forward.setPath("error/error.jsp");
			return forward;
		}
		forward.setPath("member/member_info.jsp");
		forward.setRedirect(false);
		request.setAttribute("member", m);
		return forward;
	}
}