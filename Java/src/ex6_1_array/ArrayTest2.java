package ex6_1_array;

import java.util.Scanner;

public class ArrayTest2 {
	public static void main(String[] args) {
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("���� 5���� �Է��ϼ���>");
				
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
				
		int[] score = new int[5];
		int score[] = {a,b,c,d,e};
		
		int sum = 0;
		float ave = 0;
		for(int i = 0; i<score.length; i++) {
			sum += score[i];
			ave = (float)(sum)/5;
		}
		
		System.out.println("�� = " + sum);
		System.out.println("��� = " + ave);
		
		sc.close();
		*/
		
		int sum = 0;
		double avg = 0;
		
		int[] score = new int[5];
		
		System.out.println("���� 5���� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
			sum = sum + score[i];
		}
		
		avg=(double)sum/(score.length);// avg=(double)sum/5.0;
		System.out.println("�� = " + sum + "\n��� = " + avg);
		sc.close();
	}
}
