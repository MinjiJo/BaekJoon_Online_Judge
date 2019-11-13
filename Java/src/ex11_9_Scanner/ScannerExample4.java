package ex11_9_Scanner;

import java.util.Scanner;

public class ScannerExample4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			
			try {
				System.out.print("정수를 입력하세요>"); // 서울시 종로구
				int num = sc.nextInt();
				System.out.println("입력한 정수는 " + num  + "입니다.");
			} catch (java.util.InputMismatchException e) {
				System.out.println("숫자를 입력하셔야 합니다.");
				sc.nextLine();
			}
		}
		//sc.close();
	}
}
