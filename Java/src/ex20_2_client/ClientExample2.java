//클라이언트 프로그램
package ex20_2_client;
import java.io.*;
import java.net.*;
public class ClientExample2 {
	public static void main(String[] args) {
		System.out.println("여기는 클라이언트 입니다~");
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
				socket.close();	//소켓을 닫습니다.
			}catch(Exception e) {
				System.out.println("소켓 닫는 중 에러입니다.");
			}
		}
	}
}
