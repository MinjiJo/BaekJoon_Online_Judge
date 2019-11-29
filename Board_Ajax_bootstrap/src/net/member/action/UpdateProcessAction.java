package net.member.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.member.db.Member;
import net.member.db.MemberDAO;

public class UpdateProcessAction implements Action {

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
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		MemberDAO mdao = new MemberDAO();
		
		int result = mdao.update(m);
		out.println("<script>");
		
		//삽입이 된 경우
		if(result == 1) {
			out.println("alert('회원 정보 수정에 성공했습니다.');");
			out.println("location.href='BoardList.bo';");
		} else {
			out.println("alert('회원 정보 수정에 실패했습니다.');");
			out.println("history.back()");//비밀번호를 제외한 다른 데이터는  유지 되어 있습니다.
		}
		out.println("</script>");
		out.close();
		return null;
	}
}