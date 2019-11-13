package ex4_3_Operator;
import java.io.InputStream;
import java.util.Scanner;

public class Oper1_input {
	public static void main(String[] args) {
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.print("정수를 입력하세요>");
		int a = sc.nextInt();
		
		System.out.print("정수를 한 번 더 입력하세요>");
		int b = sc.nextInt();
		
		int result;
		
		result = a + b;
		//%-5d : 5자리를 차지하고 왼쪽부터 숫자들이 출력되며 빈자리는 공백으로 처리
		//%5d : 5자리를 차지하고 오른쪽부터 숫자들이 출력되며 빈자리는 공백으로 처리
		System.out.printf("%-5d + %5d 	= %5d\n", a, b, result);
		
		result = a - b;
		System.out.printf("%-5d - %5d 	= %5d\n", a, b, result);
		
		result = a * b;
		System.out.printf("%-5d * %5d 	= %5d\n", a, b, result);
		
		result = a / b;
		System.out.printf("%-5d / %5d	= %5d\n", a, b, result);
		
		result = a % b;
		System.out.printf("%-5d %% %5d 	= %5d\n", a, b, result);
		
		sc.close();
		
	}
}
