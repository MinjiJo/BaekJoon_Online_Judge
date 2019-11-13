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

class FileReaderExample2_solution {
	public static void main(String args[]) {
		// reader 변수를 finally 문에서 사용하기 위해 try문 전에 선언
		FileReader reader = null;
		try {
			//reader = new FileReader("F:\\JAVA\\Java\\src\\poem.txt");
			// FileReader reader = new FileReader("D:\\작업폴더\\프로젝트명\\src\\poem.txt);
			// FileReader reader = new FileReader("D:/work/Java/src/ex18_1/poem.txt);
			while (true) {
				// read() : 파일에 있는 문자 하나를 읽어서 리턴하는 메소드
				int data = reader.read();
				if (data == -1)// 더 이상 읽을 데이터가 없는 경우
					break;
				char ch = (char) data;
				System.out.print(ch);
			}
			// reader.close(); //만약 read()메서드에서 오류가 발생하면
			// close()메서드가 실행 되지 않은 채 프로그램이 끝납니다.
		} // try end
		catch (FileNotFoundException fnfe) { // FileReader() 생성자가 발생한
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException ioe) { // read() 메소드가 발생한 예외 처리
			System.out.println("파일을 읽을 수 없습니다.");
		} catch (NullPointerException npe) {
			System.out.println("NullPointerException");
		}
		finally { // 파일을 닫는 명령문을 에러와 상관없이 처리하기 위해 finally 예외 처리
			try {
				reader.close();
			} catch (IOException e) {
				System.out.println("IOException");
			}
		}
	}
}
