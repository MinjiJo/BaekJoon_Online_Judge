package homework;

import java.util.Scanner;

public class Homework_190819_4_answer {
	public static void main(String[] args) {
		//����� � ���� �������� �� �������� 0�� �ǰ� �ϴ� �ڿ����Դϴ�.
		System.out.println("����� ���� ���� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		int su = sc.nextInt();
		
		System.out.println("****"+su+"�� ����� ����մϴ�.*****");
		
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
