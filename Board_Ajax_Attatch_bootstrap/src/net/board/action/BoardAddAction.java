package net.board.action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import net.board.db.BoardBean;
import net.board.db.BoardDAO;

public class BoardAddAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
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
			
			//BoardBean ��ü�� �� ��� ������ �Է� ���� �������� �����մϴ�.
			boarddata.setBOARD_NAME(multi.getParameter("BOARD_NAME"));
			boarddata.setBOARD_PASS(multi.getParameter("BOARD_PASS"));
			boarddata.setBOARD_SUBJECT(
					replaceParameter(multi.getParameter("BOARD_SUBJECT")));
			boarddata.setBOARD_CONTENT(
					replaceParameter(multi.getParameter("BOARD_CONTENT")));
			
			//���ε��� ���ϸ��� ���ε��� ������ ��ü ��ο��� ���� �̸��� �����մϴ�.
			boarddata.setBOARD_FILE(multi.getFilesystemName("BOARD_FILE"));
			
			//�� ��� ó���� ���� DAO�� boardInsert()�޼��带 ȣ���մϴ�.
			//�� ��� ������ �Է��� ������ ����Ǿ� �ִ� boarddata��ü�� �����մϴ�.
			result = boarddao.boardInsert(boarddata);
			
			//�� ��Ͽ� ������ ��� false ��ȯ�մϴ�.
			if(result==false) {
				System.out.println("�Խ��� ��� ����");
				forward.setRedirect(false);
				request.setAttribute("meesage","�Խ��� ��� �����Դϴ�.");
				forward.setPath("error/error.jsp");
				return forward;
			}
			System.out.println("�Խ��� ��� �Ϸ�");
			//�� ����� �Ϸ�Ǹ� �� ����� �ܼ��� �����ֱ⸸ �� ���̹Ƿ�
			//Redirect���θ� true�� �����մϴ�.
			forward.setRedirect(true);
			//�̵��� ��θ� �����մϴ�.
			forward.setPath("BoardList.bo");
			return forward;
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return null;
	}
	
	private String replaceParameter(String param) {
		String result = param;
		if(param != null) {
			result = result.replaceAll("<", "&lt;");
			result = result.replaceAll(">", "&gt;");
			result = result.replaceAll("\"", "&quot;");
		}
		return result;
	}
}