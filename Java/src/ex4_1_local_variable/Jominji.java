package ex4_1_local_variable;
import java.io.InputStream;
import java.util.Scanner;

public class Jominji {
	public static void main(String[] args) {
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		final double PI = 3.14;
		double r;

		System.out.print("������ �Է��ϼ���>");
		r = sc.nextInt();
		
		System.out.println("������ = " + PI);
		System.out.println("������ = " + r);
		System.out.printf("���� �ѷ� = %.2f", 2*PI*r);
		System.out.printf("\n���� ���� = %.2f", PI*r*r);
		
		sc.close();
	}
}
