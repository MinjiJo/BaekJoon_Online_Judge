package homework;

import java.util.Scanner;

public class Homework_190819_4_answer {
	public static void main(String[] args) {
		//약수란 어떤 수를 나누었을 때 나머지가 0이 되게 하는 자연수입니다.
		System.out.println("약수를 구할 수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int su = sc.nextInt();
		
		System.out.println("****"+su+"의 약수를 출력합니다.*****");
		
		for(int i=1; i<=su; i++) {
			if(su % 1 == 0)
				System.out.print(i + " ");
		}
		
		/*
		 for(int i = 1; i <= su ; i++){
		 	System.out.print(su % 1 == 0 ? i+" " : "");
		 }
		 */
		sc.close();
	}
}
