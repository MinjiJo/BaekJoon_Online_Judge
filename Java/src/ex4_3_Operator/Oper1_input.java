package ex4_3_Operator;
import java.io.InputStream;
import java.util.Scanner;

public class Oper1_input {
	public static void main(String[] args) {
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		System.out.print("������ �Է��ϼ���>");
		int a = sc.nextInt();
		
		System.out.print("������ �� �� �� �Է��ϼ���>");
		int b = sc.nextInt();
		
		int result;
		
		result = a + b;
		//%-5d : 5�ڸ��� �����ϰ� ���ʺ��� ���ڵ��� ��µǸ� ���ڸ��� �������� ó��
		//%5d : 5�ڸ��� �����ϰ� �����ʺ��� ���ڵ��� ��µǸ� ���ڸ��� �������� ó��
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
