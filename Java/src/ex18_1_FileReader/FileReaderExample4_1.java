package ex18_1_FileReader;
import java.io.*;
public class FileReaderExample4_1 {
	public static void main(String args[]) {
		FileReader reader = null;
		char arr[] = new char[64]; //���Ͽ� �ִ� ���ڸ� ���� char�迭
		try {
			reader = new FileReader("������ ��.txt");
			
			while(true) {
				// Returns: The number of characters read
				// arr�� �迭 ũ�� ��ŭ ���ڸ� �о� arr�� ������ �� ���� ������ ��ȯ�մϴ�.
				int num = reader.read(arr);
				if (num == -1) // �� �̻� ���� ���ڰ� ���� ��� -1�� �����մϴ�.
					break;
				
				for (int cnt = 0; cnt < num; cnt++) {
					System.out.printf("%c", arr[cnt]);
				} // for end
			}// while end
		}
		catch (FileNotFoundException fnfe) { // FileReader() �����ڰ� �߻���
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch (IOException ioe) { // read() �޼ҵ尡 �߻��� ���� ó��
			System.out.println("������ ���� �� �����ϴ�.");
		} catch (NullPointerException npe) {
			System.out.println("NullPointerException");
		}
		finally { // ������ �ݴ� ��ɹ��� ������ ������� ó���ϱ� ���� finally ���� ó��
			try {
				reader.close();
			} catch (Exception e) {
				System.out.println("Exception");
			}
		}
	}
}
