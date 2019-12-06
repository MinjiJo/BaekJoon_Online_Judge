package net.member.action;

import java.io.File;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.member.db.MemberDAO;

public class WithdrawAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		MemberDAO dao = new MemberDAO();
		String id = request.getSession().getAttribute("id").toString();
		int result = dao.delete(id);
		if(result != 0) {
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<script> alert('문제발생"
					+ "'); history.back() </script>");
			out.close();
			return null;
		}
		
		deleteFile("C:\\Eclipse_ee\\Lightgram\\WebContent\\id\\"+id);
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(true);
		forward.setPath("/Lightgram/lightgram");
		return forward;
	}

	public static void deleteFile(String path) {
		File deleteFolder = new File(path);

		if(deleteFolder.exists()){
			File[] deleteFolderList = deleteFolder.listFiles();
			
			for (int i = 0; i < deleteFolderList.length; i++) {
				if(deleteFolderList[i].isFile()) {
					deleteFolderList[i].delete();
				}else {
					deleteFile(deleteFolderList[i].getPath());
				}
				deleteFolderList[i].delete(); 
			}
			deleteFolder.delete();
		}
	}
}
