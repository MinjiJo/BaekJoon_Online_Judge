package action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDao;
import model.Member;

public class JoinAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		Member mem = new Member();
		mem.setId(id);
		mem.setPassword(password);
		
		int result = 0;
		MemberDao md = new MemberDao();
		int chkresult = md.chk(mem);
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		if(chkresult==0) {
			result = md.insert(mem);
			if (result > 0) {
				out.println("<script>");
				out.println("alert('���� �����Դϴ�.');");
				out.println("location.href='loginForm.net'");
				out.println("</script>");
				out.close();
			} else {
				out.println("<script>");
				out.println("alert('���� �����Դϴ�.');");
				out.println("history.go(-1)");
				out.println("</script>");
				out.close();
			}
		} else {
			out.println("<script>");
			out.println("alert('���̵� �ߺ��Դϴ�.');");
			out.println("history.go(-1)");
			out.println("</script>");
			out.close();
		}
		return null;
	}

}
