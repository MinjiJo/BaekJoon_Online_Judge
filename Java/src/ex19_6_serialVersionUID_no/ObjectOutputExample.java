package ex19_6_serialVersionUID_no;
import java.io.*;
public class ObjectOutputExample {
	public static void main(String args[]) {
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(
					new FileOutputStream("output10.dat"));
			Rectangle obj = new Rectangle(100, 200);
			System.out.println("가로: " + obj.width);
			System.out.println("세로: " + obj.height);
			out.writeObject(obj);
		}catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}finally {
			try {
				out.close();
			} catch (Exception e) {
				System.out.println("파일 닫는 중 오류입니다.");
			}
		}
	}
}
