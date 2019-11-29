package net.member.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.member.db.MemberDAO;

public class Member_deleteAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		MemberDAO mdao = new MemberDAO();
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		int result = mdao.delete(id);
		String message = id + "�� ȸ�� ������ ���� �Ǿ����ϴ�.";
		if(result!=1) {
			message = "������ ���� �ʾҽ��ϴ�.";
		}
		out.println("<script>");
		out.println("alert('" + message + "');");
		out.println("location.href='member_list.net';");
		out.println("</script>");
		return null;
	}
}