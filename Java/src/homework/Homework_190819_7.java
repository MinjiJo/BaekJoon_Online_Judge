package homework;

import java.util.Scanner;

public class Homework_190819_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ���� ���� ������ �Է��ϼ���>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int sum = a + b + c;
		int ave = (a + b + c) / 3;
		String grade;
		
		if(ave >= 95) {
			grade = "A+����";
		} else if(ave >= 90) {
			grade = "A����";
		} else if(ave >= 85) {
			grade = "B+����";
		} else if(ave >= 80) {
			grade = "B����";
		} else if(ave >= 75) {
			grade = "C+����";
		} else if(ave >= 70) {
			grade = "C����";
		} else if(ave >= 65) {
			grade = "D+����";
		} else if(ave >= 60) {
			grade = "D����";
		} else {
			grade = "F����";
		}
		
		System.out.print("���� : " + sum + "\n" + "��� : " + ave + "\n" + "���� : " + grade);
		
		sc.close();
	}
}
