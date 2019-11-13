//�ؽ�Ʈ ������ �д� ���α׷� - ���� �߻�
/*
 * java.lang.Object
		java.io.reader
			java.io.InputStreamReader
				java.io.FileReader
 */
//FileReader ������, read method ���� ó��
package ex18_1_FileReader;

import java.io.*;

class FileReaderExample2_solution {
	public static void main(String args[]) {
		// reader ������ finally ������ ����ϱ� ���� try�� ���� ����
		FileReader reader = null;
		try {
			//reader = new FileReader("F:\\JAVA\\Java\\src\\poem.txt");
			// FileReader reader = new FileReader("D:\\�۾�����\\������Ʈ��\\src\\poem.txt);
			// FileReader reader = new FileReader("D:/work/Java/src/ex18_1/poem.txt);
			while (true) {
				// read() : ���Ͽ� �ִ� ���� �ϳ��� �о �����ϴ� �޼ҵ�
				int data = reader.read();
				if (data == -1)// �� �̻� ���� �����Ͱ� ���� ���
					break;
				char ch = (char) data;
				System.out.print(ch);
			}
			// reader.close(); //���� read()�޼��忡�� ������ �߻��ϸ�
			// close()�޼��尡 ���� ���� ���� ä ���α׷��� �����ϴ�.
		} // try end
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
			} catch (IOException e) {
				System.out.println("IOException");
			}
		}
	}
}
