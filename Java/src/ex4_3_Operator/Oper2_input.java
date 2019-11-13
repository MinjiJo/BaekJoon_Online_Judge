//값을 입력하는 Scanner 클래스를 사용해 봅시다.
//Scanner 클래스는 java.util 패키지에 있습니다.
//nextInt() : 키보드로부터 정수형의 값을 입력 받는 메서드입니다.
package ex4_3_Operator;
import java.io.InputStream;
import java.util.Scanner;

public class Oper2_input {
	public static void main(String[] args) {
		//System.in은 키보드로 데이터를 입력 받을 때 사용합니다.
		InputStream is = System.in;
//		클래스명		객체		연산자	생성자 호출		
		Scanner 	sc	 =	 new 	Scanner(is);
		
		System.out.print("정수를 입력 하세요>");//정수 입력 후 엔터
		int a = sc.nextInt();//정수를 읽어 변수 a에 저장합니다.
		
		System.out.println("입력값은 " + a + "입니다.");
		
		System.out.print("정수를 입력 하세요>");
		int b = sc.nextInt();
		
		System.out.println("입력값은 " + b + "입니다.");
		sc.close();
	}
}
