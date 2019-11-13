//��ü�� ����ȭ�ϴ� ���α׷�
//����ȭ : ��ü�� ��Ʈ��ũ�� ���� �����ϰų� ���Ͽ� �����ϱ� ���ؼ�
//��ü�� ��Ʈ������ ����� �۾��� �ʿ��մϴ�.
//�̷� �۾��� �ڹٿ����� ��ü�� ����ȭ(serialization)��� �մϴ�.
package ex19_1_Serialization;
import java.io.*;
import java.util.*;
public class ObjectOutputExample1 {
	public static void main(String args[]) {
		//������ ���ϴ�.
		//ObjectOutputStream Ŭ������ ��ü�� ��Ʈ������ ���� ����ϴ� �����
		//�ִ� Ŭ�����Դϴ�.
		//�� Ŭ�������� �����͸� ���Ͽ� �����ϴ� ����� ���� ������
		//FileOutputStream Ŭ������ �Բ� ����ؾ� �մϴ�.
		//FileOutputStream ��ü�� �����ؼ�
		//ObjectOutputStream Ŭ������ ������ �Ķ���ͷ� �Ѱ��־�� �մϴ�.
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(
					new FileOutputStream("output.dat"));

			//��ü�� ����ȭ �ϴ� �κ�
			//writeObject �޼ҵ� : �Ķ���ͷ� �Ѱ��� ��ü�� ��Ʈ������ ���� ����ϴ� �޼ҵ�
			//�Ķ���ͷ� �Ѱ��� ��ü�� ���Ͽ� ����˴ϴ�.
			//GregorianCalendar ��ü�� �����ؼ� ���Ͽ� ���ϴ�.
			out.writeObject(new GregorianCalendar(2019, 0, 14));
			out.writeObject(new GregorianCalendar(2019, 0, 15));
			out.writeObject(new GregorianCalendar(2019, 0, 16));
		}
		catch(IOException ioe) {
			System.out.println("������ ����� �� �����ϴ�.");
		}
		finally {
			try {
				out.close();//������ �ݽ��ϴ�.
			}
			catch (Exception e) {
				System.out.println("������ �ݴ� �� ���� �߻��߽��ϴ�.");
			}
		}
	}
}
