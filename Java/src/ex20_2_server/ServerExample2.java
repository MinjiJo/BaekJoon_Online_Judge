//���� ���α׷��� ���� �����ϰ� Ŭ���̾�Ʈ ���α׷��� �����մϴ�.
package ex20_2_server;
import java.io.*;
import java.net.*;
public class ServerExample2 {
	public static void main(String[] args) {
		System.out.println("����� ���� �Դϴ�~");
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			serverSocket = new ServerSocket(9000);//���� ������ �����մϴ�.
			socket = serverSocket.accept();
		/*
		 InputStreamReader Ŭ����:
		 ����Ʈ ��Ʈ���� ���� ��Ʈ������ �ٲپ��ִ� Ŭ����
		 �� Ŭ������ �����ڿ� �������κ��� ���� InputStream ��ü�� �Ѱ� �ָ�
		 ��Ʈ��ũ�� ���ŵ� �����͸� ���� ��Ʈ�� ���·� ���� �� �ִ�
		 InputStreamReader��ü�� �����˴ϴ�.
		 */
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
		/*
		 PrintWriter Ŭ������ �̿��Ͽ� ���� ��Ʈ���� ����Ʈ ��Ʈ������ �ٲپ
		 ����ϱ� ���ؼ��� �� Ŭ������ �����ڿ� OutputStream Ÿ���� ��ü�� �Ķ���ͷ�
		 �Ѱ��־�� �մϴ�.
		 */
			PrintWriter writer = 
					new PrintWriter(socket.getOutputStream());
			
			//�����͸� �����մϴ�.
			String str = reader.readLine();
			
			//�����͸� ȭ�鿡 ����մϴ�.
			System.out.println(str);
			
			//�����͸� �۽��մϴ�.
			writer.println("Hello, Client2");
			
		/*
		 PrintWriter Ŭ������ println() �޼ҵ�� ���ڿ��� ����ϸ� �� ���ڿ���
		 �޼ҵ� ȣ�� ��� ��Ʈ��ũ�� �۽ŵǴ� ���� �ƴ϶� ���۰� �� �� ������ ������ٰ�
		 �Ѳ����� �۽ŵ˴ϴ�.
		 �׷��� println() �޼ҵ带 ȣ���� ������ �ٷ� ���ڿ��� �۽ŵǵ��� �Ϸ���
		 flush �޼ҵ带 ȣ���ؾ� �մϴ�.
		 */
			writer.flush();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				socket.close();//������ �ݽ��ϴ�.
			}catch(Exception ignored){
				System.out.println("���� �ݴ� �� �����Դϴ�.");
			}
			try {
				serverSocket.close();//���� ������ �ݽ��ϴ�.
			}catch(Exception ignored) {
				System.out.println("���� ���� �ݴ� �� �����Դϴ�.");
			}
		}
	}
}
