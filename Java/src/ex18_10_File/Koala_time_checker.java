package ex18_10_File;
import java.io.*;
public class Koala_time_checker {
	public static void main(String[] args) {
			long start = System.currentTimeMillis();
			String originaldir = "d:\\temp";
			String targetdir = "d:\\temp2";
			String originalFileName = "koala.jpg";
			String targetFileName = "koala_copy.jpg";
			BufferedInputStream in = null;
			BufferedOutputStream out = null;
			
			try {
				in = new BufferedInputStream(
						new FileInputStream(originaldir + "\\" + originalFileName));
				File to = new File(targetdir);
				if(!to.exists()) {
					to.mkdir();
				}
				
				out = new BufferedOutputStream(
						new FileOutputStream(targetdir + "\\" + targetFileName));
				
				int readCount;
				byte[] readBytes = new byte[1024];
				
				while((readCount = in.read(readBytes)) != -1) {
					//while(readCount != -1) {
					//1. write(byte[] b)
					out.write(readBytes);//1024����Ʈ�� ��� ��Ʈ������ �����ϴ�.
					
					//2. write(byte[] b, int off, int len)
					// fos.write(readBytes, 0, readCount);
					//�迭 readBytes[0]���� readCount��ŭ�� ����Ʈ�� ��½�Ʈ������ �����ϴ�.
				}
				System.out.println("���簡 ��~ �Ǿ����ϴ�.");
				
			} catch (FileNotFoundException fnfe) {
				System.out.println("������ �������� �ʽ��ϴ�.");
			} catch (IOException ioe) { // Exception - IOException
				System.out.println("������ ���� �� �����ϴ�.");
			} catch (NullPointerException n) { // Exception - RuntimeException
				System.out.println("NullPointerException ���� �߻�");
			}
			finally {
				try {
					if(in != null) in.close();
					if(out != null) out.close();
					System.out.println("���� ���纻�� �����߽��ϴ�.");
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			long end = System.currentTimeMillis();
			System.out.println("�ҿ�ð� : " + (end - start) + "ms");
	}
}
