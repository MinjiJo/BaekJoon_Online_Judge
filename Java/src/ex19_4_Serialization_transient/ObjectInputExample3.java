package ex19_4_Serialization_transient;
import java.io.*;
public class ObjectInputExample3 {
	public static void main(String[] args) {
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("output3.dat"));
			while(true) {
				BBSItem obj = (BBSItem) in.readObject();//��ü�� ������ȭ�ϴ� �κ�

				System.out.println("��ü�Խù��� ��: " + BBSItem.itemNum);
				System.out.println("�۾���: " + obj.writer);
				System.out.println("�н�����: " + obj.passwd);// transient �ν��Ͻ� �ʵ�
				System.out.println("����: " + obj.title);
				System.out.println("����: " + obj.content);
			}
		} catch(FileNotFoundException fnfe){
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch(EOFException eofe) {//���Ϸκ��� �� �̻� ���� ��ü�� ���� �� �߻��ϴ� ����
			System.out.println("��");
		} catch(IOException ioe) {
			System.out.println("������ ���� �� �����ϴ�.");
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
