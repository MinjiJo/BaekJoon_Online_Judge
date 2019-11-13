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
				System.out.println("복사가 잘~ 되었습니다.");
				
			} catch (FileNotFoundException fnfe) {
				System.out.println("파일이 존재하지 않습니다.");
			} catch (IOException ioe) {
				System.out.println("파일을 읽을 수 없습니다.");
			} catch (NullPointerException n) {
				System.out.println("NullPointerException 예외 발생");
			}
			finally {
				try {
					if(fis != null) fis.close();
					if(fos != null) fos.close();
					System.out.println("사진 복사본을 저장했습니다.");
				} catch(Exception e) {
					System.out.println("사진 닫는 중 오류입니다.");
				}
			}
			long end = System.currentTimeMillis();
			System.out.println("소요시간 : " + (end - start) + "ms");
	}
}
