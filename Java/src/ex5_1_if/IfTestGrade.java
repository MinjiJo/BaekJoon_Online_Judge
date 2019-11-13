package ex5_1_if;

import java.util.Scanner;

public class IfTestGrade {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요>");
		float num = sc.nextFloat(); // ctrl+shift+F : 들여쓰기 단축키

		if (num >= 90) {
			System.out.println("학점은 A입니다.");
		} else if (num >= 80) {
			System.out.println("학점은 B입니다.");
		} else if (num >= 70) {
			System.out.println("학점은 C입니다.");
		} else if (num >= 60) {
			System.out.println("학점은 D입니다.");
		} else {
			System.out.println("학점은 F입니다.");
		}

		sc.close();

	}
}
