//��� ���迡 �ִ� �� ������ Exception�� ó���ϴ� try~catch��
//���� ó�� ������ �ڽĿ��� �θ� ������ �ۼ��մϴ�.
//FileNotFoundException -> IOException
//�� �� �߻��� ������ ������ ��ġ�ϴ� �� �� ���� catch���� ����˴ϴ�.
//�ͼ��� �Ķ������ �������� �����ִ� ��
//�ͼ����� ó������ �ʾƼ� ������ ���� �߻��߽��ϴ�.
package ex12_1_Exception;

import java.io.*;

public class ExceptionExample8 {
	public static void main(String args[]) {
		try {
			FileReader reader = new FileReader("some.txt");
			reader.close();
		} catch (FileNotFoundException e) {
			System.err.println("������ ã�� �� �����ϴ�.");
		} catch (IOException e) {
			System.err.println("����� ������ �߻��߽��ϴ�.");
		}
	}
}
