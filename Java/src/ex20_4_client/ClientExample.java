package ex20_4_client;
import java.net.*;
public class ClientExample {
	public static void main(String[] args) {
		//args �Ķ���ͷ� ��ȭ���� �Է� �޽��ϴ�.
		if (args.length != 1) {
			System.out.println("��ȭ���� �Է��ϼ���");
			return;
		}
		try {
			//������ ������ �ν��ϴ�.
			Socket socket = new Socket("192.168.40.51", 9002);
			
			//�޽��� �۽� ������ ����
			Thread thread1 = new SenderThread(socket, args[0]);
			
			//�޽��� ���� ������ ����
			Thread thread2 = new ReceiverThread(socket);
			
			//������ ����
			thread1.start();
			thread2.start();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
