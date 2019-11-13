package ex18_3_FileInputStream_FileOutputStream;
import java.io.*;
public class Koala {
	public static void main(String[] args) {
		
			FileInputStream in = null;
			FileOutputStream out = null;
			
			try {
				in = new FileInputStream("D:/temp/koala.jpg");
				out = new FileOutputStream("D:/temp2/koala_copy.jpg");
				
				byte arr[] = new byte[20];
				while(true) {
					int num = in.read(arr);
					
					if(num == -1)
						break;
					
					for (int cnt = 0; cnt < num; cnt++)
						out.write(arr[cnt]);
				}
				
			}catch(IOException ioe) {
				System.out.println("사진 경로를 찾지 못했습니다.");
			} finally {
				try {
					in.close();
					out.close();
					System.out.println("사진 복사본을 저장했습니다.");
				} catch(Exception e) {
					System.out.println("사진 닫는 중 오류입니다.");
				}
			}
	}
}
