package ex18_1_FileReader;
import java.io.*;
public class FileReaderExample4_2_try_with_resource {
	public static void main(String args[]) {
		char arr[] = new char[64]; //파일에 있는 문자를 담을 char배열
		/*
		   1. try-with-resource문으로 try()괄호 안에 선언된 자원은
		   		try문이 끝날 때 자동으로 close() 메서드를 호출합니다.
		   2. try-with-resource문에 의해 자동으로
		   		객체의 close()가 호출될 수 있으려면 클래스가
		   		AutoCloseable이라는 인터페이스를 구현한 것이어야 합니다.
		   형식) try(){
		   		.....
		   	}catch(){
		   	
		   	}finally{}
		 */
		try(
				FileReader reader = new FileReader("거위의 꿈.txt");
			) {
			while (true) {
				//Returns: The number of characters read
				int num = reader.read(arr);
				
				if (num == -1)	//더 이상 읽을 문자가 없을 경우 -1을 리턴합니다.
					break;
				
				//arr의 0부터 num개 만큼 스트링으로 만든 후 출력
				System.out.print(new String(arr, 0, num));
			}//while end
		}//try end
		catch (FileNotFoundException fnfe) { //
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException ioe) { // Exception - IOException
			System.out.println("파일을 읽을 수 없습니다.");
		} catch (NullPointerException n) { //Exception - RuntimeException
			System.out.println("NullPointerException 예외 발생");
		} finally {
			System.out.println("final입니다.");
		}
	}
}
