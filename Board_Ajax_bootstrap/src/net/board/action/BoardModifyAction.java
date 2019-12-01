package net.board.action;

import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import net.board.db.BoardBean;
import net.board.db.BoardDAO;

public class BoardModifyAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// �Ķ���ͷ� ������ �� �ѱ��� ������ �ʵ��� �ϱ� ���� �����Դϴ�.
		request.setCharacterEncoding("utf-8");
		
		BoardDAO boarddao = new BoardDAO();
		BoardBean boarddata = new BoardBean();
		ActionForward forward = new ActionForward();
		String realFolder="";
		
		//WebContent�Ʒ��� �� ���� �����ϼ���.
		String saveFolder="boardupload";
		
		int fileSize = 10*1024*1024; //���ε��� ������  �ִ� �������Դϴ�. 10MB�� �����մϴ�.
		
		//���� ���� ��θ� �����մϴ�.
		ServletContext sc = request.getServletContext();
		realFolder = sc.getRealPath(saveFolder);
		
		System.out.println("realFolder = " + realFolder);
		boolean result = false;
		
		try{
			MultipartRequest multi=null;
			multi=new MultipartRequest(request,
					realFolder,
					fileSize,
					"utf-8",
					new DefaultFileRenamePolicy());
			//���޹��� �Ķ���� num ������ �����մϴ�.
			int num=Integer.parseInt(multi.getParameter("BOARD_NUM"));
			String pass = multi.getParameter("BOARD_PASS");
			//�۾������� Ȯ���ϱ� ���� ����� ��й�ȣ�� �Է��� ��й�ȣ�� ���մϴ�.
			boolean usercheck = boarddao.isBoardWriter(num, pass);
			
			//��й�ȣ�� �ٸ� ���
			if(usercheck == false) {
				response.setContentType("text/html;charset=utf-8");
				PrintWriter out = response.getWriter();
				out.println("<script>");
				out.println("alert('��й�ȣ�� �ٸ��ϴ�.');");
				out.println("history.back();");
				out.println("</script>");
				out.close();
				return null;
			}
		
			//��й�ȣ�� ��ġ�ϴ� ��� ���� ������ �����մϴ�.
			//BoardBean ��ü�� �� ��� ������ �Է� ���� �������� �����մϴ�.
			boarddata.setBOARD_NUM(num);
			boarddata.setBOARD_PASS(pass);
			boarddata.setBOARD_SUBJECT(multi.getParameter("BOARD_SUBJECT"));
			boarddata.setBOARD_CONTENT(multi.getParameter("BOARD_CONTENT"));
			
			String check = multi.getParameter("check");
			System.out.println("check=" + check);
			if(check!=null) {//�������� �״�� ����ϴ� ����Դϴ�.
				boarddata.setBOARD_FILE(check);
			} else {
				//���ε�� ������ �ý��� �� ���ε�� ���� ���ϸ��� ��� �ɴϴ�.
				String filename = multi.getFilesystemName("BOARD_FILE");
				boarddata.setBOARD_FILE(filename);
			}
			
			//DAO���� ���� �޼��� ȣ���Ͽ� �����մϴ�.
			result = boarddao.boardModify(boarddata);
			
			// ������ ������ ���
			if (result == false) {
				System.out.println("�Խ��� ���� ����");
				forward = new ActionForward();
				forward.setRedirect(false);
				request.setAttribute("meesage", "�Խ��� ���� �����Դϴ�.");
				forward.setPath("error/error.jsp");
				return forward;
			}
			// ������ ����� �� ���
			System.out.println("�Խ��� ���� �Ϸ�");
			
			forward.setRedirect(true);
			// ������ �� ������ �����ֱ� ���� �� ���� ���� �������� ��η� �����մϴ�.
			forward.setPath("BoardDetailAction.bo?num=" + boarddata.getBOARD_NUM());
			return forward;
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return null;
	}
}