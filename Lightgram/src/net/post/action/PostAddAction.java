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
		
		String path = "C:\\Eclipse_ee\\Lightgram\\WebContent\\id\\"+id; //Æú´õ °æ·Î
		File Folder = new File(path);

		// ÇØ´ç µð·ºÅä¸®°¡ ¾øÀ»°æ¿ì µð·ºÅä¸®¸¦ »ý¼ºÇÕ´Ï´Ù.
		if (!Folder.exists()) {
			try{
			    Folder.mkdir(); //Æú´õ »ý¼ºÇÕ´Ï´Ù.
			    System.out.println("Æú´õ°¡ »ý¼ºµÇ¾ú½À´Ï´Ù.");
			}catch(Exception e){
			    e.getStackTrace();
			}        
		}else {
			System.out.println("ÀÌ¹Ì Æú´õ°¡ »ý¼ºµÇ¾î ÀÖ½À´Ï´Ù.");
		}
		
		path = "C:\\Eclipse_ee\\Lightgram\\WebContent\\id\\"+id+"\\"+itemNum; //Æú´õ °æ·Î
		Folder = new File(path);

		// ÇØ´ç µð·ºÅä¸®°¡ ¾øÀ»°æ¿ì µð·ºÅä¸®¸¦ »ý¼ºÇÕ´Ï´Ù.
		if (!Folder.exists()) {
			try{
			    Folder.mkdir(); //Æú´õ »ý¼ºÇÕ´Ï´Ù.
			    System.out.println("Æú´õ°¡ »ý¼ºµÇ¾ú½À´Ï´Ù.");
			}catch(Exception e){
			    e.getStackTrace();
			}        
		}else {
			System.out.println("ÀÌ¹Ì Æú´õ°¡ »ý¼ºµÇ¾î ÀÖ½À´Ï´Ù.");
		}
		
		String realFoler = "";
		String saveFolder = id+"/"+itemNum;
		
		int fileSize = 100*1024*1024; // ¾÷·ÎµåÇÒ ÆÄÀÏÀÇ ÃÖ´ë »çÀÌÁî (100MB)
		
		//½ÇÁ¦ ÀúÀå°æ·Î ÁöÁ¤
		ServletContext sc = request.getServletContext();
		realFoler = sc.getRealPath(saveFolder);
		
		System.out.println("realFolder = " + realFoler);
		boolean result = false;
		
		MultipartRequest multi = new MultipartRequest(request, path, fileSize, "UTF-8", new DefaultFileRenamePolicy());
		int level = Integer.parseInt(multi.getParameter("level"));
		String pic_url = multi.getFilesystemName("pic_url");
		String location = multi.getParameter("location");
		String[] data = replaceParameter(multi.getParameter("content"));
		String dataText = data[0];
		String hashTag = data[1];
		
		uid.setId(id);
		uid.setItemNum(itemNum);
		uid.setLevel(level);
		uid.setPic_url(pic_url);
		uid.setLocation(location);
		uid.setDataText(dataText);
		uid.setHashTag(hashTag);
		
		result = udao.addItem(uid);
		
		if(!result) {
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<script> alert('¹®Á¦¹ß»ý'); history.back() </script>");
			out.close();
			return null;
		}
		forward.setRedirect(true);
		forward.setPath("/Lightgram/Mypage.do");
		
		return forward;
	}
	
	private String[] replaceParameter(String param) {
		String result[] = new String[2];
		result[0] = param;
		if(param != null) {
			result[0] = result[0].replaceAll("<", "&lt;");
			result[0] = result[0].replaceAll(">", "&gt;");
			result[0] = result[0].replaceAll("\"", "&quot;");
		}
		result = setHashTag(result[0]);
		return result;	
	}
	
	private String[] setHashTag(String content) {
		
		Pattern p = Pattern.compile("\\#([0-9a-zA-Z°¡-ÆR_]*)");
		Matcher m = p.matcher(content);
		
		HashTagsDAO hdao = new HashTagsDAO();
		String result[] = new String[2];
		result[0] = content;
		result[1]="";
		while(m.find()) {
			hdao.insertHashTag(m.group());
			result[0] = result[0].replace(m.group(), "<a href='search.do?hashtag=" + m.group() + "'>" + m.group() + "</a>");
			result[1] += m.group() + " ";
		}
		
		return result; 
	}

}
