//Ŭ���̾�Ʈ ���α׷�
package ex20_1_client;
import java.io.*;
import java.net.*;
public class ClientExample1 {
	public static void main(String[] args) {
		System.out.println("����� Ŭ���̾�Ʈ �Դϴ�~");
		Socket socket = null;
		try {
			//�����ڸ� ȣ���ϸ� �� ������ �ȿ��� ���� ���α׷����� ���� ��û�� ���۵ǰ�
			//�� ��� Ŭ���̾�Ʈ ���α׷��� ���� ���α׷��� ������ �ξ����� �˴ϴ�.
			//������ �����մϴ�.
			socket = new Socket("192.168.40.50", 9001);
			//socket = new Socket("192.168.10.84", 9000);
			//������ ���ſ� ����� �Է� ��Ʈ�� ��ü�� �����ϴ� �޼ҵ�
			InputStream in = socket.getInputStream();
			//������ �۽ſ� ����� ��� ��Ʈ�� ��ü�� �����ϴ� �޼ҵ�
			OutputStream out = socket.getOutputStream();
			
			String str = "Hello, Yeonjin";
			//getBytes �޼ҵ�� ���ڿ��� ����Ʈ �迭�� ����� �޼ҵ��Դϴ�.
			//���ڷ� �Ѱ��� �����͸� �۽��մϴ�.
			out.write(str.getBytes());
			
			byte arr[] = new byte[128];
			in.read(arr);	//�����͸� �����մϴ�.
			System.out.println(new String(arr));//���ŵ� �����͸� ����մϴ�.
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				socket.close();	//������ �ݽ��ϴ�.
			}catch(Exception e) {
				System.out.println("���� �ݴ� �� �����Դϴ�.");
			}
		}
	}
}
