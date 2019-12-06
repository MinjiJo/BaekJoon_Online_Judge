package net.member.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.member.db.Member;
import net.member.db.MemberDAO;

public class JoinProcessAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		
		MemberDAO dao = new MemberDAO();
		String checkId = request.getParameter("id");
		String checkEmail = request.getParameter("email");
		
		int banned = dao.isBanned(checkId, checkEmail);
		if(banned != 0) {
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<script> alert('�����߻�"
					+ "'); history.back() </script>");
			out.close();
			return null;
		}
		
		int result = dao.isId(checkId);
		
		if(result != 0 ) {
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<script> alert('�����߻�"
					+ "'); history.back() </script>");
			out.close();
			return null;
		}		
		
		Member member = new Member();
		member.setId(checkId);
		member.setPassword(request.getParameter("pass"));
		if(request.getParameter("name") != null)
			member.setName(request.getParameter("name"));
		else
			member.setName("");
		member.setEmail(checkEmail);
		
		result = dao.join(member);
		
		if(result == 1) {
			String path = "C:\\Eclipse_ee\\Lightgram\\WebContent\\id\\"+checkId; //���� ���
			File Folder = new File(path);

			// �ش� ���丮�� ������� ���丮�� �����մϴ�.
			if (!Folder.exists()) {
				try{
				    Folder.mkdir(); //���� �����մϴ�.
				    System.out.println("������ �����Ǿ����ϴ�.");
				}catch(Exception e){
				    e.getStackTrace();
				}        
			}else {
				System.out.println("�̹� ������ �����Ǿ� �ֽ��ϴ�.");
			}
			
			Folder = new File("C:\\Eclipse_ee\\Lightgram\\WebContent\\image\\cat.png");
			File Folder2 = new File("C:\\Eclipse_ee\\Lightgram\\WebContent\\id\\"+checkId+"\\"+ checkId +".png");
				
			FileInputStream fis = null;
			FileOutputStream fos = null;
			try {
				fis = new FileInputStream(Folder);
				fos = new FileOutputStream(Folder2) ;
				byte[] b = new byte[4096];
				int cnt = 0;
				while((cnt=fis.read(b)) != -1){
					fos.write(b, 0, cnt);
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally{
				try {
					fis.close();
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					
			}
			
			
			forward.setRedirect(true);
			forward.setPath("/Lightgram/lightgram");
		}else {
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<script> alert('�����߻�"
					+ "'); history.back() </script>");
			out.close();
			return null;
		}
			
		return forward;
	}

}
