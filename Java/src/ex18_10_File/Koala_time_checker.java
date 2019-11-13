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
					out.write(readBytes);//1024바이트를 출력 스트림으로 보냅니다.
					
					//2. write(byte[] b, int off, int len)
					// fos.write(readBytes, 0, readCount);
					//배열 readBytes[0]부터 readCount만큼의 바이트를 출력스트림으로 보냅니다.
				}
				System.out.println("복사가 잘~ 되었습니다.");
				
			} catch (FileNotFoundException fnfe) {
				System.out.println("파일이 존재하지 않습니다.");
			} catch (IOException ioe) { // Exception - IOException
				System.out.println("파일을 읽을 수 없습니다.");
			} catch (NullPointerException n) { // Exception - RuntimeException
				System.out.println("NullPointerException 예외 발생");
			}
			finally {
				try {
					if(in != null) in.close();
					if(out != null) out.close();
					System.out.println("사진 복사본을 저장했습니다.");
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			long end = System.currentTimeMillis();
			System.out.println("소요시간 : " + (end - start) + "ms");
	}
}
