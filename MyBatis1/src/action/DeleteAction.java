package action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDao;
import model.Member;

public class DeleteAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		MemberDao md = new MemberDao();
		String id = request.getParameter("id");
		int result = md.delete(id);
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		if(result==1) {
			out.println("<script>");
			out.println("alert('���� �����Դϴ�.');");
			out.println("location.href='list.net'");
			out.println("</script>");
			out.close();
		} else {
			out.println("<script>");
			out.println("alert('���� �����Դϴ�.')");
			out.println("history.go(-1);");
			out.println("</script>");
			out.close();
		}
		return null;
	}

}
