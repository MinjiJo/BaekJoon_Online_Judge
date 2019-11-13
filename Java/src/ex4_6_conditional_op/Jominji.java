package ex4_6_conditional_op;

import java.util.Scanner;

public class Jominji {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 세 개를 입력하시오.>");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int a = (num1>=num2)? num1: num2;
		int b = (num2>=num3)? num2: num3;
		int max = (a>=b)? a: b;
		
		int c = (num1<=num2)? num1: num2;
		int d = (num2<=num3)? num2: num3;
		int min = (c<=d)? c: d;
		
		System.out.print("max="+max+"\nmin="+min);
		sc.close();
	}
}
