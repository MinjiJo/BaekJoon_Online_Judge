//Ŭ���̾�Ʈ ���α׷�
package ex20_3_;
import java.net.*;
public class ClientTest1 {
	public static void main(String[] args) {
		System.out.println("����� Ŭ���̾�Ʈ�Դϴ�");
		Socket socket = null;
		try {
			socket = new Socket("192.168.40.50", 9005);
			//�� ���� �����带 �����մϴ�.
			Thread thread1 = new SenderThread(socket);
			Thread thread2 = new ReceiverThread(socket);
			
			//�� ���� �����带 �����մϴ�.
			thread1.start();
			thread2.start();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
