//서버 프로그램
package ex20_4_server;
import java.net.*;
public class ServerExample {
	public static void main(String[] args) {
		System.out.println("여기는 서버 입니다~");
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(9002);
			while (true) {
				// 연결 요청이 오면 소켓을 생성합니다.
				// accept 메소드 : 서버 소켓으로 연결 요청이 들어오면 연결을 맺고
				// 클라이언트 소켓을 생성해서 리턴하는 메소드
				Socket socket = serverSocket.accept();

				// 요청이 올 때마다 스레스 생성
				Thread thread = new PerClientThread(socket);
				thread.start();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				serverSocket.close();// 서버 소켓을 닫습니다.
			} catch (Exception ignored) {
				System.out.println("서버 소켓 닫는 중 에러입니다.");
			}
		}
	}
}
