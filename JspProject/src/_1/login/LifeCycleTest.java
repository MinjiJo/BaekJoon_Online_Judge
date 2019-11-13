package _1.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * @�� annotation���� �ڹ� �ּ���ó�� �ҽ��ȿ� @��ȣ�� �Բ� ���˴ϴ�.
 * �ּ���ó�� �����Ϸ��� ������ �˷��ִ� ��� �Ǵ� �ڹ� ���α׷� ���࿡ ���� ������
       �����ϴ� �뵵�� ���˴ϴ�.
 * @WebServlet ������ ���� ������ ���� ����� ������ 3.0���� �����մϴ�.
 * /LifeCycle�� �ǹ̴�
   "http://localhost:8088/JspProject/LifeCycle"�� ��û�� ������
       ������ �������̶�� �ǹ��Դϴ�.
 */
@WebServlet("/ch3/_1.login/LifeCycleTest")
public class LifeCycleTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LifeCycleTest() {
    	super();
        System.out.println("���� �������Դϴ�.~~");
    }
    /*
     * �ݹ� �޼ҵ�(callback method) - � ��ü���� � ��Ȳ�� �߻��ϸ�
	       �����̳ʰ� �ڵ����� ȣ���Ͽ� ����Ǵ� �޼ҵ带 �ǹ��մϴ�.
                �̷� �ݹ� �޼ҵ���� �������� �����մϴ�.
       - init(), service(), destroy()
         init() -> service() -> destory()
     */
    /*init()�޼ҵ�� ������ ��ü�� ������ ������ ȣ��Ǵ� �޼ҵ�� Ŭ���̾�Ʈ�κ���
          ���ʷ� ������ ��û�� ���� �� �� �� ����˴ϴ�.
          ������ �ʱ�ȭ �۾��� ���˴ϴ�.
          �̹� �ν��Ͻ��� ������ ��쿡�� ���� �ν��Ͻ��� �������� �ʰ� ������ �ν��Ͻ��� �����常
          ���� �����մϴ�.*/
    public void init() throws ServletException {
		System.out.println("���� init() �Դϴ�.");
	}
	
    /*
     - �� �޼����� ��� ����� ���� ���ؼ��� �� ������ ������ �� �����ϰ� �ܼ��� �ٶ󺸸�
               ��� ��ٷ� ������.
     - �Ǵ� ������ ���� �� ������
     - ������ ��ü�� �޸𸮿��� ������ �� ����˴ϴ�.
     - �ڿ� ���� �۾� � ���˴ϴ�.
     */
    public void destory() {
		System.out.println("���� destroy() �Դϴ�.");
	}
    
    /*
           Ŭ���̾�Ʈ�� ��û�� ���� ������ ����˴ϴ�.
     service()�޼ҵ尡 ������ ���������� ������ �����ϴ�.
           ���� ���α׷� ������ �Ϸ�� �Ŀ��� ������ �����̳ʰ� �������� �� ������ �����ϰ�
           �� ������ ���񽺸� ��û�� Ŭ���̾�Ʈ�� �����մϴ�.
           �̷ν� ������ �ϳ��� ��û�� ���� ó���� �Ϸ�˴ϴ�.
     HTTP �޼ҵ带 �����Ͽ� doGet()�� ȣ������, doPost()�� ȣ���� �� �����ϸ�
           ��û�� ���� ������ ȣ��˴ϴ�.
           ���������� ���ΰ�ħ�� �غ�����.
     */
    
    /*
    public void service(HttpServletRequest request,
    					HttpServletResponse response)
    				throws ServletException, IOException {
    	System.out.print("���� service() �Դϴ�. ~");


    	//method��Ŀ� ������� doGet()�޼��� ȣ��
    	//service()�޼��带 �ּ����� ó���ϸ� ���� ��
    	//service()�� ȣ��Ǿ� method ��Ŀ� ���� doPost()
    	//�Ǵ� doGet()�޼��尡 ����˴ϴ�.
    	doGet(request, response); //get�� post ��� ���� doGet�� �����ϰڴٴ� ��
    }
    */
    
    protected void doGet(HttpServletRequest request,
    		HttpServletResponse response)
    			throws ServletException, IOException {
    	//�����ϴ� ������ Ÿ���� htmlŸ���̰�
    	//charset=euc-kr�� �����ϸ鼭 ����Ǵ� �����͵��� �ѱ� ó���� �� �κ��Դϴ�.
    	response.setContentType("text/html;charset=euc-kr");
    	
    	//getParameter() �޼��� :
    	//name���� ���۵Ǿ� �� �Ķ���� ���� ��ȯ�� �ִ� �޼��� �Դϴ�.
    	//Ŭ���̾�Ʈ���� ���۵Ǿ� ���� id��� �̸��� �Ķ���� ����
    	//passwd��� �̸��� �Ķ���� ���� �޴� �κ��Դϴ�.
    	String id = request.getParameter("id");
    	String passwd = request.getParameter("passwd");
    	
    	//���ڿ� ������ response��ü�� ������ ����� �� �ִ� ��� ��Ʈ���� ������ �κ��Դϴ�.
    	PrintWriter out = response.getWriter();
    	out.println("served at: ");
    	
    	//getContextPath() : �� ���ø����̼� ��� ������ ��ȯ�մϴ�.
    	//URL���� ��Ʈ��ȣ�� ������ ���� �� ���ø����̼� �̸��� �����մϴ�.
    	//�� ���� �����ϴ� �޼ҵ��Դϴ�.
    	out.println(request.getContextPath());
    	
    	//���信 id���� ���� passwd���� ���� ����ϴ� �κ��Դϴ�.
    	out.println("<br>" + "���̵�=" + id + "<br>");
    	out.println("��й�ȣ="+passwd+"<br>");
    	out.close();
    }
    
    protected void doPost(HttpServletRequest request,
    		HttpServletResponse response)
    			throws ServletException, IOException {
    	//�����ϴ� ������ Ÿ���� htmlŸ���̰�
    	//charset=euc-kr�� �����ϸ鼭 ����Ǵ� �����͵��� �ѱ� ó���� �� �κ��Դϴ�.
    	response.setContentType("text/html;charset=euc-kr");
    	
    	//getParameter() �޼��� :
    	//name���� ���۵Ǿ� �� �Ķ���� ���� ��ȯ�� �ִ� �޼��� �Դϴ�.
    	//Ŭ���̾�Ʈ���� ���۵Ǿ� ���� id��� �̸��� �Ķ���� ����
    	//passwd��� �̸��� �Ķ���� ���� �޴� �κ��Դϴ�.
    	String id = request.getParameter("id");
    	String passwd = request.getParameter("passwd");
    	
    	//���ڿ� ������ response��ü�� ������ ����� �� �ִ� ��� ��Ʈ���� ������ �κ��Դϴ�.
    	PrintWriter out = response.getWriter();
    	out.println("served at: ");
    	
    	//getContextPath() : �� ���ø����̼� ��� ������ ��ȯ�մϴ�.
    	//URL���� ��Ʈ��ȣ�� ������ ���� �� ���ø����̼� �̸��� �����մϴ�.
    	//�� ���� �����ϴ� �޼ҵ��Դϴ�.
    	out.println(request.getContextPath());
    	
    	//���信 id���� ���� passwd���� ���� ����ϴ� �κ��Դϴ�.
    	out.println("<br>" + "���̵�=" + id + "<br>");
    	out.println("��й�ȣ="+passwd+"<br>");
    	out.close();
    }
}