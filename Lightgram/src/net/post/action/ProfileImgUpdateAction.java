package net.post.action;

import java.io.File;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import net.member.db.Member;
import net.member.db.MemberDAO;

public class ProfileImgUpdateAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		
		String id = request.getSession().getAttribute("id").toString();
		
		String path = "D:\\woozi_workplace\\Lightgram\\WebContent\\id\\"+id; //폴더 경로
		File Folder = new File(path);

		// 해당 디렉토리가 없을경우 디렉토리를 생성합니다.
		if (!Folder.exists()) {
			try{
			    Folder.mkdir(); //폴더 생성합니다.
			    System.out.println("폴더가 생성되었습니다.");
			}catch(Exception e){
			    e.getStackTrace();
			}        
		}else {
			System.out.println("이미 폴더가 생성되어 있습니다.");
		}
		
		String realFoler = "";
		String saveFolder = id;
		
		int fileSize = 100*1024*1024; // 업로드할 파일의 최대 사이즈 (100MB)
		
		//실제 저장경로 지정
		ServletContext sc = request.getServletContext();
		realFoler = sc.getRealPath(saveFolder);
		
		System.out.println("realFolder = " + realFoler);
		boolean result = false;
		
		File oldFile = new File(path);
		File[] delProfileImg = oldFile.listFiles();
		for(File delProfile : delProfileImg) {
			if(delProfile.isFile())
				delProfile.delete();
		}
		MultipartRequest multi = new MultipartRequest(request, path, fileSize, "UTF-8", new DefaultFileRenamePolicy());
		String fileName = multi.getFilesystemName("profileImg");
		oldFile = new File(path + "\\" + fileName);
		fileName = id + fileName.substring(fileName.lastIndexOf("."));
		File newFile = new File(path + "\\" +fileName);
		oldFile.renameTo(newFile);
		
		MemberDAO dao = new MemberDAO();
		result = dao.profileImgUpdate(id, fileName);
		
//		String name = request.getParameter("name");
//		String email = request.getParameter("email");
//		Member m = new Member();
//		
//		m.setName(request.getParameter("name"));
//		m.setEmail(request.getParameter("email"));
//		
//		boolean result2 = dao.membermodify(m);
		
		if(!result) {
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<script> alert('변경시 문제발생'); history.back() </script>");
			out.close();
			return null;
		} 
//		else if(!result2) {
//			forward.setRedirect(false);
//			request.setAttribute("message", "프로필 편집 실패");
//			forward.setPath("error/error.jsp");
//			return forward;
//		}
//		request.setAttribute("name", name);
//		request.setAttribute("email", email);
//		forward.setRedirect(true);
//		forward.setPath("/Lightgram/Mypage.do");
		return null;
	}

}
