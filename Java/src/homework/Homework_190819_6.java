package homework;

import java.util.Scanner;

public class Homework_190819_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("������ �� ���� �Է��ϼ���>");

		int a = sc.nextInt();
		int b = sc.nextInt();
		int max, min, sum, i;

		if (a >= b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}

		sum = 0;
		for (i = min; i <= max; i++) {
			sum += i;
		}

		System.out.println(a + " ~ " + b + "�� �� = " + sum);

		sc.close();
	}
}
