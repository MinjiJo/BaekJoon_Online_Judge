package ex5_2_switch;

import java.util.Scanner;

public class Jominji {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요.>");
		int num = sc.nextInt();
		String grade;
		
		switch (num/5) {
		case 20:
		case 19:
			grade = "A+";
			break;

		case 18:
			grade = "A0";
			break;

		case 17:
			grade = "B+";
			break;

		case 16:
			grade = "B0";
			break;

		case 15:
			grade = "C+";
			break;

		case 14:
			grade = "C0";
			break;

		case 13:
			grade = "D+";
			break;

		case 12:
			grade = "D0";
			break;

		default:
			grade = "F";
		}

		System.out.println("학점:" + grade);
		sc.close();
	}
}
