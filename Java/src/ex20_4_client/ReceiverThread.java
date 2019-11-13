package ex20_4_client;
import java.io.*;
import java.net.*;
public class ReceiverThread extends Thread {
	Socket socket;
	
	ReceiverThread(Socket socket){
		this.socket = socket;
	}
	
	public void run() {
		try {
			BufferedReader reader = new BufferedReader(
	                new InputStreamReader(socket.getInputStream()));
			
			while(true) {
				//�����κ��� �޽����� �����մϴ�.
				String str = reader.readLine();
				//������ ������ �������� null�� �����մϴ�.
				if(str == null)
					break;
				//���ŵ� �޽����� ����ͷ� ����մϴ�.
				System.out.println("����>" + str);
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
