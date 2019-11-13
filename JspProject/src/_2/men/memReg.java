package _2.men;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ch3/_2.mem/memReg")
public class memReg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public memReg() {
        super();
        System.out.println("������");
    }
    
    public void init() throws ServletException {
		System.out.println("init()");
	}
    
    public void destory() {
		System.out.println("destroy()");
	}
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=euc-kr");
		String name = request.getParameter("name");
		String addr = request.getParameter("addr");
		String tel = request.getParameter("tel");
		String hobby = request.getParameter("hobby");
		
		PrintWriter out = response.getWriter();
		out.print("served at: " + request.getContextPath() + "<br>");
		out.print("�̸�: " + name + "<br>");
		out.print("�ּ�: " + addr + "<br>");
		out.print("��ȭ��ȣ: " + tel + "<br>");
		out.print("���: " + hobby + "<br>");
		out.close();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=euc-kr");
		request.setCharacterEncoding("euc-kr");
		String name = request.getParameter("name");
		String addr = request.getParameter("addr");
		String tel = request.getParameter("tel");
		String hobby = request.getParameter("hobby");
		
		PrintWriter out = response.getWriter();
		out.print("served at: " + request.getContextPath() + "<br>");
		out.print("�̸�: " + name + "<br>");
		out.print("�ּ�: " + addr + "<br>");
		out.print("��ȭ��ȣ: " + tel + "<br>");
		out.print("���: " + hobby + "<br>");
		out.close();
	}
}