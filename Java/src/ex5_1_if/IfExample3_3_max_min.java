package ex5_1_if;

import java.util.Scanner;

public class IfExample3_3_max_min {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("세 개의 정수를 입력하세요>");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int max = num1; //초기화는 입력하는 값 중에 하나로 넣어 주어야 함
		if (num1 >= num2 && num1 >= num3) {
			max = num1;
		} else if (num2 >= num1 && num2 >= num3) {
			max = num2;
		} else {
			max = num3;
		}
		
		int min = num1;
		if (num1 <= num2 && num1 <= num3) {
			min = num1;
		} else if (num2 <= num1 && num2 <= num3) {
			min = num2;
		} else {
			min = num3;
		}
		
		System.out.println("max=" + max);
		System.out.println("min=" + min);
		
		/*
		if(((num1 > num2) && (num1 > num3)) || ((num1 == num2) && (num1 > num3)) || ((num1 == num3) && (num1 > num2))) {
			System.out.println("max=" + num1);
		} else if(((num2 > num1) && (num2 > num3)) || ((num2 == num3) && (num2 > num1)) || ((num2 == num1) && (num2 > num3))) {
			System.out.println("max=" + num2);
		} else if(((num3 > num1) && (num3 > num1)) || (num1 == num2) && (num2== num3)) {
			System.out.println("max=" + num3);
		}
		*/
		
		sc.close();
	}
}
