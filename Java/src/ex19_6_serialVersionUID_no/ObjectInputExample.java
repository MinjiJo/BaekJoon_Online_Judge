package ex19_6_serialVersionUID_no;
import java.io.*;
public class ObjectInputExample {
	public static void main(String[] args) {
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("output10.dat"));
			Rectangle obj = (Rectangle) in.readObject();
			
			System.out.println("가로: " + obj.width);
			System.out.println("세로: " + obj.height);
		} catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException ioe) {
			//직렬화할 때 사용한 클래스와 역직렬화할 때 사용한 클래스의 버전이
			//다를 때 발생하는 에러 메시지 출력하는 곳
			System.out.println(ioe.getMessage());
		} catch(ClassNotFoundException cnfe) {
			System.out.println("해당 클래스가 존재하지 않습니다.");
		} finally {
			try {
				in.close();//파일을 닫습니다.
			} catch(Exception e) {
				System.out.println("파일을 닫는 도중 오류가 발생했습니다.");
			}
		}
	}
}
