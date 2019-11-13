package ex20_3_;
import java.net.*;
public class ServerTest1 {
	public static void main(String[] args) {
		System.out.println("여기는 서버 입니다~");
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			serverSocket = new ServerSocket(9000);
			socket = serverSocket.accept();
			System.out.println("============== 접속 정보 ==============");
			System.out.println(socket.getInetAddress().getHostAddress()
								+ "에서 접속하였습니다.");
			System.out.println("===================================");
			//두 스레드를 생성합니다.
			Thread thread1 = new SenderThread(socket);
			Thread thread2 = new ReceiverThread(socket);
			
			//두 스레드를 시작합니다.
			thread1.start();
			thread2.start();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				serverSocket.close();//서버 소켓을 닫습니다.
			}catch(Exception ignored) {
				System.out.println("서버 소켓 닫는 중 에러입니다.");
			}
		}
	}
}
