package net.post.action;

import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.JsonObject;

import net.info.db.HashTagsDAO;
import net.info.db.UserId_post;
import net.info.db.UserId_postDAO;

public class PostModifyAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String id = request.getSession().getAttribute("id").toString();
		int itemNum = Integer.parseInt(request.getParameter("itemNum"));
		
		HashTagsDAO hdao = new HashTagsDAO();
		hdao.deleteHashTag(id, itemNum);
		
		int level = Integer.parseInt(request.getParameter("level"));
		String location = request.getParameter("location");
		String[] data = replaceParameter(request.getParameter("content"));
		String dataText = data[0];
		String hashTag = data[1];
		
		UserId_post uid = new UserId_post();
		uid.setId(id);
		uid.setItemNum(itemNum);
		uid.setLevel(level);
		uid.setLocation(location);
		uid.setDataText(dataText);
		uid.setHashTag(hashTag);
		
		UserId_postDAO udao = new UserId_postDAO();
		boolean result = udao.modifyPost(uid);
		
		PrintWriter out = response.getWriter();
		if(!result) {
			out.append("<script>alert('¼öÁ¤¿À·ù'); history.back();</script>");
			return null;
		}
		
		JsonObject jobj = new JsonObject();
		jobj.addProperty("level", level);
		jobj.addProperty("location", location);
		jobj.addProperty("content", dataText);
		out.print(jobj);
		out.close();
		return null;
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
