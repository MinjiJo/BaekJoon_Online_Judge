package ex5_2_switch;

import java.util.Scanner;

public class SwitchTestGrade {
	public static void main(String[] args) {
		
		//Scanner ������ Ctrl+Shift+o �����ּ���(import��)
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.>");
		int num = sc.nextInt();
		char grade;

		switch (num / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;

		case 8:
			grade = 'B';
			break;

		case 7:
			grade = 'C';
			break;

		case 6:
			grade = 'D';
			break;

		default:
			grade = 'F';
		}

		System.out.println(grade + "����");
		sc.close();
	}
}
