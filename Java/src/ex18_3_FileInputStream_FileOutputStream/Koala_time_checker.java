package ex18_3_FileInputStream_FileOutputStream;
import java.io.*;
public class Koala_time_checker {
	public static void main(String[] args) {
			long start = System.currentTimeMillis();
			String originalFileName = "D:/temp/koala.jpg";
			String targetFileName = "D:/temp2/koala_copy.jpg";
			FileInputStream fis = null;
			FileOutputStream fos = null;
			
			try {
				fis = new FileInputStream(originalFileName);
				fos = new FileOutputStream(targetFileName);
				
				int readCount;
				byte[] readBytes = new byte[1024];
				
				while(true) {
					readCount = fis.read(readBytes);
					if(readCount == -1)
						break;
					fos.write(readBytes);
				}
				System.out.println("���簡 ��~ �Ǿ����ϴ�.");
				
			} catch (FileNotFoundException fnfe) {
				System.out.println("������ �������� �ʽ��ϴ�.");
			} catch (IOException ioe) {
				System.out.println("������ ���� �� �����ϴ�.");
			} catch (NullPointerException n) {
				System.out.println("NullPointerException ���� �߻�");
			}
			finally {
				try {
					if(fis != null) fis.close();
					if(fos != null) fos.close();
					System.out.println("���� ���纻�� �����߽��ϴ�.");
				} catch(Exception e) {
					System.out.println("���� �ݴ� �� �����Դϴ�.");
				}
			}
			long end = System.currentTimeMillis();
			System.out.println("�ҿ�ð� : " + (end - start) + "ms");
	}
}
