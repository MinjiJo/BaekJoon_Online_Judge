package ex6_2_method_intro;

import java.util.Scanner;

public class MethodExample3 {

	public static void main(String[] args) {
		System.out.print("������ �Է� �ϼ���>");
		Scanner sc = new Scanner(System.in);
		int inputdata = sc.nextInt();
		int result = abs(inputdata);
		System.out.println("���밪 : " + result);
		sc.close();
	}

	public static int abs(int data) {// ���밪 ���ϴ� �޼ҵ�

		if (data < 0)
			data = -data;

		return data;
	}
}
