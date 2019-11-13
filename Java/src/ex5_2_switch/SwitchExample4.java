//SwitchExample4.java를 이용해서
//두 개의 정수와 연산자를 입력받아 연산자에 따른 결과 출력하는 프로그램
/*
	정수 1를 입력하세요>10
	정수 2를 입력하세요>2
	연산자를 입력하세요>+
	10+2=12
	
	단, 연산자가 "+", "-", "*", "/", "%" 이외인 경우
	"+, -, *, /, % 중 한개를 입력하세요."를 출력합니다.
 */
package ex5_2_switch;

import java.util.Scanner;

public class SwitchExample4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요.>");
		int n1 = sc.nextInt();
		
		System.out.print("정수를 한 개 더 입력하세요.>");
		int n2 = sc.nextInt();
		
		System.out.print("연산자(+, -, *, /, %) 중 하나를 선택하여 입력하세요>");
		String op = sc.next();
		
		int result;
		
		switch(op) {
		case "+" :
			result = n1 + n2;
			System.out.println(n1+op+n2+"="+result);
			break;
			
		case "-" :
			result = n1 - n2;
			System.out.println(n1+op+n2+"="+result);
			break;
			
		case "*" :
			result = n1 * n2;
			System.out.println(n1+op+n2+"="+result);
			break;
			
		case "/" :
			double result2 = (double)n1 / n2;
			System.out.println(n1+op+n2+"="+result2);
			break;
			
		case "%" :
			result = n1 + n2;
			System.out.println(n1+op+n2+"="+result);
			break;
			
		default :
			System.out.println("연산자(+, -, *, /, %) 중 하나를 선택하여 입력하세요.");
		}
		
		sc.close();
	}
}
