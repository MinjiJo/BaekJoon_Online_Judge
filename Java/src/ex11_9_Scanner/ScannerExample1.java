package ex11_9_Scanner;

import java.util.Scanner;

public class ScannerExample1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("주소를 입력해보세요>");
		System.out.println(sc.nextLine());
		sc.close();
	}
}
