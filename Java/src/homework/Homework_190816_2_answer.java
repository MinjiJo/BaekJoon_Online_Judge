package homework;

import java.util.Scanner;

public class Homework_190816_2_answer {

	public static void main(String[] args) {
		System.out.println("������ �Է��ϼ���>");
		
		// Scanner ������ Ctrl+Shift+o �����ּ���
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		
		s = s / 5;
		switch (s) {
		case 20:
		case 19:
			System.out.println("A+����");
			break;
		case 18:
			System.out.println("A����");
			break;
		case 17:
			System.out.println("B+����");
			break;	
		case 16:
			System.out.println("B����");
			break;
		case 15:
			System.out.println("C+����");
			break;
		case 14:
			System.out.println("C����");
			break;
		case 13:
			System.out.println("D+����");
			break;
		case 12:
			System.out.println("D����");
			break;
		default:
			System.out.println("F����");
			
		sc.close();
		}
	}
}
