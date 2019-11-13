package ex18_6_Buffered_Stream;
import java.io.*;
public class BufferedOutputStreamExample1 {
	public static void main(String args[]) {
		BufferedOutputStream out = null;
		try {
			out = new BufferedOutputStream(
					new FileOutputStream("output.txt"));//파일을 연다.
			byte arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
						   10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
			
			//파일을 반복해서 byte타입 데이터를 쓴다.
			for (int cnt = 0; cnt < arr.length; cnt++)
				out.write(arr[cnt]);
		}
		catch(IOException ioe) {
			System.out.println("파일로 출력할 수 없습니다.");
		} finally {
			try {
				out.close();
				System.out.println("파일을 저장했습니다.");
			} catch(Exception e) {
				System.out.println("파일 닫는 중 오류입니다.");
			}
		}
	}
}
