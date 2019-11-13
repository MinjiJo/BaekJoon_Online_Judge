package ex20_3_;
import java.net.*;
public class ServerTest1 {
	public static void main(String[] args) {
		System.out.println("����� ���� �Դϴ�~");
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			serverSocket = new ServerSocket(9000);
			socket = serverSocket.accept();
			System.out.println("============== ���� ���� ==============");
			System.out.println(socket.getInetAddress().getHostAddress()
								+ "���� �����Ͽ����ϴ�.");
			System.out.println("===================================");
			//�� �����带 �����մϴ�.
			Thread thread1 = new SenderThread(socket);
			Thread thread2 = new ReceiverThread(socket);
			
			//�� �����带 �����մϴ�.
			thread1.start();
			thread2.start();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				serverSocket.close();//���� ������ �ݽ��ϴ�.
			}catch(Exception ignored) {
				System.out.println("���� ���� �ݴ� �� �����Դϴ�.");
			}
		}
	}
}
