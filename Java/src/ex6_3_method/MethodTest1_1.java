package ex6_3_method;

import java.util.Scanner;

public class MethodTest1_1 {
	public static void main(String[] args) {
		int data[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 5개를 입력하세요>");
		for (int i = 0; i < data.length; i++)
			data[i] = sc.nextInt();

		System.out.println("최댓값 = " + max(data));
		System.out.println("최솟값 = " + min(data));
		sc.close();
	}

	public static int max(int data[]) {
		int max = data[0];
		for (int i = 1; i < data.length; i++) {
			if (max < data[i])
				max = data[i];
		}
		return max;
	}
	
	public static int min(int data[]) {
		int min = data[0];
		for (int i = 1; i< data.length; i++) {
			if (min > data[i])
				min = data[i];
		}
		return min;
	}
	
}
