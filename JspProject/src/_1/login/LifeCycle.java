package _1.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * @Àº annotationÀ¸·Î ÀÚ¹Ù ÁÖ¼®¹®Ã³·³ ¼Ò½º¾È¿¡ @±âÈ£¿Í ÇÔ²² »ç¿ëµË´Ï´Ù.
 * ÁÖ¼®¹®Ã³·³ ÄÄÆÄÀÏ·¯¿¡ Á¤º¸¸¦ ¾Ë·ÁÁÖ´Â ±â´É ¶Ç´Â ÀÚ¹Ù ÇÁ·Î±×·¥ ½ÇÇà¿¡ °üÇÑ ³»¿ëÀ»
       ¼³Á¤ÇÏ´Â ¿ëµµ·Î »ç¿ëµË´Ï´Ù.
 * @WebServlet ¼³Á¤À» ÅëÇÑ ¼­ºí¸´ Á¢±Ù ¹æ¹ýÀº ¼­ºí¸´ 3.0ºÎÅÍ Áö¿øÇÕ´Ï´Ù.
 * /LifeCycleÀÇ ÀÇ¹Ì´Â
   "http://localhost:8088/JspProject/LifeCycle"·Î ¿äÃ»ÀÌ µé¾î¿À¸é
       ½ÇÇàÇÒ ¼­ºí¸´ÀÌ¶ó´Â ÀÇ¹ÌÀÔ´Ï´Ù.
 */
@WebServlet("/LifeCycle")
public class LifeCycle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LifeCycle() {
        System.out.println("Àú´Â »ý¼ºÀÚÀÔ´Ï´Ù.~~");
    }
    /*
     * ÄÝ¹é ¸Þ¼Òµå(callback method) - ¾î¶² °´Ã¼¿¡¼­ ¾î¶² »óÈ²ÀÌ ¹ß»ýÇÏ¸é
	       ÄÁÅ×ÀÌ³Ê°¡ ÀÚµ¿À¸·Î È£ÃâÇÏ¿© ½ÇÇàµÇ´Â ¸Þ¼Òµå¸¦ ÀÇ¹ÌÇÕ´Ï´Ù.
                ÀÌ·± ÄÝ¹é ¸Þ¼ÒµåµéÀÌ ¼­ºí¸´À» ½ÇÇàÇÕ´Ï´Ù.
       - init(), service(), destroy()
         init() -> service() -> destory()
     */
    /*init()¸Þ¼Òµå´Â ¼­ºí¸´ °´Ã¼°¡ »ý¼ºµÈ ´ÙÀ½¿¡ È£ÃâµÇ´Â ¸Þ¼Òµå·Î Å¬¶óÀÌ¾ðÆ®·ÎºÎÅÍ
          ÃÖÃÊ·Î ¼­ºí¸´ ¿äÃ»ÀÌ ÀÖÀ» ¶§ ÇÑ ¹ø ½ÇÇàµË´Ï´Ù.
          ¼­ºí¸´ ÃÊ±âÈ­ ÀÛ¾÷¿¡ »ç¿ëµË´Ï´Ù.
          ÀÌ¹Ì ÀÎ½ºÅÏ½º°¡ Á¸ÀçÇÒ °æ¿ì¿¡´Â »õ·Î ÀÎ½ºÅÏ½º¸¦ »ý¼ºÇÏÁö ¾Ê°í ±âÁ¸ÀÇ ÀÎ½ºÅÏ½º¿¡ ½º·¹µå¸¸
          »õ·Î »ý¼ºÇÕ´Ï´Ù.*/
    public void init() throws ServletException {
		System.out.println("Àú´Â init() ÀÔ´Ï´Ù.");
	}
	
    /*
     - ÀÌ ¸Þ¼­µåÀÇ Ãâ·Â °á°ú¸¦ º¸±â À§ÇØ¼­´Â ÀÌ ÆÄÀÏÀ» ¼öÁ¤ÇÑ µÚ ÀúÀåÇÏ°í ÄÜ¼ÖÀ» ¹Ù¶óº¸¸ç
               Àá½Ã ±â´Ù·Á º¸¼¼¿ä.
     - ¶Ç´Â ¼­¹ö¸¦ ÁßÁö ÇØ º¸¼¼¿ä
     - ¼­ºí¸´ °´Ã¼°¡ ¸Þ¸ð¸®¿¡¼­ »èÁ¦µÉ ¶§ ½ÇÇàµË´Ï´Ù.
     - ÀÚ¿ø ÇØÁ¦ ÀÛ¾÷ µî¿¡ »ç¿ëµË´Ï´Ù.
     */
    public void destory() {
		System.out.println("Àú´Â destroy() ÀÔ´Ï´Ù.");
	}
    
    /*
           Å¬¶óÀÌ¾ðÆ®ÀÇ ¿äÃ»ÀÌ ÀÖÀ» ¶§¸¶´Ù ½ÇÇàµË´Ï´Ù.
     service()¸Þ¼Òµå°¡ ³¡³ª¸é ¼­¹ö¿¡¼­ÀÇ ½ÇÇàÀº ³¡³³´Ï´Ù.
           ¼­¹ö ÇÁ·Î±×·¥ ½ÇÇàÀÌ ¿Ï·áµÈ ÈÄ¿¡´Â ¼­ºí¸´ ÄÁÅ×ÀÌ³Ê°¡ ½ÇÇà°á°ú¸¦ À¥ ¼­¹ö¿¡ Àü´ÞÇÏ°í
           À¥ ¼­¹ö´Â ¼­ºñ½º¸¦ ¿äÃ»ÇÑ Å¬¶óÀÌ¾ðÆ®¿¡ ÀÀ´äÇÕ´Ï´Ù.
           ÀÌ·Î½á À¥¿¡¼­ ÇÏ³ªÀÇ ¿äÃ»¿¡ ´ëÇÑ Ã³¸®°¡ ¿Ï·áµË´Ï´Ù.
     HTTP ¸Þ¼Òµå¸¦ ÂüÁ¶ÇÏ¿© doGet()À» È£­‚ÇÒÁö, doPost()¸¦ È£ÃâÇÒ Áö °áÁ¤ÇÏ¸ç
           ¿äÃ»ÀÌ ÀÖÀ» ¶§¸¶´Ù È£ÃâµË´Ï´Ù.
           ºê¶ó¿ìÀú¿¡¼­ »õ·Î°íÄ§À» ÇØº¸¼¼¿ä.
     */
    public void service(HttpServletRequest request,
    					HttpServletResponse response)
    				throws ServletException, IOException {
    	System.out.print("Àú´Â service() ÀÔ´Ï´Ù. ~");
    	System.out.println(request.getRemoteHost()
    						+ " ¿¡¼­ Á¢¼Ó ÇÕ´Ï´Ù.");
    }
}