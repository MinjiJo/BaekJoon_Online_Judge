package net.member.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.member.db.MemberDAO;

public class LoginProcessAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		MemberDAO dao = new MemberDAO();
		int result = dao.isId(request.getParameter("id"), request.getParameter("pass"));
		
		if(result == 0) {
			HttpSession session = request.getSession();
			session.setAttribute("id", request.getParameter("id"));
			forward.setRedirect(true);
			forward.setPath("/Lightgram/Mypage.do");
		}else {
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<script> alert('�α��� �� ������ �߻��Ͽ����ϴ�.'); history.back() </script>");
			out.close();
			return null;
		}
		
		return forward;
	}

}
