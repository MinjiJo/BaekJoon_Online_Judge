package ex11_9_Scanner;

import java.util.Scanner;

public class ScannerExample4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			
			try {
				System.out.print("������ �Է��ϼ���>"); // ����� ���α�
				int num = sc.nextInt();
				System.out.println("�Է��� ������ " + num  + "�Դϴ�.");
			} catch (java.util.InputMismatchException e) {
				System.out.println("���ڸ� �Է��ϼž� �մϴ�.");
				sc.nextLine();
			}
		}
		//sc.close();
	}
}
