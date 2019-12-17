package net.post.action;

import java.io.File;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import net.info.db.HashTagsDAO;
import net.info.db.LocationsDAO;
import net.info.db.UserId_postDAO;
import net.info.db.UserId_post;

public class PostAddAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		UserId_postDAO udao = new UserId_postDAO();
		UserId_post uid = new UserId_post();
		ActionForward forward = new ActionForward();
		String id = request.getSession().getAttribute("id").toString();
		int itemNum = udao.countItemNum(id); 
		
		
		String path = "C:\\workspace\\Lightgram\\WebContent\\id\\"+id; //���� ���
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
		
		path = "C:\\workspace\\Lightgram\\WebContent\\id\\"+id+"\\"+itemNum; //���� ���
		Folder = new File(path);

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
		
		String realFoler = "";
		String saveFolder = id+"/"+itemNum;
		
		int fileSize = 100*1024*1024; // ���ε��� ������ �ִ� ������ (100MB)
		
		//���� ������ ����
		ServletContext sc = request.getServletContext();
		realFoler = sc.getRealPath(saveFolder);
		
		System.out.println("realFolder = " + realFoler);
		boolean result = false;
		
		response.setContentType("text/html; charset=utf-8");
		
		MultipartRequest multi = new MultipartRequest(request, path, fileSize, "UTF-8", new DefaultFileRenamePolicy());
		int level = Integer.parseInt(multi.getParameter("level"));
		String pic_url = multi.getFilesystemName("pic_url");
		String location="";
		System.out.println("location:" + multi.getParameter("location"));
		if(multi.getParameter("location") != "" && multi.getParameter("location") != null  ) {
			location = replaceParameter(multi.getParameter("location"));
			LocationsDAO ldao = new LocationsDAO();
			ldao.insertLocations(id, itemNum, location);
		}

		if(multi.getParameter("content") == null || multi.getParameter("content") == "") {
			PrintWriter out = response.getWriter();
			out.print("<script> alert('�� ������ �Է����ּ���'); history.back(); </script>");
			return null;
		}
		String data = replaceParameter(id, itemNum, multi.getParameter("content"));
		
		uid.setId(id);
		uid.setItemNum(itemNum);
		uid.setLevel(level);
		uid.setPic_url(pic_url);
		uid.setLocation(location);
		uid.setDataText(data);
		
		result = udao.addItem(uid);
		
		if(!result) {
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<script> alert('�����߻�'); history.back() </script>");
			out.close();
			return null;
		}
		forward.setRedirect(true);
		forward.setPath("/Lightgram/Mypage.do");
		
		return forward;
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
	
	private String replaceParameter(String id, int itemNum, String param) {
		String result = param;
		if(param != null) {
			result = result.replaceAll("<", "&lt;");
			result = result.replaceAll(">", "&gt;");
			result = result.replaceAll("\"", "&quot;");
		}
		result = setHashTag(id, itemNum, result);
		return result;	
	}
	
	private String setHashTag(String id, int itemNum, String content) {
		
		Pattern p = Pattern.compile("\\#([0-9a-zA-Z��-�R_]*)");
		Matcher m = p.matcher(content);
		
		HashTagsDAO hdao = new HashTagsDAO();
		String result = content;
		while(m.find()) {
			hdao.insertHashTag(id, itemNum, m.group());
			result = result.replace(m.group(), "<a href='Search.do?search_word=" + m.group().substring(1) + "&&search_option=hash_sel'>" + m.group() + "</a>");
		}
		
		return result; 
	}

}
