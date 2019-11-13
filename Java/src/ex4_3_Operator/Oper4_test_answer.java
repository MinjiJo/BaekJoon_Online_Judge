package ex4_3_Operator;
import java.io.InputStream;
import java.util.Scanner;

public class Oper4_test_answer {
	public static void main(String[] args) {
		InputStream is = System.in;
		Scanner 	sc = new 	Scanner(is);
		
		int n1, n2, result;
		
		System.out.print("정수를 입력 하세요>");
		n1 = sc.nextInt();
		
		System.out.print("정수를 한 개 더 입력 하세요>");
		n2 = sc.nextInt();
		
		System.out.print("연산자(+)를 입력하세요>");
		String op = sc.next(); //next() : 키보드로부터 문자열의 ㄱ밧을 입력받는 메서드
		
		if(op.equals("+")) {
			result = n1 + n2;
			System.out.println(n1 + op + n2 + "=" + result);
		}else {
			System.out.println("+를 입력하세요");
		}
		sc.close();
	}
}
