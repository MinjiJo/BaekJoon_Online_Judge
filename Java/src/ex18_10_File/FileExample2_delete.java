package ex18_10_File;
import java.io.*;
public class FileExample2_delete {
	public static void main(String args[]) {
		String dir = "D:\\newDirectory\\newFile.txt";
		//���� ����
		File f3 = new File(dir);
		if(f3.exists()) {
			if(f3.delete()) {
				System.out.println(f3.getPath() + " �����߽��ϴ�.");
			} else {
				System.out.println(f3.getPath() + " ���� ���� ���߽��ϴ�.");
			}
		}else {
			System.out.println(f3.getPath() + "�� �����ϰ��� �ϴ� ������ �����ϴ�.");
		}
	}
}
