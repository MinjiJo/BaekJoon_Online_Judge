package net.board.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.board.db.BoardDAO;

public class BoardDeleteAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		boolean result = false;
		boolean usercheck = false;
		
		int num=Integer.parseInt(request.getParameter("num"));
		
		BoardDAO boarddao = new BoardDAO();
		//�� ���� ����� ��û�� ����ڰ� ���� �ۼ��� ��������� �Ǵ��ϱ� ����
		//�Է��� ��й�ȣ�� ����� ��й�ȣ�� ���Ͽ� ��ġ�ϸ� �����մϴ�.
		usercheck
		=boarddao.isBoardWriter(num, request.getParameter("BOARD_PASS"));
		
		//��й�ȣ ��ġ���� �ʴ� ���
		if(usercheck==false) {
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('��й�ȣ�� �ٸ��ϴ�.');");
			out.println("history.back();");
			out.println("</script>");
			out.close();
			return null;
		}
		
		//��й�ȣ ��ġ�ϴ� ��� ���� ó�� �մϴ�.
		result = boarddao.boardDelete(num);
		
		ActionForward forward = new ActionForward();
		
		// ���� ó�� ������ ���
		if (result == false) {
			System.out.println("�Խ��� ���� ����");
			forward.setRedirect(false);
			request.setAttribute("message", "�Խ��� ���� �����Դϴ�.");
			forward.setPath("error/error.jsp");
			return forward;
		}
		
		// ���� ó�� ������ ��� - �� ��� ���� ��û�� �����ϴ� �κ��Դϴ�.
		System.out.println("�Խ��� ���� ����");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<script>");
		out.println("alert('���� �Ǿ����ϴ�.');");
		out.println("location.href='BoardList.bo';");
		out.println("</script>");
		out.close();
		return null;
	}
}