//Ŭ���̾�Ʈ ���α׷�
package ex20_2_client;
import java.io.*;
import java.net.*;
public class ClientExample2 {
	public static void main(String[] args) {
		System.out.println("����� Ŭ���̾�Ʈ �Դϴ�~");
		Socket socket = null;
		try {
			socket = new Socket("192.168.40.51", 9000);
			PrintWriter writer =
					new PrintWriter(socket.getOutputStream());
						
			writer.println("Hello, Server2");
			writer.flush();
			
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			
			String str = reader.readLine();
			
			System.out.println(str);
			
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
