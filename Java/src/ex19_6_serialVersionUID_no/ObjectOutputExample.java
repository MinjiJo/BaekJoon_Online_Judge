package ex19_6_serialVersionUID_no;
import java.io.*;
public class ObjectOutputExample {
	public static void main(String args[]) {
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(
					new FileOutputStream("output10.dat"));
			Rectangle obj = new Rectangle(100, 200);
			System.out.println("����: " + obj.width);
			System.out.println("����: " + obj.height);
			out.writeObject(obj);
		}catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}finally {
			try {
				out.close();
			} catch (Exception e) {
				System.out.println("���� �ݴ� �� �����Դϴ�.");
			}
		}
	}
}
