//상속 관계에 있는 두 종류의 Exception을 처리하는 try~catch문
//예외 처리 순서가 자식에서 부모 순으로 작성합니다.
//FileNotFoundException -> IOException
//이 중 발생한 예외의 종류와 일치하는 단 한 개의 catch블럭만 수행됩니다.
//익셉션 파라미터의 다형성을 보여주는 예
//익셉션을 처리하지 않아서 컴파일 오류 발생했습니다.
package ex12_1_Exception;

import java.io.*;

public class ExceptionExample8 {
	public static void main(String args[]) {
		try {
			FileReader reader = new FileReader("some.txt");
			reader.close();
		} catch (FileNotFoundException e) {
			System.err.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			System.err.println("입출력 에러가 발생했습니다.");
		}
	}
}
