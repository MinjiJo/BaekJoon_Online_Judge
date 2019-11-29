package net.board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.board.db.BoardBean;
import net.board.db.BoardDAO;

public class BoardModifyView implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		
		BoardDAO boarddao = new BoardDAO();
		BoardBean boarddata = new BoardBean();
		
		//�Ķ���ͷ� ���޹��� ������ �� ��ȣ�� num������ �����մϴ�.
		int num=Integer.parseInt(request.getParameter("num"));
		
		//�� ������ �ҷ��ͼ� boarddata ��ü�� �����մϴ�.
		boarddata=boarddao.getDetail(num);
		
		//�� ���� �ҷ����� ������ ����Դϴ�.
		if(boarddata==null) {
			System.out.println("(����)�󼼺��� ����");
			forward.setRedirect(false);
			request.setAttribute("meesage","�Խ��� �󼼺��� �����Դϴ�.");
			forward.setPath("error/error.jsp");
			return forward;
		}
		System.out.println("(����)�󼼺��� ����");
		//���� �� �������� �̵��� �� ���� �� ������ �����ֱ� ������
		//boarddata ��ü�� Request ��ü�� �����մϴ�.
		request.setAttribute("boarddata", boarddata);
		forward.setRedirect(false);
		//�� ���� �� �������� �̵��ϱ� ���� ��θ� �����մϴ�.
		forward.setPath("board/qna_board_modify.jsp");
		return forward;
	}
}