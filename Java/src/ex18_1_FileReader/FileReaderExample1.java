//텍스트 파일을 읽는 프로그램 - 에러 발생
/*
 * java.lang.Object
		java.io.reader
			java.io.InputStreamReader
				java.io.FileReader
 */
//FileReader 생성자, read method 예외 처리
package ex18_1_FileReader;
import java.io.*;
class FileReaderExample1 {
	public static void main(String args[]) {
		//1. 파일을 엽니다.
		/* 생성자 인자값으로 파일의 위치를 지정합니다.
		   지정 방법 : 상대경로와 절대 경로 지정
		   1)상대경로 : 프로젝트 경로를 기준으로 차례대로 파일의 위치를 지정합니다.
		   2)절대경로 : 드라이브명부터 차례대로 파일의 위치를 지정합니다.
		   		예) D:/작업폴더/프로젝트/poem.txt 의미
		 */
//오류		FileReader reader = new FileReader("poem.txt");
		
		//절대경로 지정
		//FileReader reader =
		//new FileReader("D:workspace_java/java/poem.txt");
		
		//2. 파일을 읽어서 처리합니다.
		while (true) {
			//read() : 파일에 있는 문자 하나를 읽어서 리턴하는 메소드
//오류			int data = reader.read();
//			if (data == -1) //더 이상 읽을 데이터가 없는 경우
//				break;
//			char ch = (char) data;
//			System.out.print(ch);
		}
		
		//3. 파일을 닫습니다.
//오류		reader.close();
	}
}
