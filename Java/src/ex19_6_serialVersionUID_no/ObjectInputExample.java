package ex19_6_serialVersionUID_no;
import java.io.*;
public class ObjectInputExample {
	public static void main(String[] args) {
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("output10.dat"));
			Rectangle obj = (Rectangle) in.readObject();
			
			System.out.println("����: " + obj.width);
			System.out.println("����: " + obj.height);
		} catch (FileNotFoundException fnfe) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch (IOException ioe) {
			//����ȭ�� �� ����� Ŭ������ ������ȭ�� �� ����� Ŭ������ ������
			//�ٸ� �� �߻��ϴ� ���� �޽��� ����ϴ� ��
			System.out.println(ioe.getMessage());
		} catch(ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ �������� �ʽ��ϴ�.");
		} finally {
			try {
				in.close();//������ �ݽ��ϴ�.
			} catch(Exception e) {
				System.out.println("������ �ݴ� ���� ������ �߻��߽��ϴ�.");
			}
		}
	}
}
