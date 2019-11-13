package ex4_3_Operator;
import java.io.InputStream;
import java.util.Scanner;

public class Oper4_test {
	public static void main(String[] args) {
		InputStream is = System.in;
		Scanner 	sc = new 	Scanner(is);
//		클래스명		객체	 연산자	생성자 호출
		
		int n1, n2, result;
		
		System.out.print("정수를 입력하세요>");
		n1 = sc.nextInt();
		
		System.out.print("정수를 한 번 더 입력하세요>");
		n2 = sc.nextInt();
		
		System.out.print("연산자(+, -, *, /, %) 중 하나를 선택하여 입력하세요");
		String op = sc.next(); //next() : 키보드로부터 문자열의 값을 입력 받는 메서드입니다.
		
		if(op.equals("+")) {
			result = n1+n2;
		} else if(op.equals("-")) {
			result = n1-n2;
		} else if(op.equals("*")) {
			result = n1*n2;
		} else if(op.equals("/")) {
			result = n1/n2;
		} else {
			result = n1%n2;
		}
		
		System.out.println(n1 + op + n2 + "=" + result);
		
		sc.close();
	}
}