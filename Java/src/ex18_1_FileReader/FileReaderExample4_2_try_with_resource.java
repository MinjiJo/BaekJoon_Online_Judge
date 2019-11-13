package ex18_1_FileReader;
import java.io.*;
public class FileReaderExample4_2_try_with_resource {
	public static void main(String args[]) {
		char arr[] = new char[64]; //���Ͽ� �ִ� ���ڸ� ���� char�迭
		/*
		   1. try-with-resource������ try()��ȣ �ȿ� ����� �ڿ���
		   		try���� ���� �� �ڵ����� close() �޼��带 ȣ���մϴ�.
		   2. try-with-resource���� ���� �ڵ�����
		   		��ü�� close()�� ȣ��� �� �������� Ŭ������
		   		AutoCloseable�̶�� �������̽��� ������ ���̾�� �մϴ�.
		   ����) try(){
		   		.....
		   	}catch(){
		   	
		   	}finally{}
		 */
		try(
				FileReader reader = new FileReader("������ ��.txt");
			) {
			while (true) {
				//Returns: The number of characters read
				int num = reader.read(arr);
				
				if (num == -1)	//�� �̻� ���� ���ڰ� ���� ��� -1�� �����մϴ�.
					break;
				
				//arr�� 0���� num�� ��ŭ ��Ʈ������ ���� �� ���
				System.out.print(new String(arr, 0, num));
			}//while end
		}//try end
		catch (FileNotFoundException fnfe) { //
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch (IOException ioe) { // Exception - IOException
			System.out.println("������ ���� �� �����ϴ�.");
		} catch (NullPointerException n) { //Exception - RuntimeException
			System.out.println("NullPointerException ���� �߻�");
		} finally {
			System.out.println("final�Դϴ�.");
		}
	}
}
