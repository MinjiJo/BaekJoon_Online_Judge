package ex4_5_rel_logic_op;

import java.io.InputStream;
import java.util.Scanner;

public class LogicalTest {
	public static void main(String[] args) {
		InputStream in = System.in;
		Scanner sc = new Scanner(in);
		int num;
		
		System.out.println("나이를 입력하세요>");
		num = sc.nextInt();
		
		if (num>=1 && num<=9) {
			System.out.println("10세 미만");
		} else if (num>=10 && num<=19) {
			System.out.println("10대");
		} else if (num>=20 && num<=29) {
			System.out.println("20대");
		} else if (num>=30 && num<=39) {
			System.out.println("30대");
		} else if (num>=40 && num<=49) {
			System.out.println("40대");
		} else {
			System.out.println("50대 이상");
		}
		
		sc.close();
	}
}
