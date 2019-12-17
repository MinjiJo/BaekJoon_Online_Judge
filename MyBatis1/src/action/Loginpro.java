package action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.MemberDao;
import model.Member;

public class Loginpro implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		Member mem = new Member();
		mem.setId(id);
		mem.setPassword(password);
		
		MemberDao md = new MemberDao();
		int result = md.chk(mem);
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		if(result==1) {
			HttpSession session = request.getSession();
			session.setAttribute("id",mem.getId());
			out.println("<script>");
			out.println("alert('ȯ���մϴ�~ " + id + "��~');");
			out.println("location.href='main.net'");
			out.println("</script>");
			out.close();
		}else if(result==-1) {//���̵�� ���� ����� �ٸ� ���
			out.println("<script>");
			out.println("alert('����� �ٸ��ϴ�.')");
			out.println("history.go(-1);");
			out.println("</script>");
			out.close();
		}else if(result==0) {
			out.println("<script>");
			out.println("alert('�׷� ID�� �����ϴ�.')");
			out.println("history.go(-1);");
			out.println("</script>");
			out.close();
		}
		return null;
	}

}
