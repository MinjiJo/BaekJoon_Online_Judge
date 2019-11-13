package homework;

import java.util.Scanner;

public class Homework_190819_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("약수를 구할 수를 입력하세요>");
		
		int n = sc.nextInt();
		
		System.out.println("*****" + n + "의 약수를 출력합니다.*****");
		
		for(int i = n; i >= 1 ; i--) {
			if(n%i==0)
				System.out.print(n/i +" ");
		}
		
		sc.close();
	}
}
