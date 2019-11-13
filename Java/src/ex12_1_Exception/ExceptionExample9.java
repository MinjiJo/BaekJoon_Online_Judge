//��� ���迡 �ִ� �� ������ Exception�� ó���ϴ� try~catch��
//���� ó�� ������ �ڽĿ��� �θ� ������ �ۼ��մϴ�.
//FileNotFoundException -> IOException
//�� �� �߻��� ������ ������ ��ġ�ϴ� �� �� ���� catch���� ����˴ϴ�.
package ex12_1_Exception;

import java.io.*;

public class ExceptionExample9 {
	public static void main(String args[]) {
		FileReader reader = null;
		try {
			//java.io.FileReader.FileReader(String fileName)
			//throws FileNotFoundException
			//FileNotFoundExsception �߻��ϴ� �κ�
			reader = new FileReader("some.txt");
            //reader.close();
		}
		//FileNotFoundException�� IOException�� ����Ŭ������
		//FileNotFoundException�� ���� �� �ֽ��ϴ�.
		catch (IOException e) {
			System.err.println("����� ������ �߻��߽��ϴ�.");
		} 
		//�̹� �θ� IOException���� �ڽ� FileNotFoundException��
		//ó���� �� �ֱ� ������ �� �κ��� �ʿ�����ϴ�.
		/*
		catch (FileNotFoundException e) {
			System.err.println("������ ã�� �� �����ϴ�.");
		} 
		*/
		
		finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
