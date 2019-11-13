//산술 연산자 %를 이용해 입력한 정수의 짝수와 홀수를 구하는 프로그램
package ex4_3_Operator;
import java.io.InputStream;
import java.util.Scanner;

public class Oper3_even_odd {

	public static void main(String[] args) {
		InputStream is = System.in;
		Scanner 	sc = new 	Scanner(is);
//		클래스명		객체	 연산자	생성자 호출
		
		System.out.print("정수를 입력하세요>");
		int n = sc.nextInt();
		
		if(n % 2 == 0) {			// 짝수
			System.out.println(n + "은 짝수입니다.");
		} else {				// 홀수
			System.out.println(n + "은 홀수입니다.");
		}
		sc.close();
		
		/*
		int data=10;
		int pandan = data % 2;
		System.out.println("data%2의 값은 " + pandan + "입니다.");
		sc.close();
		*/
		
	}
}
