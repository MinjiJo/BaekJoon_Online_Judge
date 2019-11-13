package ex4_1_local_variable;
import java.io.InputStream;
import java.util.Scanner;

public class Jominji {
	public static void main(String[] args) {
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		final double PI = 3.14;
		double r;

		System.out.print("정수를 입력하세요>");
		r = sc.nextInt();
		
		System.out.println("원주율 = " + PI);
		System.out.println("반지름 = " + r);
		System.out.printf("원의 둘레 = %.2f", 2*PI*r);
		System.out.printf("\n원의 넓이 = %.2f", PI*r*r);
		
		sc.close();
	}
}
