package net.member.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.member.db.Member;
import net.member.db.MemberDAO;

public class joinProcessAction implements Action {
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");
		
		Member m = new Member();
		m.setAge(age);
		m.setEmail(email);
		m.setGender(gender);
		m.setId(id);
		m.setName(name);
		m.setPass(pass);
		
		MemberDAO dao = new MemberDAO();
		int result = dao.insert(m);
		
		//삽입이 된 경우
		if(result == 1) {
			forward.setPath("login.net");
			forward.setRedirect(true);
		} else if(result == -1) {
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('아이디가 중복되었습니다. 다시 입력하세요');");
			//out.println("location.href='./join.net';");//새로고침되어 이전에 입력한 데이터가 나타나지 않습니다.
			out.println("history.back()");//비밀번호를 제외한 다른 데이터는  유지 되어 있습니다.
			out.println("</script>");
			out.close();
			return null;
		}
		return forward;
	}
}	
