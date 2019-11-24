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
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		MemberDAO dao = new MemberDAO();
		int result = dao.isId(id, pass);
		System.out.println("����� " + result);
		
		if(result == 1) {
			HttpSession session = request.getSession();
			//�α���  ����
			session.setAttribute("id", id);
			//forward.setPath("BoardList.bo");
			forward.setPath("BoardWrite.bo");
			//forward.setRedirect(false);
			forward.setRedirect(true);
		} else {
			String message = "��й�ȣ�� ��ġ���� �ʽ��ϴ�.";
			if(result == -1)
				message = "���̵� �������� �ʽ��ϴ�.";
			
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('" + message + "');");
			out.println("location.href='login.net';");
			out.println("</script>");
			out.close();
			return null;
		}
		return forward;
	}
}