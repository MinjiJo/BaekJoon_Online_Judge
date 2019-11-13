package homework;

import java.util.Scanner;

public class Homework_190819_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("세 개의 과목 점수를 입력하세요>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int sum = a + b + c;
		int ave = (a + b + c) / 3;
		String grade;
		
		if(ave >= 95) {
			grade = "A+학점";
		} else if(ave >= 90) {
			grade = "A학점";
		} else if(ave >= 85) {
			grade = "B+학점";
		} else if(ave >= 80) {
			grade = "B학점";
		} else if(ave >= 75) {
			grade = "C+학점";
		} else if(ave >= 70) {
			grade = "C학점";
		} else if(ave >= 65) {
			grade = "D+학점";
		} else if(ave >= 60) {
			grade = "D학점";
		} else {
			grade = "F학점";
		}
		
		System.out.print("총합 : " + sum + "\n" + "평균 : " + ave + "\n" + "학점 : " + grade);
		
		sc.close();
	}
}
