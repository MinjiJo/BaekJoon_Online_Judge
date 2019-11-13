package homework;

import java.util.Scanner;

public class Homework_190816_2_answer {

	public static void main(String[] args) {
		System.out.println("정수를 입력하세요>");
		
		// Scanner 위에서 Ctrl+Shift+o 눌러주세요
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		
		s = s / 5;
		switch (s) {
		case 20:
		case 19:
			System.out.println("A+학점");
			break;
		case 18:
			System.out.println("A학점");
			break;
		case 17:
			System.out.println("B+학점");
			break;	
		case 16:
			System.out.println("B학점");
			break;
		case 15:
			System.out.println("C+학점");
			break;
		case 14:
			System.out.println("C학점");
			break;
		case 13:
			System.out.println("D+학점");
			break;
		case 12:
			System.out.println("D학점");
			break;
		default:
			System.out.println("F학점");
			
		sc.close();
		}
	}
}
