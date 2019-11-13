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
				//서버로부터 메시지를 수신합니다.
				String str = reader.readLine();
				//소켓의 연결이 끊어지면 null을 리턴합니다.
				if(str == null)
					break;
				//수신된 메시지를 모니터로 출력합니다.
				System.out.println("수신>" + str);
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
