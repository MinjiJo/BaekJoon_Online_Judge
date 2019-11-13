package ex20_4_client;
import java.io.*;
import java.net.*;
public class SenderThread extends Thread{
	Socket socket;
	String name;
	SenderThread(Socket socket, String name){ //수정
		this.socket = socket;
		this.name = name; //추가
	}
	public void run() {
		try{
			BufferedReader reader = new BufferedReader(
	                new InputStreamReader(System.in));
		
			PrintWriter writer = 
	                new PrintWriter(socket.getOutputStream());
			//추가
			//제일 먼저 서버로 대화명을 송신합니다.
			writer.println(name);
			writer.flush();
			
			//키보드로 입력된 메시지를 송출해줍니다.
			while( true ) {
				//키보드로부터 문자열을 입력받습니다.
				String str = reader.readLine();
				
				//사용자가 "bye"라고 입력하면 반복문을 빠져나갑니다.
				if (str.equals("bye"))
					break;
				
				//입력된 문자열을 서버로 송신합니다.
				writer.println(str);
				writer.flush();
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				socket.close();
			}catch(Exception ignored) {
				System.out.println("소켓 닫는 중 에러입니다.");
			}
		}
	}
}
