package _1.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * @은 annotation으로 자바 주석문처럼 소스안에 @기호와 함께 사용됩니다.
 * 주석문처럼 컴파일러에 정보를 알려주는 기능 또는 자바 프로그램 실행에 관한 내용을
       설정하는 용도로 사용됩니다.
 * @WebServlet 설정을 통한 서블릿 접근 방법은 서블릿 3.0부터 지원합니다.
 * /LifeCycle의 의미는
   "http://localhost:8088/JspProject/LifeCycle"로 요청이 들어오면
       실행할 서블릿이라는 의미입니다.
 */
@WebServlet("/ch3/_1.login/LifeCycleTest")
public class LifeCycleTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LifeCycleTest() {
    	super();
        System.out.println("저는 생성자입니다.~~");
    }
    /*
     * 콜백 메소드(callback method) - 어떤 객체에서 어떤 상황이 발생하면
	       컨테이너가 자동으로 호출하여 실행되는 메소드를 의미합니다.
                이런 콜백 메소드들이 서블릿을 실행합니다.
       - init(), service(), destroy()
         init() -> service() -> destory()
     */
    /*init()메소드는 서블릿 객체가 생성된 다음에 호출되는 메소드로 클라이언트로부터
          최초로 서블릿 요청이 있을 때 한 번 실행됩니다.
          서블릿 초기화 작업에 사용됩니다.
          이미 인스턴스가 존재할 경우에는 새로 인스턴스를 생성하지 않고 기존의 인스턴스에 스레드만
          새로 생성합니다.*/
    public void init() throws ServletException {
		System.out.println("저는 init() 입니다.");
	}
	
    /*
     - 이 메서드의 출력 결과를 보기 위해서는 이 파일을 수정한 뒤 저장하고 콘솔을 바라보며
               잠시 기다려 보세요.
     - 또는 서버를 중지 해 보세요
     - 서블릿 객체가 메모리에서 삭제될 때 실행됩니다.
     - 자원 해제 작업 등에 사용됩니다.
     */
    public void destory() {
		System.out.println("저는 destroy() 입니다.");
	}
    
    /*
           클라이언트의 요청이 있을 때마다 실행됩니다.
     service()메소드가 끝나면 서버에서의 실행은 끝납니다.
           서버 프로그램 실행이 완료된 후에는 서블릿 컨테이너가 실행결과를 웹 서버에 전달하고
           웹 서버는 서비스를 요청한 클라이언트에 응답합니다.
           이로써 웹에서 하나의 요청에 대한 처리가 완료됩니다.
     HTTP 메소드를 참조하여 doGet()을 호출할지, doPost()를 호출할 지 결정하며
           요청이 있을 때마다 호출됩니다.
           브라우저에서 새로고침을 해보세요.
     */
    
    /*
    public void service(HttpServletRequest request,
    					HttpServletResponse response)
    				throws ServletException, IOException {
    	System.out.print("저는 service() 입니다. ~");


    	//method방식에 상관없이 doGet()메서드 호출
    	//service()메서드를 주석으로 처리하면 조상 중
    	//service()가 호출되어 method 방식에 따라 doPost()
    	//또는 doGet()메서드가 실행됩니다.
    	doGet(request, response); //get과 post 상관 없이 doGet을 실행하겠다는 뜻
    }
    */
    
    protected void doGet(HttpServletRequest request,
    		HttpServletResponse response)
    			throws ServletException, IOException {
    	//응답하는 데이터 타입이 html타입이고
    	//charset=euc-kr로 지정하면서 응답되는 데이터들의 한글 처리를 한 부분입니다.
    	response.setContentType("text/html;charset=euc-kr");
    	
    	//getParameter() 메서드 :
    	//name으로 전송되어 온 파라미터 값을 반환해 주는 메서드 입니다.
    	//클라이언트에서 전송되어 오는 id라는 이름의 파라미터 값과
    	//passwd라는 이름의 파라미터 값을 받는 부분입니다.
    	String id = request.getParameter("id");
    	String passwd = request.getParameter("passwd");
    	
    	//문자열 단위로 response객체에 내용을 출력할 수 있는 출력 스트림을 생성한 부분입니다.
    	PrintWriter out = response.getWriter();
    	out.println("served at: ");
    	
    	//getContextPath() : 웹 애플리케이션 경로 정보를 반환합니다.
    	//URL에서 포트번호와 슬래시 다음 웹 애플리케이션 이름을 지정합니다.
    	//이 값을 추출하는 메소드입니다.
    	out.println(request.getContextPath());
    	
    	//응답에 id변수 값과 passwd변수 값을 출력하는 부분입니다.
    	out.println("<br>" + "아이디=" + id + "<br>");
    	out.println("비밀번호="+passwd+"<br>");
    	out.close();
    }
    
    protected void doPost(HttpServletRequest request,
    		HttpServletResponse response)
    			throws ServletException, IOException {
    	//응답하는 데이터 타입이 html타입이고
    	//charset=euc-kr로 지정하면서 응답되는 데이터들의 한글 처리를 한 부분입니다.
    	response.setContentType("text/html;charset=euc-kr");
    	
    	//getParameter() 메서드 :
    	//name으로 전송되어 온 파라미터 값을 반환해 주는 메서드 입니다.
    	//클라이언트에서 전송되어 오는 id라는 이름의 파라미터 값과
    	//passwd라는 이름의 파라미터 값을 받는 부분입니다.
    	String id = request.getParameter("id");
    	String passwd = request.getParameter("passwd");
    	
    	//문자열 단위로 response객체에 내용을 출력할 수 있는 출력 스트림을 생성한 부분입니다.
    	PrintWriter out = response.getWriter();
    	out.println("served at: ");
    	
    	//getContextPath() : 웹 애플리케이션 경로 정보를 반환합니다.
    	//URL에서 포트번호와 슬래시 다음 웹 애플리케이션 이름을 지정합니다.
    	//이 값을 추출하는 메소드입니다.
    	out.println(request.getContextPath());
    	
    	//응답에 id변수 값과 passwd변수 값을 출력하는 부분입니다.
    	out.println("<br>" + "아이디=" + id + "<br>");
    	out.println("비밀번호="+passwd+"<br>");
    	out.close();
    }
}