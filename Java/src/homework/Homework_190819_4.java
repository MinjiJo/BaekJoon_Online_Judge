package homework;

import java.util.Scanner;

public class Homework_190819_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����� ���� ���� �Է��ϼ���>");
		
		int n = sc.nextInt();
		
		System.out.println("*****" + n + "�� ����� ����մϴ�.*****");
		
		for(int i = n; i >= 1 ; i--) {
			if(n%i==0)
				System.out.print(n/i +" ");
		}
		
		sc.close();
	}
}
