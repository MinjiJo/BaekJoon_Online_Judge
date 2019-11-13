package ex6_2_method_intro;

import java.util.Scanner;

public class MethodExample3 {

	public static void main(String[] args) {
		System.out.print("정수를 입력 하세요>");
		Scanner sc = new Scanner(System.in);
		int inputdata = sc.nextInt();
		int result = abs(inputdata);
		System.out.println("절대값 : " + result);
		sc.close();
	}

	public static int abs(int data) {// 절대값 구하는 메소드

		if (data < 0)
			data = -data;

		return data;
	}
}
