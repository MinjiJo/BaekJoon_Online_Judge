package ex5_1_if;

import java.util.Scanner;

public class IfTestGrade {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���>");
		float num = sc.nextFloat(); // ctrl+shift+F : �鿩���� ����Ű

		if (num >= 90) {
			System.out.println("������ A�Դϴ�.");
		} else if (num >= 80) {
			System.out.println("������ B�Դϴ�.");
		} else if (num >= 70) {
			System.out.println("������ C�Դϴ�.");
		} else if (num >= 60) {
			System.out.println("������ D�Դϴ�.");
		} else {
			System.out.println("������ F�Դϴ�.");
		}

		sc.close();

	}
}
