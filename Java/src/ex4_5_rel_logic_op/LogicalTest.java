package ex4_5_rel_logic_op;

import java.io.InputStream;
import java.util.Scanner;

public class LogicalTest {
	public static void main(String[] args) {
		InputStream in = System.in;
		Scanner sc = new Scanner(in);
		int num;
		
		System.out.println("���̸� �Է��ϼ���>");
		num = sc.nextInt();
		
		if (num>=1 && num<=9) {
			System.out.println("10�� �̸�");
		} else if (num>=10 && num<=19) {
			System.out.println("10��");
		} else if (num>=20 && num<=29) {
			System.out.println("20��");
		} else if (num>=30 && num<=39) {
			System.out.println("30��");
		} else if (num>=40 && num<=49) {
			System.out.println("40��");
		} else {
			System.out.println("50�� �̻�");
		}
		
		sc.close();
	}
}
