package Study_method;

import java.util.Scanner;

public class method1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� 1�� �Է��ϼ���");
		printStr(sc);
	}

	static String inputStr(Scanner sc) {
		while (true) {
			try {
				String a = sc.nextLine();
				return "  " + a + a + a + a + a;
			} catch (Exception e) {
				System.out.print("1���� �Է��ϼ���");
			}
		}
	}

	static void printStr(Scanner sc) {
		String a = inputStr(sc);
		for (int i = 0; i < 5; i++) {
			if (i < 3) {
				System.out.println(a.substring(0, 2 - i) + a.substring(2, (i * 2 + 1) + 2));
			} else {
				System.out.println(a.substring(0, i - 2) + a.substring(i * 2 - 2, 7));
			}
		}
	}
}
